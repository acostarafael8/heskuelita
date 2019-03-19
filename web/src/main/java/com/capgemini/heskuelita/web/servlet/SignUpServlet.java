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




@WebServlet ("/signup")
public class SignUpServlet extends HttpServlet {

    private ISecurityService securityService;

    public SignUpServlet(){
        super();
    }

    @Override
    public void init (ServletConfig config) throws ServletException {

        SessionFactory manager = HibernateUtil.getSessionFactory();

        try {

            this.securityService = new SecurityServiceImpl(new UserDao(manager));
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        try {

            User newUser = new User();
            newUser.setFirst_name (req.getParameter("first_name"));
            newUser.setLast_name (req.getParameter ("last_name"));
            newUser.setBirthday(req.getParameter("birthday"));
            newUser.setGender(req.getParameter("gender"));
            newUser.setDocType(req.getParameter("doc_type"));
            newUser.setIdentification(Integer.parseInt(req.getParameter("identification")));
            newUser.setPhone(Integer.parseInt(req.getParameter("phone")));
            newUser.setAdress(req.getParameter("adress"));
            newUser.setZipcode(Integer.parseInt(req.getParameter("zipcode")));
            newUser.setUserName (req.getParameter("username"));
            newUser.setPassword(req.getParameter("pwd"));
            newUser.setEmail(req.getParameter("email"));

            this.securityService.signUp (newUser);
            resp.sendRedirect ("login.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect ("error2.jsp");
        }

    }

}
