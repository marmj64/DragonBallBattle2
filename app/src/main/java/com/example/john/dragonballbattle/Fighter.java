package com.example.john.dragonballbattle;

/**
 * Created by John on 4/19/2018.
 */

public class Fighter {
    //private String id;
    private String name;
    private int hp;
    private String normal;
    private String strong;
    private String defense;
    private String special;
    private int imageID;

    public Fighter(){
        name = "";
        hp = 200;
        normal = "";
        strong = "";
        defense = "";
        special = "";
    }

    public Fighter(String name, int hp, String normal, String strong, String defense, String special, int imageID){
        this.name = name;
        this.hp = hp;
        this.normal = normal;
        this.strong = strong;
        this.defense = defense;
        this.special = special;
        this.imageID = imageID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHp(int newHp){
        this.hp = newHp;
    }
    public int getHp() {
        return hp;
    }

    public void setNormal(String normal){
        this.normal = normal;
    }

    public String getNormal(){
        return normal;
    }


    public void setStrong(String strong){
        this.strong = strong;
    }

    public String getStrong(){
        return strong;
    }

    public void setDefense(String defense){
        this.defense = defense;
    }

    public String getDefense(){
        return defense;
    }

    public void setSpecial(String special){
        this.special = special;
    }

    public String getSpecial(){
        return special;
    }

    public int getImageID(){ return imageID;}
}
