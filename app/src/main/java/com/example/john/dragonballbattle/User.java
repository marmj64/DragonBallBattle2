package com.example.john.dragonballbattle;

/**
 * Created by John on 4/19/2018.
 */

public class User {
    private String username;
    private String password;
    private String result;
    //TODO 2a. Decide on the fields of what the user will have.
    //TODO 2b. Does the user need to record wins and losses as instance variables?
    //TODO 2c. Does the user need to keep their characters selection as a variable.
    //TODO 2d. Will these 3 variables need to be pushed into the DB.
   // private String characterSelected;

    public User(){

    }
    public User(String newUsername, String newPassword){
        username = newUsername;
        password = newPassword;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setResult(String result){
        this.result  = result;
    }

    public String getResult(){
        return result;
    }

}
