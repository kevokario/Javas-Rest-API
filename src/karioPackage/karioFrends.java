/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karioPackage;

import org.json.simple.JSONObject;

/**
 *
 * @author kario
 */
public class karioFrends {

    private String friendName = "";
    private String phone = "";
    private String email = "";
    
    public karioFrends(){
        
    }
    
    public karioFrends(String name, String phone, String email){
        this.friendName = name;
        this.phone = phone;
        this.email = email;
    }
    
    public void setName(String name){
        this.friendName = name;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getName(){
        return this.friendName;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getAll(){
        String karioFrends = "";
        JSONObject json = new JSONObject();
        json.put("name", getName());
        json.put("phone", getPhone());
        json.put("email", getEmail());
        karioFrends = json.toJSONString();
        return karioFrends;
    }

}
