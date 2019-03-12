
package com.capgemini.heskuelita.core.beans;


import java.time.LocalDate;
import lombok.*;



@NoArgsConstructor
public class User {

    private String userName;

    private String password;

    private String email;

    private String first_name;

    private String last_name;

    private String birthday;

    private String gender;

    private String docType;

    private int identification;

    private int phone;

    private String adress;

    private int zipcode;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getDocType() {
        return docType;
    }

    public int getIdentification() {
        return identification;
    }

    public int getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}

