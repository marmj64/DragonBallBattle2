package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Gohan extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Gohan(){
        //TEST
        super("Gohan", 300, "Masenko", "Super Kamehameha", "Counter", "Hidden Power",R.drawable.gohan);
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
        array[0] = "Opponent Attack Misses";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opponent Loses 150 HP And Is Stunned for a Turn";
        array[1] = "150";
        return array;
    }
}
