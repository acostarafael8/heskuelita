
package com.capgemini.heskuelita.service;


import com.capgemini.heskuelita.core.beans.User;


public interface ISecurityService {


    User login (User user) throws SecurityException;
    void signUp(User user) throws  SecurityException;
}