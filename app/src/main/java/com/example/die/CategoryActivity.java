package com.example.die;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //カード選択画面に遷移する
        View.OnClickListener event = new View.OnClickListener() {



            //Choiceから受け取った料理の番号
            Intent intent = getIntent();
            int getdata =  intent.getIntExtra("SEND_DATA", 0);

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CardActivity.class);
                //Cardに渡す値
                for (int i = 1; i < 4; i++) {
                    if (v.getId() == R.id.changebutton1) {
                        intent.putExtra("SEND_DATACARD", 1);
                    } else if (v.getId() == R.id.changebutton2) {
                        intent.putExtra("SEND_DATACARD", 2);
                    } else if (v.getId() == R.id.changebutton3) {
                        intent.putExtra("SEND_DATACARD", 3);
                    }
                }
                //料理番号
                for (int i = getdata; i < getdata+1; i++) {
                    if (i == 0) {
                        intent.putExtra("SEND_DATA", 0);
                    } else if (i == 1) {
                        intent.putExtra("SEND_DATA", 1);
                    } else if (i == 2) {
                        intent.putExtra("SEND_DATA", 2);
                    } else if (i == 3) {
                        intent.putExtra("SEND_DATA", 3);
                    } else if (i == 4) {
                        intent.putExtra("SEND_DATA", 4);
                    } else if (i == 5) {
                        intent.putExtra("SEND_DATA", 5);
                    } else if (i == 6) {
                        intent.putExtra("SEND_DATA", 6);
                    } else if (i == 7) {
                        intent.putExtra("SEND_DATA", 7);
                    } else if (i == 8) {
                        intent.putExtra("SEND_DATA", 8);
                    } else if (i == 9) {
                        intent.putExtra("SEND_DATA", 9);
                    } else if (i == 10) {
                        intent.putExtra("SEND_DATA", 10);
                    } else if (i == 11) {
                        intent.putExtra("SEND_DATA", 11);
                    } else if (i == 12) {
                        intent.putExtra("SEND_DATA", 12);
                    } else if (i == 13) {
                        intent.putExtra("SEND_DATA", 13);
                    } else if (i == 14) {
                        intent.putExtra("SEND_DATA", 14);
                    } else if (i == 15) {
                        intent.putExtra("SEND_DATA", 15);
                    } else if (i == 16) {
                        intent.putExtra("SEND_DATA", 16);
                    } else if (i == 17) {
                        intent.putExtra("SEND_DATA", 17);
                    }
                }
                startActivity(intent);
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


        findViewById(R.id.changebutton1).setOnClickListener(event);
        findViewById(R.id.changebutton2).setOnClickListener(event);
        findViewById(R.id.changebutton3).setOnClickListener(event);

        findViewById(R.id.home).setOnClickListener(event2);
    }


}
