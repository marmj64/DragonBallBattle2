package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Piccolo extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Piccolo(){
        //TEST
        super("Piccolo", 200, "Demon Hand", "Special Beam Cannon", "Regeneration", "Hellzone Grenade",R.drawable.piccolo);
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
        return "Piccolo Recovers 50 HP";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 100 HP";
    }
}
