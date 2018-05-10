package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Yamcha extends Fighter implements FighterMoves {


    public Yamcha(){
        //TEST
        super("Yamcha", 200, "Kamehameha", "Wolf Fang Fist", "Afterimage Technique", "Spirit Ball",R.drawable.yamcha);
    }

    // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 25;
    }

    @Override
    public int strongAttack() {
        return 50;
        //easter egg = if Yamcha lands this attack 3 times in a row, on the 4th time its an insta kill
    }

    @Override
    public String defenseAttack() {
        return "Opposing Player Looses Turn";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 75 HP";
    }
}
