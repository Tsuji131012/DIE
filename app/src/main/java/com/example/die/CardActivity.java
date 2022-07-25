package com.example.die;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class CardActivity extends AppCompatActivity {

    int cardnum[] = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_card);

        cardnum[0] = R.id.card0;
        cardnum[1] = R.id.card1;
        cardnum[2] = R.id.card2;

        //Categoryからの値の受け取り
        Intent intent = getIntent();
        int getdataC =  intent.getIntExtra("SEND_DATACARD", 0);
        int getdata = intent.getIntExtra("SEND_DATA", 0);
        Public pl = (Public)getApplication();
        int ingnum = pl.getnum();

        LinearLayout linearLayout = findViewById(R.id.insert_layout);

        switch (ingnum) {
            case 3:
                getLayoutInflater().inflate(R.layout.line3_layout, linearLayout);
                break;
            case 4:
                getLayoutInflater().inflate(R.layout.line4_layout, linearLayout);
                break;
            case 5:
                getLayoutInflater().inflate(R.layout.line5_layout, linearLayout);
                break;
            case 6:
                getLayoutInflater().inflate(R.layout.line6_layout, linearLayout);
                break;
        }


        //受け取った値によってさまざま
        switch (getdataC) {
            case 1:


                break;
            case 2:

                break;
            case 3:

                break;
        }

        //カードの裏返し
        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                for (int i = 0; i < 3; i++) {
                    if (v.getId() == cardnum[i]) {
                        ((ImageView) findViewById(cardnum[i])).setImageResource(R.drawable.aburaage);
                    }
                }
            }
        };

        //料理選択画面に戻る
        View.OnClickListener event2 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        };

        findViewById(R.id.card0).setOnClickListener(event);
        findViewById(R.id.card1).setOnClickListener(event);
        findViewById(R.id.card2).setOnClickListener(event);


        findViewById(R.id.home).setOnClickListener(event2);
    }
}
