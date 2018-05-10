package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Trunks extends Fighter implements FighterMoves {

    public Trunks(){
        //TEST
        super("Trunks", 200, "Gallick Gun", "Masenko", "Shining Sword Attack", "Burning Attack",R.drawable.trunks);
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
        return "Opposing Player Looses Turn"+"\nOpposing Player Loses 50 HP";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 100 HP";
    }
}
