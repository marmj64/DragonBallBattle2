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
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0] = "Opposing Player Next Attacks Misses";
        return array;

    }
    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opponent Loses 100 HP";
        array[1] = "100";
        return array;
    }
}
