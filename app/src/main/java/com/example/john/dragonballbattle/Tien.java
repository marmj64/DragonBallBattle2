package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Tien extends Fighter implements FighterMoves {
    private int multiplier = 1;

    public Tien(){
        //TEST
        super("Tien", 200, "Four Witches ", "Multi Form", "Solar Flare", "Tri Beam",R.drawable.tien);
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
        return "Opposing Player Looses Turn";
    }

    @Override
    public String specialAttack() {
        return "Opponent Loses 100 HP"+"\nTien Loses 50 HP";
    }
}
