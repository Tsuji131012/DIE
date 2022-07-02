package com.example.die;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


        View.OnClickListener event = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);
                startActivity(intent);
            }
        };

        findViewById(R.id.button0).setOnClickListener(event);
        findViewById(R.id.button1).setOnClickListener(event);
        findViewById(R.id.button2).setOnClickListener(event);
        findViewById(R.id.button3).setOnClickListener(event);
        findViewById(R.id.button4).setOnClickListener(event);
        findViewById(R.id.button5).setOnClickListener(event);
        findViewById(R.id.button6).setOnClickListener(event);

    }
}