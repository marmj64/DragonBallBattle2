package com.example.john.dragonballbattle;

/**
 * Created by John on 4/19/2018.
 * Move list that is implemented by all fighters. The defense and special will be able to pass a message in one elemenet
 * and a damage amount that can be parsed in the Battle Activity.
 */

public interface FighterMoves {



     int normalAttack();

     int strongAttack();

     String [] defenseAttack();

     String [] specialAttack();

}
