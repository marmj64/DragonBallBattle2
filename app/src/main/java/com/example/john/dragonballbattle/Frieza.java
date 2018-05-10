package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Frieza extends Fighter implements FighterMoves {
    private int fullPower = 0;
    public Frieza(){
        super("Frieza", 200, "Death Beam", "Death Ball", "100% Power", "Death Saucer",R.drawable.frieza);
    }
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 50 + fullPower;
    }

    @Override
    public int strongAttack() {
        return 75 + fullPower;
        //add accuracy for the attack
    }

    @Override
    public String defenseAttack() {
        fullPower = 25;
        return "Attack Power Increased By 25 Damage Points";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 100 HP";
    }
}
