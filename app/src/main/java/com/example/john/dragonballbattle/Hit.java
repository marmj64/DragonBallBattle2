package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Hit extends Fighter implements FighterMoves {
    private int improve = 0;

    public Hit(){
        //TEST
        super("Hit", 300, "Vital Point Attack", "Flash Fist Crush ", "Time Skip", "Improve",R.drawable.hit);
    }

    // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 50 + improve;
    }

    @Override
    public int strongAttack() {
        return 75 + improve;
        //add accuracy for the attack
    }

    @Override
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0] = "Opposing Player Next Attack Misses. Hit Does 50 Damage";
        array[1] = "50";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Hit Has Improved. His Attacks Do 100 More Damage";
        improve = 100;
        return array;
    }
}
