package com.example.john.dragonballbattle;

/**
 * Created by John on 4/30/2018.
 */

public class Vegeta extends Fighter implements FighterMoves {
        private int multiplier = 1;

    public Vegeta(){
            //TEST
            super("Vegeta", 200, "Gallick Gun", "Big Bang Attack", "Final Explosion", "Final Flash",R.drawable.vegeta);
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
        return "Opponent Loses 125 HP"+"\nVegeta Loses 100 HP";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 100 HP";
    }
}
