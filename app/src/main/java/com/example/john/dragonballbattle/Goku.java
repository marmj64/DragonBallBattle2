package com.example.john.dragonballbattle;

import java.util.ArrayList;

/**
 * Created by John on 4/19/2018.
 */

public class Goku extends Fighter implements FighterMoves {
    //private int multiplier = 1;

    public Goku(){
        //TEST
        super("Goku", 300, "Kamehameha", "Spirit Bomb", "Instant Transmission", "Kaioken", R.drawable.goku);
    }

   // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 75;// * multiplier;
    }

    @Override
    public int strongAttack() {
        return 100;
        //add accuracy for the attack
    }

    @Override
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0]= "Opposing Fighter's Next Move Will Not Hit";
        array[1]= "0";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0]= "Attack Power Multiplied";
        array[1]= "2";
        return array;
    }


}
