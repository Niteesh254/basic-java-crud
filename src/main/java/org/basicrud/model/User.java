package org.basicrud.model;

public class User {
    private int id;
    private String name;
    private String emailid;

    public User(){  // Default constructor

    }

    public User(int id,String name, String emailid){//Parameterised constructor
        this.id = id;
        this.name = name;
        this.emailid = emailid;

    }

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name; //no need to return anything in setter method
    }

    public String getemailid(){
        return emailid;
    }
    public void setemailid(String emailid){
        this.emailid = emailid;
    }
    @Override
    public String toString(){
        return "User{"+id + ",name is " + name + ",emailid is " + emailid + "}";
    }

}
