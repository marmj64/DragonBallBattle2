package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Beerus extends Fighter implements FighterMoves {


    public Beerus(){
        super("Beerus", 200, "Pressure Point Attack", "Wrath of Destruction", "Energy Nullification", "Hakai", R.drawable.beerus);
    }

    // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 50 ;
    }

    @Override
    public int strongAttack() {
        return 75;
        //add accuracy for the attack
    }

    @Override
    public String defenseAttack() {
        return "Opposing Player Looses Turn";
    }

    @Override
    public String specialAttack() {
        return "Opponents Health is Cut in Half";
    }



}
