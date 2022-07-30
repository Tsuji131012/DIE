package com.example.die;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


//text
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.FileReader;



public class ChoiceActivity extends AppCompatActivity {

    String dish;
    String ingredient[] = new String[10];
    StringBuilder istr = new StringBuilder("");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        //カテゴリー選択画面に遷移する
        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CategoryActivity.class);
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

        //料理選択画面から送られてきたボタンのデータを受け取る
        Intent intent = getIntent();

        //受け取ったボタンより、文字を変える
        TextView dv = findViewById(R.id.dish_text);
        TextView iv = findViewById(R.id.ingredient_text);

        int inum = 0;
        Public pl = (Public)getApplication();
        int dinum = pl.getdinum();
        boolean swi = pl.getflag();



        //ここから短縮版途中経過
        StringBuilder jdish = new StringBuilder("dish_name");
        jdish.append(dinum);
        int viewIdish = getResources().getIdentifier(jdish.toString(), "string", getPackageName());

        dish = getString(viewIdish);
        int howmany = 0;
        for (int i = 0; i < 10; i++) {
            StringBuilder j = new StringBuilder("ingredient_name");
            if (swi == false) {
                pl.seting(dinum * 50 + i, i);
            }
            j.append(pl.geting(i));
            int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
            ingredient[i] = getString(viewId);

            //これで必要な材料だけ表示できる
            if (ingredient[i].equals("・")){
                break;
            }

            istr.append(ingredient[i]);
            istr.append("\n");
            inum++;
        }
        pl.setingnum(inum);
        dv.setText(dish);
        iv.setText(istr.toString());
        /*
        switch (dinum) {
            case 0:
                pl.setingnum(4);
                dish = getString(R.string.dish_name0);
                for (int i = 0; i < 4; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    if (swi == false) {
                        pl.seting(i, i);
                    }
                    j.append(pl.geting(i));
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 1:
                pl.setingnum(4);
                dish = getString(R.string.dish_name1);
                for (int i = 0; i < 4; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 2:
                pl.setingnum(4);
                dish = getString(R.string.dish_name2);
                for (int i = 0; i < 4; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 3:
                pl.setingnum(3);
                dish = getString(R.string.dish_name3);
                for (int i = 0; i < 3; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 4:
                pl.setingnum(3);
                dish = getString(R.string.dish_name4);
                for (int i = 0; i < 3; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 5:
                pl.setingnum(5);
                dish = getString(R.string.dish_name5);
                for (int i = 0; i < 5; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 6:
                pl.setingnum(5);
                dish = getString(R.string.dish_name6);
                for (int i = 0; i < 5; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 7:
                pl.setingnum(4);
                dish = getString(R.string.dish_name7);
                for (int i = 0; i < 4; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 8:
                pl.setingnum(5);
                dish = getString(R.string.dish_name8);
                for (int i = 0; i < 5; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 9:
                pl.setingnum(5);
                dish = getString(R.string.dish_name9);
                for (int i = 0; i < 5; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 10:
                pl.setingnum(5);
                dish = getString(R.string.dish_name10);
                for (int i = 0; i < 5; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 11:
                pl.setingnum(3);
                dish = getString(R.string.dish_name11);
                for (int i = 0; i < 3; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 12:
                pl.setingnum(5);
                dish = getString(R.string.dish_name12);
                for (int i = 0; i < 5; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 13:
                pl.setingnum(4);
                dish = getString(R.string.dish_name13);
                for (int i = 0; i < 4; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 14:
                pl.setingnum(3);
                dish = getString(R.string.dish_name14);
                for (int i = 0; i < 3; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 15:
                pl.setingnum(6);
                dish = getString(R.string.dish_name15);
                for (int i = 0; i < 6; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 16:
                pl.setingnum(3);
                dish = getString(R.string.dish_name16);
                for (int i = 0; i < 3; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 17:
                pl.setingnum(3);
                dish = getString(R.string.dish_name17);
                for (int i = 0; i < 3; i++) {
                    StringBuilder j = new StringBuilder("ingredient_name");
                    j.append(dinum * 50 + i);
                    if (swi == false) {
                        pl.seting(dinum * 50 + i, i);
                    }
                    int viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                    ingredient[i] = getString(viewId);
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
        }
         */


        findViewById(R.id.button).setOnClickListener(event);

        findViewById(R.id.home).setOnClickListener(event2);
    }
}