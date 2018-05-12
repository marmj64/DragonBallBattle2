package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Tien extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Tien(){
        //TEST
        super("Tien", 300, "Four Witches ", "Multi Form", "Solar Flare", "Tri Beam",R.drawable.tien);
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
        array[0] = "Opposing Player Next Attack Misses";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[3];
        array[0] = "Opponent Loses 175 HP"+"\n"+"Tien Loses 50 HP";
        array[1] = "175";
        array[2] = "50";
        return array;
    }
}
