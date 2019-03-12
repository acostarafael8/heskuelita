package com.capgemini.heskuelita.web.servlet;
import org.apache.commons.dbcp2.BasicDataSource;

import java.io.*;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;




@WebServlet ("/signup")
public class SignUpServlet extends HttpServlet {

    private BasicDataSource dataSourceTest;

    public void setup () throws Exception {

        // Create a new Data Source.
        this.dataSourceTest = new BasicDataSource ();

        dataSourceTest.setUrl("jdbc:postgresql://localhost:5432/heskuelita");
        dataSourceTest.setUsername ("postgres");
        dataSourceTest.setPassword ("derqui97");
        dataSourceTest.setMinIdle (5);
        dataSourceTest.setMaxIdle (10);
        dataSourceTest.setMaxOpenPreparedStatements (100);
        this.dataSourceTest.setDriverClassName ("org.postgresql.Driver");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try {

            this.setup();
            PreparedStatement pstm = this.dataSourceTest.getConnection ().prepareStatement ("INSERT INTO public.users(us_username, us_pw, us_email, first_name, last_name, " +
                                                                                            "birthday, gender, doc_type, identification, phone, adress, zipcode)" +
                                                                                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);");


            pstm.setString (1,req.getParameter("username"));
            pstm.setString (2,req.getParameter("pwd"));
            pstm.setString(3,req.getParameter("email"));
            pstm.setString(4,req.getParameter ("first_name"));
            pstm.setString(5,req.getParameter ("last_name"));
            pstm.setString(6,req.getParameter("birthday"));
            pstm.setString(7,req.getParameter("gender"));
            pstm.setString(8,req.getParameter("doc_type"));
            pstm.setInt(9,Integer.parseInt(req.getParameter("identification")));
            pstm.setInt(10,Integer.parseInt(req.getParameter("phone")));
            pstm.setString(11, req.getParameter("adress"));
            pstm.setInt(12,Integer.parseInt(req.getParameter("zipcode")));
            pstm.executeUpdate ();


            resp.sendRedirect ("index.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect ("err.jsp");
        }
    }

    }
