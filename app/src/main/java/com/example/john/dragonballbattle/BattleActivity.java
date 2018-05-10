package com.example.john.dragonballbattle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class BattleActivity extends AppCompatActivity {
    private Fighter user;
    private Fighter opponent;
    private TextView userFighterView;
    private TextView opponentFighterView;
    private TextView userHp;
    private TextView opponentHp;
    private ImageView userImage;
    private ImageView opponentImage;
    private Button userNormalBtn;
    private Button userStrongBtn;
    private Button userDefenseBtn;
    private Button userSpecialBtn;
    private Button opponentNormalBtn;
    private Button opponentStrongBtn;
    private Button opponentDefenseBtn;
    private Button opponentSpecialBtn;
    private int turnCounter;
    private int userDmgMulti = 1;
    private int oppDmgMulti = 1;
    private int userStrong = 5, userDef = 3, userSpec = 1, oppStrong = 5, oppDef = 3, oppSpec = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        userFighterView = (TextView) findViewById(R.id.battleUserName) ;
        userHp = (TextView) findViewById(R.id.battleUserHp);
        userImage = (ImageView) findViewById(R.id.battleUserImage);
        userNormalBtn = (Button) findViewById(R.id.battleUserNormal);
        userStrongBtn = (Button) findViewById(R.id.battleUserStrong);
        userDefenseBtn = (Button) findViewById(R.id.battleUserDefense);
        userSpecialBtn = (Button) findViewById(R.id.battleUserSpecial);

        opponentFighterView = (TextView) findViewById(R.id.battleOpponentName);
        opponentImage = (ImageView) findViewById(R.id.battleOpponentImage);
        opponentHp = (TextView) findViewById(R.id.battleOpponentHp);
        opponentNormalBtn = (Button) findViewById(R.id.battleOpponentNormal);
        opponentStrongBtn = (Button) findViewById(R.id.battleOpponentStrong);
        opponentDefenseBtn = (Button) findViewById(R.id.battleOpponentDefense);
        opponentSpecialBtn = (Button) findViewById(R.id.battleOpponentSpecial);

        turnCounter = 2;
        updateStartScreen();

    }

    public void updateStartScreen(){
        user = FighterSelectionActivity.selectedFighter;
        userFighterView.setText(user.getName());
        userImage.setImageResource(user.getImageID());
        userHp.setText(String.valueOf(user.getHp()));

        opponent = GuestActivity.selectedFighter;
        opponentFighterView.setText(opponent.getName());
        opponentImage.setImageResource(opponent.getImageID());

        opponentHp.setText(String.valueOf(opponent.getHp()));
        opponentNormalBtn.setEnabled(false);
        opponentStrongBtn.setEnabled(false);
        opponentSpecialBtn.setEnabled(false);
        opponentDefenseBtn.setEnabled(false);
        //userImage.setImageResource(FighterSelectionActivity.);

        setButtonTexts();
    }

    private void setButtonTexts(){
        opponentNormalBtn.setText(opponent.getNormal());
        opponentStrongBtn.setText(opponent.getStrong() + "-" + oppStrong);
        opponentDefenseBtn.setText(opponent.getDefense() + "-" + oppDef);
        opponentSpecialBtn.setText(opponent.getSpecial() + "-" + oppSpec);

        userNormalBtn.setText(user.getNormal());
        userStrongBtn.setText(user.getStrong() + "-" + userStrong);
        userDefenseBtn.setText(user.getDefense() + "-" + userDef);
        userSpecialBtn.setText(user.getSpecial() + "-" + userSpec);

    }

