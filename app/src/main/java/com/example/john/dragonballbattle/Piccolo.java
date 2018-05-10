package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Piccolo extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Piccolo(){
        //TEST
        super("Piccolo", 300, "Demon Hand", "Special Beam Cannon", "Regeneration", "Hellzone Grenade",R.drawable.piccolo);
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
        String array[] = new String[2];
        array[0] = "Piccolo Regenerates 100 HP";
        array[1] = "100";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opposing Player Looses 150 HP";
        array[1] = "150";
        return array;
    }
}
