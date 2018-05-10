package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Beerus extends Fighter implements FighterMoves {


    public Beerus(){
        super("Beerus", 300, "Pressure Point Attack", "Wrath of Destruction", "Energy Nullification", "Hakai", R.drawable.beerus);
    }

    // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 50;
    }

    @Override
    public int strongAttack() {
        return 100;
        //add accuracy for the attack
    }

    @Override
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0]= "Opposing Player Next Attack Misses";
        array[1]= "0";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0]= "Opponents Health Is Cut In Half";
        array[1]= "2";
        return array;
    }



}
