package com.example.Movie.Users;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
    
    @Id
    private String username;

    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    public User(){

    }

    public void setUsername(String username){
        this.username = username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return password;
    }



}
