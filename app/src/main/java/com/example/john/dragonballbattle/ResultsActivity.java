package com.example.john.dragonballbattle;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

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
        ((TextView) findViewById(R.id.resultWinLose)).setPadding(0, 0, 0, convertToDP(30));
    }

    private void setupVert(){
        ((TextView) findViewById(R.id.resultTitle)).setPadding(0, 0, 0, convertToDP(120));
        ((TextView) findViewById(R.id.resultPlayerName)).setPadding(0, 0, 0, convertToDP(80));
        ((TextView) findViewById(R.id.resultCharacter)).setPadding(0, 0, 0, convertToDP(80));
        ((TextView) findViewById(R.id.resultWinLose)).setPadding(0, 0, 0, convertToDP(80));
    }

    private int convertToDP(int padding){
        return (int) (padding * getResources().getDisplayMetrics().density + 0.5f);
    }

    public void viewStats(View v){
        DatabaseManager dbManager = new DatabaseManager(getApplicationContext());
        ArrayList<String> results = dbManager.getAllResutls();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Results");
        LinearLayout linearLayout = new LinearLayout(this);
        ScrollView scrollView = new ScrollView(this);
        LinearLayout innerLinearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.addView(scrollView);
        scrollView.addView(innerLinearLayout);
        innerLinearLayout.setOrientation(LinearLayout.VERTICAL);
        TextView t;
        for(String s : results){
            t = new TextView(this);
            t.setText(s);
            t.setTextColor(Color.WHITE);
            t.setBackgroundColor(Color.GRAY);
            String gg = s;
            innerLinearLayout.addView(t);
        }
        builder.setNeutralButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.setView(linearLayout);
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void goToMain(View v){
        Intent i=new Intent(this, FighterSelectionActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
