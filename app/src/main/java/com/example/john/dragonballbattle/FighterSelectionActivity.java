package com.example.john.dragonballbattle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class FighterSelectionActivity extends AppCompatActivity {
    private Spinner charSpinner;
    private TextView moveList;
    public static Fighter selectedFighter;
    public static ImageView fighterImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fighter_selection);
        charSpinner = (Spinner) findViewById(R.id.fighterSelectionCharSpinner);
        moveList = (TextView) findViewById(R.id.fighterSelectionMoveList);
        fighterImage = (ImageView) findViewById(R.id.imageView);
        populateSpinner();
    }

    /**
     * Stores all of the fighters in one array.
     * @return all the fighters.
     */
    private Fighter[] loadFighters(){
        Fighter[] fighters = new Fighter[15];

        fighters[0] = new Goku();
        fighters[1] = new Gohan();
        fighters[2] = new Beerus();
        fighters[3] = new Cell();
        fighters[4] = new Frieza();
        fighters[5] = new Hit();
        fighters[6] = new KidBuu();
        fighters[7] = new Krillin();
        fighters[8] = new MasterRoshi();
        fighters[9] = new Monaka();
        fighters[10] = new Piccolo();
        fighters[11] = new Tien();
        fighters[12] = new Trunks();
        fighters[13] = new Vegeta();
        fighters[14] = new Yamcha();

        return fighters;
    }

    /**
     * Stores the images of the fighters from the drawable resource.
     * @return All images of the fighters.
     */
    private int[] loadFighterImages(){
        int[] fighterImages = new int[15];
        fighterImages[0] = R.drawable.goku;
        fighterImages[1] = R.drawable.gohan;
        fighterImages[2] = R.drawable.beerus;
        fighterImages[3] = R.drawable.cell;
        fighterImages[4] = R.drawable.frieza;
        fighterImages[5] = R.drawable.hit;
        fighterImages[6] = R.drawable.kidbuu;
        fighterImages[7] = R.drawable.krillin;
        fighterImages[8] = R.drawable.roshi;
        fighterImages[9] = R.drawable.monaka;
        fighterImages[10] = R.drawable.piccolo;
        fighterImages[11] = R.drawable.tien;
        fighterImages[12] = R.drawable.trunks;
        fighterImages[13] = R.drawable.vegeta;
        fighterImages[14] = R.drawable.yamcha;
        return fighterImages;
    }

    /**
     * A list of all the names of the sub classes of the fighter class.
     * @return List of fighter names
     */

    private String[] getFighterNames(){
        String[] names = new String[15];
        Fighter[] fighters = loadFighters();
        //names[0] = "Select A Fighter";
        for(int i = 0; i < loadFighters().length; i++){
            names[i] = fighters[i].getName();
        }
        return names;
    }

    /**
     * Dynamically fills the spinner with all of the characters and then will fill up
     * the text box with that characters moves. Sets the image of that fighter as well.
     */
    private void populateSpinner(){
        //Fighter selectedFigher = new Fighter();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, getFighterNames());
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        charSpinner.setAdapter(adapter);
        charSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                // Fighter currentFighter = new Fighter();
                // String text = charSpinner.getSelectedItem().toString();

                Fighter[] array = loadFighters();
                selectedFighter = array[charSpinner.getSelectedItemPosition()];
                int[] fighterImages = loadFighterImages();
                fighterImage.setImageResource(fighterImages[charSpinner.getSelectedItemPosition()]);
                moveList.setText("Normal: " + selectedFighter.getNormal()
                        + "\nStrong: " + selectedFighter.getStrong()
                        + "\nDefense: " + selectedFighter.getDefense()
                        + "\nSpecial: " + selectedFighter.getSpecial());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                fighterImage.setImageResource(R.drawable.fourstar);
            }
        });
    }

    /**
     * Upon selecting the opponent, the next activity will launch.
     * @param v
     */
    public void chooseOpponent(View v){
        Intent completeIntent = new Intent( this, OpponentSelectionActivity.class);

        completeIntent.putExtra("uName", getIntent().getStringExtra("uName"));
        this.startActivity( completeIntent );
    }

}
