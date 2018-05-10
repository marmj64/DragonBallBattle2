package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Krillin extends Fighter implements FighterMoves {

    public Krillin(){
        //TEST
        super("Krillin", 300, "Kamehameha", "Destructo Disk", "Solar Flare", "Scattering Bullet",R.drawable.krillin);
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
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0] = "Opponent Loses Turn";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0] = "Opponent Loses 100 HP";
        array[1] = "150";
        return array;
    }
}
