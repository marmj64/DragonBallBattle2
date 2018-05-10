package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class MasterRoshi extends Fighter implements FighterMoves {

    public MasterRoshi() {
        super("Master Roshi", 300, "Kamehameha", "Max Power Kamehameha", "Drunken Roshi", "Mafuba", R.drawable.roshi);
    }

    // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 75;
    }

    @Override
    public int strongAttack() {
        return 100;
    }

    @Override
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0] = "Opposing Player Looses Turn";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opposing Player Looses Turn" + "\nOpposing Player Loses 150 HP" + "\nMaster Roshi Loses 100 HP";
        array[1] = "100";
        array[2] = "50";
        return array;
    }
}
