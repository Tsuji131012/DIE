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
import java.util.Random;


public class CardActivity extends AppCompatActivity {

    int cardnum[] = new int[3];
    int ingredientnum[] = new int[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_card);

        cardnum[0] = R.id.card0;
        cardnum[1] = R.id.card1;
        cardnum[2] = R.id.card2;

        ingredientnum[0] =R.id.ingredient0;
        ingredientnum[1] =R.id.ingredient1;
        ingredientnum[2] =R.id.ingredient2;
        ingredientnum[3] =R.id.ingredient3;
        ingredientnum[4] =R.id.ingredient4;
        ingredientnum[5] =R.id.ingredient5;

        //Categoryからの値の受け取り
        Intent intent = getIntent();
        int getdataC =  intent.getIntExtra("SEND_DATACARD", 0);
        Public pl = (Public)getApplication();
        int dinum = pl.getdinum();
        int ingnum = pl.getingnum();
        int viewId;
        int[] viewIdnum = new int[3];
        String ing;

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

        for (int i = 0; i < ingnum; i++) {
            StringBuilder j = new StringBuilder("image_name");
            j.append(dinum * 50 + i);
            viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
            ing = getString(viewId);
            viewId = getResources().getIdentifier(ing, "drawable", getPackageName());
            viewIdnum[i] = viewId;
            ((ImageView) findViewById(ingredientnum[i])).setImageResource(viewId);
        }


        //受け取った値によってさまざま
        switch (getdataC) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    do {
                        Random random = new Random();
                        int r = random.nextInt(20);
                        StringBuilder j = new StringBuilder("image_name");
                        j.append(dinum * 50 + 10 + r);
                        viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                        ing = getString(viewId);
                    } while (ing.equals(""));

                    viewId = getResources().getIdentifier(ing, "drawable", getPackageName());
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    Random random = new Random();
                    int randomValue = random.nextInt(20);

                }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    Random random = new Random();
                    int randomValue = random.nextInt(20);

                }
                break;
        }

        //カードの裏返し
        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                for (int i = 0; i < 3; i++) {
                    if (v.getId() == cardnum[i]) {
                        ((ImageView) findViewById(cardnum[i])).setImageResource(viewIdnum[i]);
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
