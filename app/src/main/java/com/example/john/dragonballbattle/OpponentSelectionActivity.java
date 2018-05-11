package com.example.john.dragonballbattle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OpponentSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opponent_selection);
    }


    public void playGame(View v){
        Intent completeIntent = new Intent( this, BattleActivity.class);
        completeIntent.putExtra("uName", getIntent().getStringExtra("uName"));
        this.startActivity( completeIntent );
    }

    public void guestSelection(View v){
        Intent completeIntent = new Intent( this, GuestActivity.class);
        completeIntent.putExtra("uName", getIntent().getStringExtra("uName"));
        this.startActivity( completeIntent );
    }
}
