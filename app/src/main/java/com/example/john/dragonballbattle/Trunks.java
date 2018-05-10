package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Trunks extends Fighter implements FighterMoves {

    public Trunks(){
        //TEST
        super("Trunks", 300, "Gallick Gun", "Masenko", "Shining Sword Attack", "Burning Attack",R.drawable.trunks);
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
        array[0] = "Opposing Player Looses Turn"+"\nOpposing Player Loses 50 HP";
        array[1] = "50";
        return array;

    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opposing Player Loses 150 HP";
        array[1] = "150";
        return array;
    }
}
