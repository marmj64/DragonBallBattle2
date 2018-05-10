package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Krillin extends Fighter implements FighterMoves {

    public Krillin(){
        //TEST
        super("Krillin", 200, "Kamehameha", "Destructo Disk", "Solar Flare", "Scattering Bullet",R.drawable.krillin);
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
        return "Opponent Loses 100 HP";
    }
}
