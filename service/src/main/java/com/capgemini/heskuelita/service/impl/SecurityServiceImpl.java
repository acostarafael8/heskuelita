
package com.capgemini.heskuelita.service.impl;


import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.data.IUserDao;
import com.capgemini.heskuelita.service.ISecurityService;
import com.capgemini.heskuelita.service.SecurityException;


public class SecurityServiceImpl implements ISecurityService {


    private IUserDao userDao;

    public SecurityServiceImpl (IUserDao userDao) {

        super ();

        this.userDao = userDao;
    }


    @Override
    public User login (User user) throws SecurityException {

        try {

            user = this.userDao.login (user.getUserName(), user.getPassword());
        } catch (Exception e) {

            throw new SecurityException(e);
        }

        return user;

    }

    @Override

    public void signUp (User user) throws SecurityException{



            try {
                this.userDao.signUp(user.getFirst_name(), user.getLast_name(),user.getBirthday(),user.getGender(),
                                    user.getDocType(),user.getIdentification(),user.getPhone(),user.getAdress(),
                                    user.getZipcode(),user.getUserName(),user.getEmail(),user.getPassword());
            }catch (Exception e){
                throw new SecurityException(e);
            }

        }


}