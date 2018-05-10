package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class KidBuu extends Fighter implements FighterMoves {

    public KidBuu(){
        //TEST
        super("KidBuu", 200, "Shocking Ball", "Planet Burst", "Regeneration", "Absorption",R.drawable.kidbuu);
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
    public String defenseAttack() {
        return "Regenerate 50 HP";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 25 HP. Buu Gains 25 HP";
    }
}
