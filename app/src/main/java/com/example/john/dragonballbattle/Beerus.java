package com.example.john.dragonballbattle;

/**
 * Created by John on 5/2/2018.
 */

public class Beerus extends Fighter implements FighterMoves {


    public Beerus(){
        super("Beerus", 300, "Palm Energy Explosion", "Wrath of Hakai-Shinto", "Pressure Point Attack", "Hakai", R.drawable.beerus);
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
        //add accuracy for the attack
    }

    @Override
    public String[] defenseAttack() {
        String array[] = new String[2];
        array[0]= "Opponent Knocked Out"+"\n"+"Opponent Loses 50 HP";
        array[1]= "50";
        return array;
    }

    @Override
    public String[] specialAttack() {
        String array[] = new String[2];
        array[0]= "Opponents Health Is Cut In Half"+"\n"+"Opponent Is Weakened";
        array[1]= "2";
        return array;
    }



}
