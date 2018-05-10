package com.example.john.dragonballbattle;

import java.util.ArrayList;

/**
 * Created by John on 4/19/2018.
 */

public class Goku extends Fighter implements FighterMoves {
    //private int multiplier = 1;

    public Goku(){
        //TEST
        super("Goku", 200, "Kamehameha", "Spirit Bomb", "Instant Transmission", "Kaioken", R.drawable.goku);
    }

   // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 50;// * multiplier;
    }

    @Override
    public int strongAttack() {
        return 75;
        //add accuracy for the attack
    }

    @Override
    public String defenseAttack() {
        return "Opposing Fighter's Next Move Will Not Hit";
    }

    @Override
    public String specialAttack() {
        //multiplier = 2;
        return "Attack Power Multiplied";
    }


}
