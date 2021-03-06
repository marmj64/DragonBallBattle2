package com.example.john.dragonballbattle;

import android.content.Intent;
import android.media.MediaPlayer;
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

    /**
     * Initializes the start screen to have player1 go first.
     */

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

    /**
     * Sets the text in the button. Updates the number of remaining moves.
     */
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
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        mediaPlayer.start();

        if(userDmgMulti ==0){
            Toast.makeText(this, "Your Attack Missed.", Toast.LENGTH_SHORT).show();
        }

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
        /*
        Beerus
         */
        else if (user instanceof Beerus){
            int x = ((Beerus) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Cell
         */
        else if (user instanceof Cell){
            int x = ((Cell) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
         /*
        Frieza
         */
        else if (user instanceof Frieza){
            int x = ((Frieza) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Hit
         */
        else if (user instanceof Hit){
            int x = ((Hit) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        KidBuu
         */
        else if (user instanceof KidBuu){
            int x = ((KidBuu) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Krillin
         */
        else if (user instanceof Krillin){
            int x = ((Krillin) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        MasterRoshi
         */
        else if (user instanceof MasterRoshi){
            int x = ((MasterRoshi) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
         Monaka
         */
        else if (user instanceof Monaka){
            int x = ((Monaka) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Piccolo
         */
        else if (user instanceof Piccolo){
            int x = ((Piccolo) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Tien
         */
        else if (user instanceof Tien){
            int x = ((Tien) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Trunks
         */
        else if (user instanceof Trunks){
            int x = ((Trunks) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Vegeta
         */
        else if (user instanceof Vegeta){
            int x = ((Vegeta) user).normalAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Yamcha
         */
        else if (user instanceof Yamcha){
            int x = ((Yamcha) user).normalAttack();
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
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fireball);
        mediaPlayer.start();

        if(userDmgMulti ==0){
            Toast.makeText(this, "Your Attack Missed.", Toast.LENGTH_LONG).show();
        }
        /*
        Goku
         */
        if(user instanceof Goku) {
            int x = ((Goku) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())- (x * userDmgMulti) + "");
            userDmgMulti = 1;
        }
        /*
        Gohan
         */
        else if (user instanceof Gohan){
            int x = ((Gohan) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Beerus
         */
        else if (user instanceof Beerus){
            int x = ((Beerus) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Cell
         */
        else if (user instanceof Cell){
            int x = ((Cell) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Frieza
         */
        else if (user instanceof Frieza){
            int x = ((Frieza) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Hit
         */
        else if (user instanceof Hit){
            int x = ((Hit) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        KidBuu
         */
        else if (user instanceof KidBuu){
            int x = ((KidBuu) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Krillin
         */
        else if (user instanceof Krillin){
            int x = ((Krillin) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        MasterRoshi
         */
        else if (user instanceof MasterRoshi){
            int x = ((MasterRoshi) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Monaka
         */
        else if (user instanceof Monaka){
            int x = ((Monaka) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Piccolo
         */
        else if (user instanceof Piccolo){
            int x = ((Piccolo) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Tien
         */
        else if (user instanceof Tien){
            int x = ((Tien) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Trunks
         */
        else if (user instanceof Trunks){
            int x = ((Trunks) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Vegeta
         */
        else if (user instanceof Vegeta){
            int x = ((Vegeta) user).strongAttack();
            opponentHp.setText(Integer.parseInt(opponentHp.getText().toString())-(x * userDmgMulti)+ "");
            userDmgMulti = 1;
        }
        /*
        Yamcha
         */
        else if (user instanceof Yamcha){
            int x = ((Yamcha) user).strongAttack();
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
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.throwknife2);
        mediaPlayer.start();
        /*
        Goku
         */
        if(user instanceof Goku){
            String s[] = ((Goku) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Gohan
         */
        else if(user instanceof Gohan){
            String s[] = ((Gohan) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Beerus
         */
        else if(user instanceof Beerus){
            String s[] = ((Beerus) user).defenseAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            opponentHp.setText(x-(y*userDmgMulti) + "");
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Cell
         */
        else if(user instanceof Cell){
            String s[] = ((Cell) user).defenseAttack();
            int x = Integer.parseInt(userHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            userHp.setText(x+y + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Frieza
         */
        else if(user instanceof Frieza){
            String s[] = ((Frieza) user).defenseAttack();
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Hit
         */
        else if(user instanceof Hit){
            String s[] = ((Hit) user).defenseAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            opponentHp.setText(x-(y*userDmgMulti) + "");
            //userHp.setText(x-(y*oppDmgMulti) + "");
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        KidBuu
         */
        else if(user instanceof KidBuu){
            String s[] = ((KidBuu) user).defenseAttack();
            int w = Integer.parseInt(userHp.getText().toString());//user health
            int x = Integer.parseInt(opponentHp.getText().toString()); //opp health
            int y = Integer.parseInt(s[1]);//attack dmg
            int z = Integer.parseInt(s[2]);//health regen
            opponentHp.setText(x-(y*userDmgMulti)  + "");
            userHp.setText((w+z +""));
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Krillin
         */
        else if(user instanceof Krillin){
            String s[] = ((Krillin) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        MasterRoshi
         */
        else if(user instanceof MasterRoshi){
            String s[] = ((MasterRoshi) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Monaka
         */
        else if(user instanceof Monaka){
            String s[] = ((Monaka) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Piccolo
         */
        else if(user instanceof Piccolo){
            String s[] = ((Piccolo) user).defenseAttack();
            int w = Integer.parseInt(userHp.getText().toString());//user health
            int z = Integer.parseInt(s[1]);//health regen
            userHp.setText((w+z +""));
            //oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Tien
         */
        else if(user instanceof Tien){
            String s[] = ((Tien) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Trunks
         */
        else if(user instanceof Trunks){
            String s[] = ((Trunks) user).defenseAttack();
            int x = Integer.parseInt(opponentHp.getText().toString()); //opp health
            int y = Integer.parseInt(s[1]);//attack dmg
            opponentHp.setText(x-(y*userDmgMulti) + "");
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Vegeta
         */
        else if(user instanceof Vegeta){
            String s[] = ((Vegeta) user).defenseAttack();
            int x = Integer.parseInt(opponentHp.getText().toString()); //opp health
            int y = Integer.parseInt(s[1]);//attack dmg
            opponentHp.setText(x-(y*userDmgMulti) + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Yamcha
         */
        else if(user instanceof Yamcha){
            String s[] = ((Yamcha) user).defenseAttack();
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        userDef--;
        setButtonTexts();
        changeTurn();

    }

    /**
     * User Special Method
     * @param v
     */
    /*
    Goku
     */
    public void userSpecial(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.explosion);
        mediaPlayer.start();

        if(user instanceof Goku) {
            String s[] = ((Goku) user).specialAttack();
            userDmgMulti = 2;
            Toast.makeText(this,s[0],Toast.LENGTH_SHORT).show();
        }
        /*
        Gohan
         */
        else if(user instanceof Gohan){
            String s[] = ((Gohan) user).specialAttack();
            oppDmgMulti = 0;
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            opponentHp.setText(x-(y * userDmgMulti) + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Beerus
         */
        else if(user instanceof Beerus) {
            String s[] = ((Beerus) user).specialAttack();
            oppDmgMulti = 0;
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            if (userDmgMulti != 0) {
                opponentHp.setText(x / y + "");
            }
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();

        }
        /*
        Cell
         */
        else if(user instanceof Cell) {
            String s[] = ((Cell) user).specialAttack();
            int w = Integer.parseInt(userHp.getText().toString());//cell hp
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//cell loses half hp
            int z = Integer.parseInt(s[2]);//opp loses 150
            userHp.setText(w / y + "");
            opponentHp.setText((x - (z * userDmgMulti)) + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Frieza
         */
        else if(user instanceof Frieza){
            String s[] = ((Frieza) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            opponentHp.setText(x - (y*userDmgMulti) + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Hit
         */
        else if(user instanceof Hit){
            String s[] = ((Hit) user).specialAttack();
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        KidBuu
         */
        else if(user instanceof KidBuu){
            String s[] = ((KidBuu) user).specialAttack();
            int y = Integer.parseInt(s[1]);
            userHp.setText( y+"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Krillin
         */
        else if(user instanceof Krillin){
            String s[] = ((Krillin) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            opponentHp.setText( x-(y*userDmgMulti)+"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        MasterRoshi
         */
        else if(user instanceof MasterRoshi){
            String s[] = ((MasterRoshi) user).specialAttack();
            int w = Integer.parseInt(userHp.getText().toString());//roshi hp
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            int z = Integer.parseInt(s[2]);//100
            userHp.setText(w-z +"");
            opponentHp.setText(x-(y*userDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Monaka
         */
        else if(user instanceof Monaka){
            String s[] = ((Monaka) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//100
            opponentHp.setText(x-(y*userDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Monaka
         */
        else if(user instanceof Monaka){
            String s[] = ((Monaka) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//100
            opponentHp.setText(x-y +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Piccolo
         */
        else if(user instanceof Piccolo){
            String s[] = ((Piccolo) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            opponentHp.setText(x-(y*userDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Tien
         */
        else if(user instanceof Tien){
            String s[] = ((Tien) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//175
            int a = Integer.parseInt(userHp.getText().toString());//tien hp
            int b = Integer.parseInt(s[2]);//50
            userHp.setText(a-b +"");
            opponentHp.setText(x-(y*userDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Trunks
         */
        else if(user instanceof Trunks){
            String s[] = ((Trunks) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            opponentHp.setText(x-(y*userDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Vegeta
         */
        else if(user instanceof Vegeta){
            String s[] = ((Vegeta) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            int a = Integer.parseInt(userHp.getText().toString());//vegeta hp
            int b = Integer.parseInt(s[2]);//100
            userHp.setText(a-b +"");
            opponentHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Yamcha
         */
        else if(user instanceof Yamcha){
            String s[] = ((Yamcha) user).specialAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//100
            opponentHp.setText(x-(y*userDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }

        userSpec--;
        setButtonTexts();
        changeTurn();
    }

    /**
     * Opp Normal Method
     * @param v
     */
    public void oppNormal(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        mediaPlayer.start();
        if(oppDmgMulti ==0){
            Toast.makeText(this, "Your Attack Missed.", Toast.LENGTH_SHORT).show();
        }
        /*
        Goku
         */
        if(opponent instanceof Goku) {
            int x = ((Goku) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Gohan
         */
        else if(opponent instanceof Gohan){
            int x = ((Gohan) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Beerus
         */
        else if(opponent instanceof Beerus){
            int x = ((Beerus) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Cell
         */
        else if(opponent instanceof Cell){
            int x = ((Cell) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Frieza
         */
        else if(opponent instanceof Frieza){
            int x = ((Frieza) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Hit
         */
        else if(opponent instanceof Hit){
            int x = ((Hit) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        KidBuu
         */
        else if(opponent instanceof KidBuu){
            int x = ((KidBuu) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Krillin
         */
        else if(opponent instanceof Krillin){
            int x = ((Krillin) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        MasterRoshi
         */
        else if(opponent instanceof MasterRoshi){
            int x = ((MasterRoshi) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Monaka
         */
        else if(opponent instanceof Monaka){
            int x = ((Monaka) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Piccolo
         */
        else if(opponent instanceof Piccolo){
            int x = ((Piccolo) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
         Tien
         */
        else if(opponent instanceof Tien){
            int x = ((Tien) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Trunks
                */
        else if(opponent instanceof Trunks){
            int x = ((Trunks) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Vegeta
         */
        else if(opponent instanceof Vegeta){
            int x = ((Vegeta) opponent).normalAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Yamcha
         */
        else if(opponent instanceof Yamcha){
            int x = ((Yamcha) opponent).normalAttack();
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
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fireball);
        mediaPlayer.start();
        if(oppDmgMulti ==0){
            Toast.makeText(this, "Your Attack Missed.", Toast.LENGTH_SHORT).show();
        }
        if(opponent instanceof Goku) {
            int x = ((Goku) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Gohan
         */
        else if(opponent instanceof Gohan){
            int x = ((Gohan) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Beerus
         */
        else if(opponent instanceof Beerus){
            int x = ((Beerus) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Cell
         */
        else if(opponent instanceof Cell){
            int x = ((Cell) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Frieza
         */
        else if(opponent instanceof Frieza){
            int x = ((Frieza) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Hit
         */
        else if(opponent instanceof Hit){
            int x = ((Hit) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        KidBuu
         */
        else if(opponent instanceof KidBuu){
            int x = ((KidBuu) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Krillin
         */
        else if(opponent instanceof Krillin){
            int x = ((Krillin) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        MasterRoshi
         */
        else if(opponent instanceof MasterRoshi){
            int x = ((MasterRoshi) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Monaka
         */
        else if(opponent instanceof Monaka){
            int x = ((Monaka) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Piccolo
         */
        else if(opponent instanceof Piccolo){
            int x = ((Piccolo) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
         Tien
         */
        else if(opponent instanceof Tien){
            int x = ((Tien) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Trunks
                */
        else if(opponent instanceof Trunks){
            int x = ((Trunks) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Vegeta
         */
        else if(opponent instanceof Vegeta){
            int x = ((Vegeta) opponent).strongAttack();
            userHp.setText(Integer.parseInt(userHp.getText().toString())-(x * oppDmgMulti)+ "");
            oppDmgMulti = 1;
        }
        /*
        Yamcha
         */
        else if(opponent instanceof Yamcha){
            int x = ((Yamcha) opponent).strongAttack();
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
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.throwknife2);
        mediaPlayer.start();
        /*
        Goku
         */
        if(opponent instanceof Goku){
            String s[] = ((Goku) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Gohan
         */
        else if(opponent instanceof Gohan){
            String s[] = ((Gohan) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Beerus
         */
        else if(opponent instanceof Beerus){
            String s[] = ((Beerus) opponent).defenseAttack();
            int x = Integer.parseInt(userHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            userHp.setText(x-(y*oppDmgMulti) + "");
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Cell
         */
        else if(opponent instanceof Cell){
            String s[] = ((Cell) opponent).defenseAttack();
            int x = Integer.parseInt(opponentHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            opponentHp.setText(x+y + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Frieza
         */
        else if(opponent instanceof Frieza){
            String s[] = ((Frieza) opponent).defenseAttack();
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Hit
         */
        else if(opponent instanceof Hit){
            String s[] = ((Hit) opponent).defenseAttack();
            int x = Integer.parseInt(userHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            //userHp.setText(x-y + "");
            userHp.setText(x-(y*userDmgMulti) + "");
            oppDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        KidBuu
         */
        else if(opponent instanceof KidBuu){
            String s[] = ((KidBuu) opponent).defenseAttack();
            int w = Integer.parseInt(opponentHp.getText().toString());//user health
            int x = Integer.parseInt(userHp.getText().toString()); //opp health
            int y = Integer.parseInt(s[1]);//attack dmg
            int z = Integer.parseInt(s[2]);//health regen
            userHp.setText(x-(y*oppDmgMulti) + "");
            opponentHp.setText((w+z +""));
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Krillin
         */
        else if(opponent instanceof Krillin){
            String s[] = ((Krillin) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        MasterRoshi
         */
        else if(opponent instanceof MasterRoshi){
            String s[] = ((MasterRoshi) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Monaka
         */
        else if(opponent instanceof Monaka){
            String s[] = ((Monaka) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Piccolo
         */
        else if(opponent instanceof Piccolo){
            String s[] = ((Piccolo) opponent).defenseAttack();
            int w = Integer.parseInt(opponentHp.getText().toString());//user health
            int z = Integer.parseInt(s[1]);//health regen
            opponentHp.setText((w+z +""));
           // userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Tien
         */
        else if(opponent instanceof Tien){
            String s[] = ((Tien) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Trunks
         */
        else if(opponent instanceof Trunks){
            String s[] = ((Trunks) opponent).defenseAttack();
            int x = Integer.parseInt(userHp.getText().toString()); //opp health
            int y = Integer.parseInt(s[1]);//attack dmg
            userHp.setText(x-(y*oppDmgMulti) + "");
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Vegeta
         */
        else if(opponent instanceof Vegeta){
            String s[] = ((Vegeta) opponent).defenseAttack();
            int x = Integer.parseInt(userHp.getText().toString()); //opp health
            int y = Integer.parseInt(s[1]);//attack dmg
            userHp.setText(x-(y*oppDmgMulti) + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Yamcha
         */
        else if(opponent instanceof Yamcha){
            String s[] = ((Yamcha) opponent).defenseAttack();
            userDmgMulti = 0;
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }

        oppDef--;
        setButtonTexts();
        changeTurn();
    }

    /**
     * Opp Special Method
     * @param v
     */
    public void oppSpecial(View v){
        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.explosion);
        mediaPlayer.start();
        /*
        Goku
         */
        if(opponent instanceof Goku) {
            String s[] = ((Goku) opponent).specialAttack();
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
            oppDmgMulti = 2;
        }
        /*
        Gohan
         */
        else if(opponent instanceof Gohan){
            String s[] = ((Gohan) opponent).specialAttack();
            userDmgMulti = 0;
            int x = Integer.parseInt(userHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            userHp.setText(x-(y * oppDmgMulti) + "");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
                /*
        Beerus
         */
        else if(opponent instanceof Beerus){
            String s[] = ((Beerus) opponent).specialAttack();
            userDmgMulti = 0;
            if(oppDmgMulti !=0){
                int x = Integer.parseInt(userHp.getText().toString());
                int y = Integer.parseInt(s[1]);
                userHp.setText(x/y + "");
            }

            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Cell
         */
        else if(opponent instanceof Cell) {
            String s[] = ((Cell) opponent).specialAttack();
            int w = Integer.parseInt(opponentHp.getText().toString());//cell hp
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//2
            int z = Integer.parseInt(s[2]);//opp loses 150
            opponentHp.setText(w / y + "");
            userHp.setText(x-(z * oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Frieza
         */
        else if(opponent instanceof Frieza){
            String s[] = ((Frieza) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            userHp.setText( x-(y*oppDmgMulti)+"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Hit
         */
        else if(opponent instanceof Hit){
            String s[] = ((Hit) opponent).specialAttack();
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        KidBuu
         */
        else if(opponent instanceof KidBuu){
            String s[] = ((KidBuu) opponent).specialAttack();
            int y = Integer.parseInt(s[1]);
            opponentHp.setText( y+"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Krillin
         */
        else if(opponent instanceof Krillin){
            String s[] = ((Krillin) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());
            int y = Integer.parseInt(s[1]);
            userHp.setText( x-(y*oppDmgMulti)+"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        MasterRoshi
         */
        else if(opponent instanceof MasterRoshi){
            String s[] = ((MasterRoshi) opponent).specialAttack();
            int w = Integer.parseInt(opponentHp.getText().toString());//roshi hp
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            int z = Integer.parseInt(s[2]);//100
            opponentHp.setText(w-z +"");
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Monaka
         */
        else if(opponent instanceof Monaka){
            String s[] = ((Monaka) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//100
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Monaka
         */
        else if(opponent instanceof Monaka){
            String s[] = ((Monaka) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//100
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Piccolo
         */
        else if(opponent instanceof Piccolo){
            String s[] = ((Piccolo) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
         /*
        Tien
         */
        else if(opponent instanceof Tien){
            String s[] = ((Tien) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//175
            int a = Integer.parseInt(opponentHp.getText().toString());//tien hp
            int b = Integer.parseInt(s[2]);//50
            opponentHp.setText(a-b +"");
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Trunks
         */
        else if(opponent instanceof Trunks){
            String s[] = ((Trunks) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Vegeta
         */
        else if(opponent instanceof Vegeta){
            String s[] = ((Vegeta) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//150
            int a = Integer.parseInt(opponentHp.getText().toString());//vegeta hp
            int b = Integer.parseInt(s[2]);//100
            opponentHp.setText(a-b +"");
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        /*
        Yamcha
         */
        else if(opponent instanceof Yamcha){
            String s[] = ((Yamcha) opponent).specialAttack();
            int x = Integer.parseInt(userHp.getText().toString());//opp hp
            int y = Integer.parseInt(s[1]);//100
            userHp.setText(x-(y*oppDmgMulti) +"");
            Toast.makeText(this, s[0], Toast.LENGTH_SHORT).show();
        }
        oppSpec--;
        setButtonTexts();
        changeTurn();

    }


    /**
     * Resets the buttons for when the turns are swapped in two player mode.
     */
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

        /**
         * Disables the move if they run out of turns. There is only 5 moves for strong,
         * 3 for defense, and 1 for special.
         */
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
        turnCounter++;  //change turn
    }

    /**
     * Will check if there is a win and proceeds to the victory results view if there is a win.
     */
    private void checkWin(){
        DatabaseManager dbManager = new DatabaseManager(getApplicationContext());
        if(Integer.parseInt(userHp.getText().toString()) <= 0){
            Toast.makeText(this, "Guest wins", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, ResultsActivity.class);
            i.putExtra("charName", user.getName());
            i.putExtra("uName", getIntent().getStringExtra("uName"));
            i.putExtra("result", "You Lose!");
            dbManager.insertResult(getIntent().getStringExtra("uName"), user.getName(), "Loss");
            String test = getIntent().getStringExtra("uName");
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.burp_scream);
            mediaPlayer.start();
            this.startActivity(i);
        } else if(Integer.parseInt(opponentHp.getText().toString()) <= 0){
            Toast.makeText(this, "User wins", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, ResultsActivity.class);
            i.putExtra("charName", user.getName());
            i.putExtra("uName", getIntent().getStringExtra("uName"));
            i.putExtra("result", "You Win!");
            dbManager.insertResult(getIntent().getStringExtra("uName"), user.getName(), "Victory");
            String test = getIntent().getStringExtra("uName");
            MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.applause2);
            mediaPlayer.start();
            this.startActivity(i);
        }
    }
}
