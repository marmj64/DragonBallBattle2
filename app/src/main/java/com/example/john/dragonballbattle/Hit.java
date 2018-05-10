package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Hit extends Fighter implements FighterMoves {
    private int improve = 0;

    public Hit(){
        //TEST
        super("Hit", 200, "Vital Point Attack", "Flash Fist Crush ", "Time Skip", "Improve",R.drawable.hit);
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
    public String defenseAttack() {
        return "Opposing Player Looses Turn and 50 HP";
    }

    @Override
    public String specialAttack() {
        improve = improve + 20;
        return "Hit's Attacks Do 20 More Damage Points";
    }
}
