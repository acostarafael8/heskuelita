
package com.capgemini.heskuelita.core.beans;

import javax.persistence.*;


@Entity
@Table (name = "users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "users_seq")
    @Column (name="user_id", nullable=false, unique=true)
    private int id;

    @Column (name = "us_username", length = 60, nullable = false)
    private String userName;

    @Column (name = "us_pw", length = 70, nullable = false)
    private String password;

    @Column (name = "us_email", length = 120, nullable = false)
    private String email;

    @Column (name = "first_name", length = 40, nullable = false)
    private String first_name;

    @Column (name = "last_name", length = 40, nullable = false)
    private String last_name;

    @Column (name = "birthday", length = 35, nullable = false)
    private String birthday;

    @Column (name = "gender", length =120 , nullable = false)
    private String gender;

    @Column (name = "doc_type", length = 40, nullable = false)
    private String docType;

    @Column (name = "identification", nullable = false)
    private int identification;

    @Column (name = "phone", nullable = false)
    private int phone;

    @Column (name = "adress",length = 60, nullable = false)
    private String adress;

    @Column (name = "zipcode", nullable = false)
    private int zipcode;

    public User() {

        super();
    }

    public User(String firstName, String lastName, String birthday, String gender, String docType, int identification,
                int phone, String adress, int zipcode, String user_name, String email, String password) {

        this.first_name=firstName;
        this.last_name=lastName;
        this.birthday=birthday;
        this.gender=gender;
        this.docType=docType;
        this.identification=identification;
        this.phone=phone;
        this.adress=adress;
        this.zipcode=zipcode;
        this.userName=user_name;
        this.email=email;
        this.password=password;
    }

    public int getId() { return id; }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public String getEmail() { return email; }

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

    public void setId(int id) { this.id = id; }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
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



}