//TODO CHECK VICTORY METHOD

    /**
     * User Normal Method
     * @param v
     */

    /*
    Goku.
     */
    public void userNormal(View v){
        if(user instanceof Goku) {
            int x = ((Goku) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Gohan.
         */
        else if (user instanceof Gohan){
            int x = ((Gohan) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        changeTurn();
    }

    /**
     * User Strong Method
     * @param v
     */
    public void userStrong(View v){
        /*
        Goku
         */
        if(user instanceof Goku) {
            int x = ((Goku) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())- (x * userDmgMulti) + "");
            userDmgMulti = 1;
        }
        /*
        Goham
         */
        else if (user instanceof Gohan){
            int x = ((Gohan) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        userStrong--;
        setButtonTexts();
        changeTurn();
    }

    /**
     * User Defense Method
     * @param v
     */
    /*
    Goku
     */
    public void userDefense(View v){
        if(user instanceof Goku){
            String s[] = ((Goku) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_LONG).show();
        }
        /*
        Gohan
         */
        else if(user instanceof Gohan){
            String s[] = ((Gohan) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_LONG).show();
        }
        userDef--;
        setButtonTexts();
        changeTurnNoNormalUser();
    }

    /**
     * User Special Method
     * @param v
     */
    public void userSpecial(View v){
        if(user instanceof Goku) {
            String s[] = ((Goku) user).specialAttack();
            userDmgMulti = 2;
            Toast.makeText(this,s[0],Toast.LENGTH_LONG).show();
            userSpec--;
            setButtonTexts();
            changeTurn();
        }
        else if(user instanceof Gohan){
            String s[] = ((Gohan) user).specialAttack();
            oppDmgMulti = 0;
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            opponentHp.setText(x-y + "");
            Toast.makeText(this, s[0], Toast.LENGTH_LONG).show();
            userSpec--;
            setButtonTexts();
            changeTurnNoNormalUser();
        }

    }

    /**
     * Opp Normal Method
     * @param v
     */
    public void oppNormal(View v){
        if(opponent instanceof Goku) {
            int x = ((Goku) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        else if(opponent instanceof Gohan){
            int x = ((Gohan) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        changeTurn();

    }

    /**
     * Opp Strong Method
     * @param v
     */
    public void oppStrong(View v){
        if(opponent instanceof Goku) {
            int x = ((Goku) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x*oppDmgMulti) + "");
            userDmgMulti = 1;
        }
        else if(opponent instanceof Gohan){
            int x = ((Gohan) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        oppStrong--;
        setButtonTexts();
        changeTurn();
    }

    /**
     * Opp Defense Method
     * @param v
     */
    public void oppDefense(View v){
        if(opponent instanceof Goku){
            String s[] = ((Goku) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_LONG).show();
        }
        else if(opponent instanceof Gohan){
            String s[] = ((Gohan) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_LONG).show();
        }
        oppDef--;
        setButtonTexts();
        changeTurnNoNormalOpp();
    }

    /**
     * Opp Special Method
     * @param v
     */
    public void oppSpecial(View v){
        if(opponent instanceof Goku) {
            String s[] = ((Goku) opponent).specialAttack();
            Toast.makeText(this, s[0], Toast.LENGTH_LONG).show();
            oppDmgMulti = 2;
            oppSpec--;
            setButtonTexts();
            changeTurn();
        }
        else if(opponent instanceof Gohan){
            String s[] = ((Gohan) opponent).specialAttack();
            userDmgMulti = 0;
            int x = Integer.parseInt(userHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            userHp.setText(x-y + "");
            Toast.makeText(this, s[0], Toast.LENGTH_LONG).show();
            oppSpec--;
            setButtonTexts();
            changeTurnNoNormalOpp();
        }

    }

    private void changeTurnNoNormalUser(){
        if(turnCounter % 2 == 0){
            //currently user's turn
            userNormalBtn.setEnabled(false);
            userSpecialBtn.setEnabled(false);
            userStrongBtn.setEnabled(false);
            userDefenseBtn.setEnabled(false);
            opponentNormalBtn.setEnabled(false);
            opponentStrongBtn.setEnabled(true);
            opponentSpecialBtn.setEnabled(true);
            opponentDefenseBtn.setEnabled(true);
        } else {
            opponentNormalBtn.setEnabled(false);
            opponentStrongBtn.setEnabled(false);
            opponentSpecialBtn.setEnabled(false);
            opponentDefenseBtn.setEnabled(false);
            userNormalBtn.setEnabled(true);
            userSpecialBtn.setEnabled(true);
            userStrongBtn.setEnabled(true);
            userDefenseBtn.setEnabled(true);
        }
        turnCounter++;
    }
    private void changeTurnNoNormalOpp(){
        if(turnCounter % 2 == 0){
            //currently user's turn
            userNormalBtn.setEnabled(false);
            userSpecialBtn.setEnabled(false);
            userStrongBtn.setEnabled(false);
            userDefenseBtn.setEnabled(false);
            opponentNormalBtn.setEnabled(true);
            opponentStrongBtn.setEnabled(true);
            opponentSpecialBtn.setEnabled(true);
            opponentDefenseBtn.setEnabled(true);
        } else {
            opponentNormalBtn.setEnabled(false);
            opponentStrongBtn.setEnabled(false);
            opponentSpecialBtn.setEnabled(false);
            opponentDefenseBtn.setEnabled(false);
            userNormalBtn.setEnabled(false);
            userSpecialBtn.setEnabled(true);
            userStrongBtn.setEnabled(true);
            userDefenseBtn.setEnabled(true);
        }
        turnCounter++;
    }

    private void changeTurn(){
        if(turnCounter % 2 == 0){
            //currently user's turn
            userNormalBtn.setEnabled(false);
            userSpecialBtn.setEnabled(false);
            userStrongBtn.setEnabled(false);
            userDefenseBtn.setEnabled(false);
            opponentNormalBtn.setEnabled(true);
            opponentStrongBtn.setEnabled(true);
            opponentSpecialBtn.setEnabled(true);
            opponentDefenseBtn.setEnabled(true);
        } else {
            opponentNormalBtn.setEnabled(false);
            opponentStrongBtn.setEnabled(false);
            opponentSpecialBtn.setEnabled(false);
            opponentDefenseBtn.setEnabled(false);
            userNormalBtn.setEnabled(true);
            userSpecialBtn.setEnabled(true);
            userStrongBtn.setEnabled(true);
            userDefenseBtn.setEnabled(true);
        }

  /////////////////////////////////////////////////////////////////////////////////////////////////


        if(oppStrong < 1){
            opponentStrongBtn.setEnabled(false);
        }

        if(oppDef < 1){
            opponentDefenseBtn.setEnabled(false);
        }
        if(oppSpec < 1){
            opponentSpecialBtn.setEnabled(false);
        }
        if(userStrong < 1){
            userStrongBtn.setEnabled(false);
        }
        if(userDef < 1){
            userDefenseBtn.setEnabled(false);
        }
        if(userSpec < 1){
            userSpecialBtn.setEnabled(false);
        }
        checkWin();
        turnCounter++;
    }

    private void checkWin(){
        if(Integer.parseInt(userHp.getText().toString()) <= 0){
            Toast.makeText(this, "Guest wins", Toast.LENGTH_LONG).show();
        } else if(Integer.parseInt(opponentHp.getText().toString()) <= 0){
            Toast.makeText(this, "User wins", Toast.LENGTH_LONG).show();
        }
    }
}
