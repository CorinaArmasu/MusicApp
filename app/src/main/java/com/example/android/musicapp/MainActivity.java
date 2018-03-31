package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /** Set the content of the activity to use the activity_main.xml layout file*/
        setContentView(R.layout.activity_main);

        /**Find the View that shows the disco category*/
        TextView disco = (TextView) findViewById(R.id.disco);

        /**Set a click listener on that View*/
        disco.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the disco category is clicked on.
            @Override
            public void onClick(View view) {
                /**Create a new intent to open the DiscoActivity*/
                Intent discoIntent = new Intent(MainActivity.this, DiscoActivity.class);

                /**Start the new activity*/
                startActivity(discoIntent);
            }
        });

        /**Find the View that shows the latino category*/
        TextView latino = (TextView) findViewById(R.id.latino);

        /**Set a click listener on that View*/
        latino.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the latino category is clicked on.
            @Override
            public void onClick(View view) {
                /**Create a new intent to open the LatinoActivity*/
                Intent latinoIntent = new Intent(MainActivity.this, LatinoActivity.class);

                /**Start the new activity*/
                startActivity(latinoIntent);
            }
        });

        /**Find the View that shows the pop category*/
        TextView pop = (TextView) findViewById(R.id.pop);

        /**Set a click listener on that View*/
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop category is clicked on.
            @Override
            public void onClick(View view) {
                /**Create a new intent to open the PopActivity*/
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                /**Start the new activity*/
                startActivity(popIntent);
            }
        });
    }
}