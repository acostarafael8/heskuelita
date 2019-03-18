
package com.capgemini.heskuelita.web.servlet;

import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.data.impl.UserDao;
import com.capgemini.heskuelita.data.util.HibernateUtil;
import com.capgemini.heskuelita.service.ISecurityService;
import com.capgemini.heskuelita.service.impl.SecurityServiceImpl;
import org.hibernate.SessionFactory;


import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet ("/login")
public class LoginServlet extends HttpServlet {


    private ISecurityService securityService;


    public LoginServlet () {

        super ();
    }

    @Override
    public void init (ServletConfig config) throws ServletException {

        SessionFactory manager = HibernateUtil.getSessionFactory();

        try {

            this.securityService = new SecurityServiceImpl(new UserDao(manager));
        } catch (Exception e) {

            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        User user = new User ();
        user.setUserName (req.getParameter ("user"));
        user.setPassword (req.getParameter ("pwd"));


        try {

            this.securityService.login (user);


            HttpSession session = req.getSession ();
            session.setAttribute ("user", user);
            resp.sendRedirect ("home.jsp");

        } catch (Exception e) {

            e.printStackTrace();
            resp.sendRedirect ("err.jsp");
        }
    }
}