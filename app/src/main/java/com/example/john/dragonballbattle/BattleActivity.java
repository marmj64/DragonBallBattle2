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
        userNormalBtn.setText(user.getNormal());
        userStrongBtn.setText(user.getStrong());
        userDefenseBtn.setText(user.getDefense());
        userSpecialBtn.setText(user.getSpecial());

        opponent = GuestActivity.selectedFighter;
        opponentFighterView.setText(opponent.getName());
        opponentImage.setImageResource(opponent.getImageID());

        opponentHp.setText(String.valueOf(opponent.getHp()));
        opponentNormalBtn.setText(opponent.getNormal());
        opponentStrongBtn.setText(opponent.getStrong());
        opponentDefenseBtn.setText(opponent.getDefense());
        opponentSpecialBtn.setText(opponent.getSpecial());
        opponentNormalBtn.setEnabled(false);
        opponentStrongBtn.setEnabled(false);
        opponentSpecialBtn.setEnabled(false);
        opponentDefenseBtn.setEnabled(false);
        //userImage.setImageResource(FighterSelectionActivity.);

    }
//TODO CHECK VICTORY METHOD
    public void userNormal(View v){
        if(user instanceof Goku) {
            int x = ((Goku) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        changeTurn();
    }

    public void userStrong(View v){
        if(user instanceof Goku) {
            int x = ((Goku) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())- (x * userDmgMulti) + "");
            userDmgMulti = 1;
        }
        changeTurn();
    }

    public void userDefense(View v){
        if(user instanceof Goku){
            String s = ((Goku) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s, Toast.LENGTH_LONG).show();
        }
        changeTurn();
    }

    public void userSpecial(View v){
        if(user instanceof Goku) {
            String s = ((Goku) user).specialAttack();
        }
        changeTurn();
    }

    public void oppNormal(View v){
        if(opponent instanceof Goku) {
            int x = ((Goku) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        changeTurn();
    }

    public void oppStrong(View v){
        if(opponent instanceof Goku) {
            int x = ((Goku) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x*oppDmgMulti) + "");
            userDmgMulti = 1;
        }
        changeTurn();
    }

    public void oppDefense(View v){

    }

    public void oppSpecial(View v){

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
        turnCounter++;
    }
}
