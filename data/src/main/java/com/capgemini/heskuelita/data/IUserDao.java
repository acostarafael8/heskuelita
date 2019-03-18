
package com.capgemini.heskuelita.data;


import com.capgemini.heskuelita.core.beans.User;


public interface IUserDao {

    User login (String userName, String password);

    void signUp (String firstName,String lastName,String birthday, String gender, String docType, int identification,
                 int phone, String adress, int zipcode, String user_name, String email, String password);
}