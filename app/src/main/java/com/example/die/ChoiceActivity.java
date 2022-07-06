package com.example.die;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChoiceActivity extends AppCompatActivity {

    final int DISHIES2 = 7;
    String dish[] = new String[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        Intent intent = getIntent();
        int getdata =  intent.getIntExtra("SEND_DATA", 0);

        dish[0] = "ryouridayo";
        dish[1] = "";

        for (int i = 0; i < DISHIES2; i++) {
            if (getdata == i) {

                TextView tv = findViewById(R.id.dish_text);
                tv.setText(dish[0]);
            }
        }

    }
}
