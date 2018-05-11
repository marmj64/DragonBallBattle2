package com.example.john.dragonballbattle;

/**
 * Created by John on 4/30/2018.
 */

public class Vegeta extends Fighter implements FighterMoves {
        private int multiplier = 1;

    public Vegeta(){
            //TEST
            super("Vegeta", 300, "Gallick Gun", "Big Bang Attack", "Final Flash", "Final Explosion",R.drawable.vegeta);
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
        array[0] = "Opposing Player Looses 100";
        array[1] = "100";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opposing Player Looses 150 HP"+"\nVegeta Loses 100 HP";
        array[1] = "150";
        array[2] = "100";
        return array;

    }
}
