package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class KidBuu extends Fighter implements FighterMoves {

    public KidBuu(){
        //TEST
        super("KidBuu", 300, "Shocking Ball", "Planet Burst", "Absorption", "Regenerate",R.drawable.kidbuu);
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
        return 75;
        //add accuracy for the attack
    }

    @Override
    public String[] defenseAttack() {
        String array[] = new String[3];
        array[0] = "Opponent Loses 100 HP"+"\n"+"Buu Regenerates 50 HP";
        array[1] = "100";
        array[2] = "50";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[3];
        array[0] = "Buu Regenerates To Max Health";
        array[1] = "300";
        return array;
    }
}
