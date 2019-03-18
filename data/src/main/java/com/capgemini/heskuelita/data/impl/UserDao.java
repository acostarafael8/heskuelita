
package com.capgemini.heskuelita.data.impl;


import java.util.List;

import com.capgemini.heskuelita.data.util.HibernateUtil;
import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.data.DataException;
import com.capgemini.heskuelita.data.IUserDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserDao implements IUserDao {


    private static SessionFactory sessionFactory;


    private static final Logger logger = LoggerFactory.getLogger (UserDao.class);

    public UserDao(SessionFactory sessionFactory) {

        super ();

        this.sessionFactory = sessionFactory;
    }

    public static void setup () {

        sessionFactory = HibernateUtil.getSessionFactory ();
    }

    public static void destroy () {

        sessionFactory.close ();
    }


    @Override
    public User login (String userName, String password) {

        Session session = null;
        final String dbUsername= userName;
        final String dbPw = password;
        User us = null;

        try {

            logger.info ("Getting a session");
            session = sessionFactory.openSession ();
            logger.info (String.format ("Finding users by name and password [%s, %s] using criteria object", dbUsername, dbPw));
            Criterion criterionUser = Restrictions.like ("userName", dbUsername);
            Criterion criterionPw = Restrictions.like ("password", dbPw);
            LogicalExpression andExp = Restrictions.and (criterionUser, criterionPw);
            List<User> list = (List<User>) session.createCriteria (User.class).add (andExp).list ();

            if(!list.isEmpty()){

                for (User e : list){

                    us = new User();
                    us.setUserName(e.getUserName());
                    us.setEmail(e.getEmail());
                    us.setFirst_name(e.getFirst_name());
                    us.setLast_name(e.getLast_name());

                }

            }

            logger.info (String.format ("Users by username and password [%s, %s] using criteria object executed.", dbUsername, dbPw));

        } catch (Exception ex) {

            String m = String.format ("Problems executing login %s", ex.getMessage ());
            logger.error (m);

        } finally {

            logger.info ("Closing session");
            session.close ();
        }

        if (us == null) {
            throw new DataException ("Unknown user or wrong password " + "["+ userName + "]" );
        }
        return  us;
    }

    @Override

    public void signUp (String firstName, String lastName, String birthday, String gender, String docType, int identification,
                        int phone, String adress, int zipcode, String user_name, String email, String password){

        Session session = null;
        Transaction tx = null;
        try {

            logger.info("Getting a session");
            session = sessionFactory.openSession ();
            tx = session.beginTransaction ();

            logger.info(String.format("Creating value to insert  %s , %s , %s, %s, %s, %s, %s, %s, %s, %s, %s, %s",
                                         firstName,lastName,birthday,gender,docType,identification,phone,adress,
                                            zipcode,user_name,email,password));

            User newUser = new User (firstName,lastName,birthday,gender,docType,identification,phone,adress,
                                 zipcode,user_name,email,password);

            logger.info (String.format ("Saving user %s, %s", newUser.getFirst_name(), newUser.getUserName ()));
            session.save (newUser);
            logger.info (String.format ("User %s saved!", newUser.getUserName ()));

            tx.commit ();

        } catch (Exception ex) {

            logger.error (ex.getMessage ());
            tx.rollback ();

        } finally { session.close (); }


        return;
    }
}