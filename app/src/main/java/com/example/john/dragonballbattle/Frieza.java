package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Frieza extends Fighter implements FighterMoves {
    private int fullPower = 0;
    public Frieza(){
        super("Frieza", 300, "Death Beam", "Death Ball", "Upgrade Form", "Death Saucer",R.drawable.frieza);
    }
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 75 + fullPower;
    }

    @Override
    public int strongAttack() {
        return 100 + fullPower;
        //add accuracy for the attack
    }

    @Override
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0] = "Form Upgraded. Attacks Do More Damage";
        fullPower = fullPower + 50;
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opponent Loses 125 HP";
        array[1] = "125";
        return array;
    }
}
