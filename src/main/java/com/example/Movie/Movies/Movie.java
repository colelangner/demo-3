package com.example.Movie.Movies;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.Movie.Users.User;

@Entity
public class Movie {
    
    @Id
    private String title;

    private String service;

    public Movie(String title, String service){
        this.title = title;
        this.service = service;
    }

    public Movie(){

    }

    public void setTitle(String title){
        this.title = title;
    }


    public void setService(String service){
        this.service = service;
    }

    public String getTitle(){
        return this.title;
    }



    public String getService(){
        return this.service;
    }


    }


