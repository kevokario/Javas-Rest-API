/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karioPackage;

import org.json.simple.JSONObject;

public class karioInfo {

    private String firstName = "";
    private String secondName = "";
    private String lastName = "";
    private String phone = "";
    private String email = "";
    private int age = 0;
    private String username = "";
    private String password = "";
    private String ocupation = "";
    public karioInfo() {

    }

    public karioInfo(String fname, String sname, String lname, String phone, String email, int age, String uname, String pass, String oc) {
        this.firstName = fname;
        this.secondName = sname;
        this.lastName = lname;
        this.phone = phone;
        this.email = email;
        this.age = age;
        this.password = pass;
        this.username = uname;
        this.ocupation = oc;
    }

    public String getFname() {
        return this.firstName;
    }

    public String getSname() {
        return this.secondName;
    }

    public String getLname() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    public int getAge() {
        return this.age;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public String getOccupation() {
        return this.ocupation;
    }

    public void setFname(String fname) {
        this.firstName = fname;
    }

    public void setSname(String sname) {
        this.secondName = sname;
    }

    public void setLname(String lname) {
        this.lastName = lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUsername(String uname) {
        this.username = uname;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
     public void setOccupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getAll() {
        String karioInfo = "";
        JSONObject json = new JSONObject();
        json.put("firstname", getFname());
        json.put("secondname", getSname());
        json.put("lastname", getLname());
        json.put("phone", getPhone());
        json.put("email", getEmail());
        json.put("age", getAge());
        json.put("username", getUsername());
        json.put("password", getPassword());
        json.put("occupation", getOccupation());
        
        karioInfo = json.toJSONString();

        return karioInfo;
    }
}
