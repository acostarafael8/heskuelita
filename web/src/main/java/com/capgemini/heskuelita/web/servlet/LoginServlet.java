package com.capgemini.heskuelita.web.servlet;
import com.capgemini.heskuelita.core.beans.User;
import com.capgemini.heskuelita.service.ISecurityService;
import com.capgemini.heskuelita.service.imp.SecurityServiceServiceImpl;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet ("/login")
public class LoginServlet extends HttpServlet {

    private ISecurityService securityService = new SecurityServiceServiceImpl();

    public LoginServlet () {

        super ();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        User user= new User ();
        user.setUserName (req.getParameter("user"));
        user.setPassword (req.getParameter("pwd"));

        try {

            HttpSession session=req.getSession();
            session.setAttribute("user", user);
            this.securityService.login (user);
            resp.sendRedirect("home.jsp");
        }catch (Exception e){


            resp.sendRedirect("err.jsp");
        }





    }
}
