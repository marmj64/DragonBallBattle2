package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Cell extends Fighter implements FighterMoves {

    public Cell(){
        super("Cell", 200, "Death Beam", "Super Kamehameha", "Instant Transmission", "Self Destruction",R.drawable.cell);
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
    public String defenseAttack() {
        return "Opposing Player Looses Turn";
    }

    @Override
    public String specialAttack() {
        return "Cell Loses Half Health. Opponent Lose 100 HP";
    }
}
