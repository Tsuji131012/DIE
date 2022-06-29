package com.example.die;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

finish int DISHIES = 20;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main2);
        /*
        Button button1 = findViewById(R.id.button);

        Button button1 = findViewById(R.id.button23);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);
                startActivity(intent);
            }
        });
         */

        //実験



        Button dishies[] = new Button[DISHIES];

        for (int i = 0;i < DISHIES;i++){
            dishies[i] = findViewById(R.id.button[i]);

            dishies[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplication(), ChoiceActivity.class);
                    startActivity(intent);
                }
            });
        }

        //tttttt

    }
}