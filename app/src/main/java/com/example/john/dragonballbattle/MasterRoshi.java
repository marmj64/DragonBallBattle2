package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class MasterRoshi extends Fighter implements FighterMoves {
    private int maxPower = 0;

    public MasterRoshi(){
        super("Master Roshi", 200, "Drunken Fist", "Kamehameha", "Mafuba", "Max Power",R.drawable.roshi);
    }

    // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 50 + maxPower;
    }

    @Override
    public int strongAttack() {
        return 75 + maxPower;
        //add accuracy for the attack
    }

    @Override
    public String defenseAttack() {
        return "Opposing Player Looses Turn"+"\nOpposing Player Loses 50 HP"+"\nMaster Roshi Loses 75 HP";
    }

    @Override
    public String specialAttack() {
        maxPower = 25;
        return "Opponent Attack does";
    }
}
