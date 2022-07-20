package com.example.die;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
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


    //text実験
    private String readFromFile(int[] ingre, int len) throws IOException {
        int count = 0;

        String result = "";
        InputStream inputStream = openFileInput("読み込むファイル名.txt");

        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            String tempString = "";
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();

            while ((tempString = bufferedReader.readLine()) != null) {
                for (int i = 0; i < len; i++) {
                    if (count == ingre[i]) {
                        stringBuilder.append(tempString);
                    }
                }
                count++;
                stringBuilder2.append(tempString);
            }
            inputStream.close();
            result = stringBuilder.toString();
        }
        return result;
    }


}
