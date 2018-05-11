package com.example.john.dragonballbattle;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        ((TextView) findViewById(R.id.resultPlayerName)).setText(getIntent().getStringExtra("uName"));
        ((TextView) findViewById(R.id.resultCharacter)).setText(getIntent().getStringExtra("charName"));
        ((TextView) findViewById(R.id.resultWinLose)).setText(getIntent().getStringExtra("result"));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Resources resources = getResources( );
        Configuration config = resources.getConfiguration( );
        if(config.orientation == Configuration.ORIENTATION_PORTRAIT){
            setupVert();
        } else if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){
            setupHor();
        } else {
            Log.w( "MA", "Undetermined position" );
        }
    }

    private void setupHor(){
        ((TextView) findViewById(R.id.resultTitle)).setPadding(0, 0, 0, convertToDP(50));
        ((TextView) findViewById(R.id.resultPlayerName)).setPadding(0, 0, 0, convertToDP(30));
        ((TextView) findViewById(R.id.resultCharacter)).setPadding(0, 0, 0, convertToDP(30));
        ((TextView) findViewById(R.id.resultWinLose)).setPadding(0, 0, 0, convertToDP(50));
    }

    private void setupVert(){
        ((TextView) findViewById(R.id.resultTitle)).setPadding(0, 0, 0, convertToDP(120));
        ((TextView) findViewById(R.id.resultPlayerName)).setPadding(0, 0, 0, convertToDP(80));
        ((TextView) findViewById(R.id.resultCharacter)).setPadding(0, 0, 0, convertToDP(80));
        ((TextView) findViewById(R.id.resultWinLose)).setPadding(0, 0, 0, convertToDP(120));
    }

    private int convertToDP(int padding){
        return (int) (padding * getResources().getDisplayMetrics().density + 0.5f);
    }
}
