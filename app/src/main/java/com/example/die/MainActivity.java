package com.example.die;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    final int DISHIES1 = 18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Public pl = (Public)getApplication();

        //料理・材料確認画面に遷移し、また押したボタンのデータを渡す
        View.OnClickListener move = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);

                for (int i = 0; i < DISHIES1; i++) {
                    if (v.getId() == R.id.button0) {
                        pl.setdinum(0);
                    } else if (v.getId() == R.id.button1) {
                        pl.setdinum(1);
                    } else if (v.getId() == R.id.button2) {
                        pl.setdinum(2);
                    } else if (v.getId() == R.id.button3) {
                        pl.setdinum(3);
                    } else if (v.getId() == R.id.button4) {
                        pl.setdinum(4);
                    } else if (v.getId() == R.id.button5) {
                        pl.setdinum(5);
                    } else if (v.getId() == R.id.button6) {
                        pl.setdinum(6);
                    } else if (v.getId() == R.id.button7) {
                        pl.setdinum(7);
                    } else if (v.getId() == R.id.button8) {
                        pl.setdinum(8);
                    } else if (v.getId() == R.id.button9) {
                        pl.setdinum(9);
                    } else if (v.getId() == R.id.button10) {
                        pl.setdinum(10);
                    } else if (v.getId() == R.id.button11) {
                        pl.setdinum(11);
                    } else if (v.getId() == R.id.button12) {
                        pl.setdinum(12);
                    } else if (v.getId() == R.id.button13) {
                        pl.setdinum(13);
                    } else if (v.getId() == R.id.button14) {
                        pl.setdinum(14);
                    } else if (v.getId() == R.id.button15) {
                        pl.setdinum(15);
                    } else if (v.getId() == R.id.button16) {
                        pl.setdinum(16);
                    } else if (v.getId() == R.id.button17) {
                        pl.setdinum(17);
                    }
                }
                pl.setflag(false);
                startActivity(intent);
            }
        };

        //料理選択画面に戻る
        View.OnClickListener home = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        };


        findViewById(R.id.button0).setOnClickListener(move);
        findViewById(R.id.button1).setOnClickListener(move);
        findViewById(R.id.button2).setOnClickListener(move);
        findViewById(R.id.button3).setOnClickListener(move);
        findViewById(R.id.button4).setOnClickListener(move);
        findViewById(R.id.button5).setOnClickListener(move);
        findViewById(R.id.button6).setOnClickListener(move);
        findViewById(R.id.button7).setOnClickListener(move);
        findViewById(R.id.button8).setOnClickListener(move);
        findViewById(R.id.button9).setOnClickListener(move);
        findViewById(R.id.button10).setOnClickListener(move);
        findViewById(R.id.button11).setOnClickListener(move);
        findViewById(R.id.button12).setOnClickListener(move);
        findViewById(R.id.button13).setOnClickListener(move);
        findViewById(R.id.button14).setOnClickListener(move);
        findViewById(R.id.button15).setOnClickListener(move);
        findViewById(R.id.button16).setOnClickListener(move);
        findViewById(R.id.button17).setOnClickListener(move);

        findViewById(R.id.home).setOnClickListener(home);

    }
}