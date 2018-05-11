package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Cell extends Fighter implements FighterMoves {

    public Cell(){
        super("Cell", 300, "Death Beam", "Super Kamehameha", "Regenerate", "Self Destruction",R.drawable.cell);
    }

    // @Override
    public static String getFighterName() {
        return null;
    }

    @Override
    public int normalAttack() {
        return 50 ;
    }

    @Override
    public int strongAttack() {
        return 75;
    }
    @Override
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0]= "Cell Regenerates 100 HP";
        array[1]= "100";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[3];
        array[0] = "Cell Loses Half HP." + "\n" + "Opponent Loses 150 HP";
        array[1] = "2";
        array[2] = "150";
        return array;
    }
}
