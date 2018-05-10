package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Gohan extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Gohan(){
        //TEST
        super("Gohan", 200, "Masenko", "Super Kamehameha", "Counter", "Father-Son Kamehameha",R.drawable.gohan);
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
    public String defenseAttack() {
        return "Opposing Player Looses Turn and 25 Health Points";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 100 HP";
    }
}
