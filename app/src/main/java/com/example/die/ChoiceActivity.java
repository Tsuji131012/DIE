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
        int getdata = intent.getIntExtra("SEND_DATA", 0);

        //受け取ったボタンより、文字を変える
        TextView dv = findViewById(R.id.dish_text);
        TextView iv = findViewById(R.id.ingredient_text);


        switch (getdata) {
            case 0:
                dish = getString(R.string.dish_name0);
                ingredient[1] = getString(R.string.ingredient_name34);
                ingredient[2] = getString(R.string.ingredient_name23);
                ingredient[3] = getString(R.string.ingredient_name12);
                String j = "ingredient_name0";
                int viewId = getResources().getIdentifier(j, "string", getPackageName());
                ingredient[0] = getString(viewId);
                for (int i = 0; i < 4; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 1:
                dish = getString(R.string.dish_name1);
                ingredient[0] = getString(R.string.ingredient_name15);
                ingredient[1] = getString(R.string.ingredient_name10);
                ingredient[2] = getString(R.string.ingredient_name24);
                ingredient[3] = getString(R.string.ingredient_name0);
                for (int i = 0; i < 4; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 2:
                dish = getString(R.string.dish_name2);
                ingredient[0] = getString(R.string.ingredient_name24);
                ingredient[1] = getString(R.string.ingredient_name0);
                ingredient[2] = getString(R.string.ingredient_name3);
                ingredient[3] = getString(R.string.ingredient_name58);
                ingredient[4] = getString(R.string.ingredient_name18);
                for (int i = 0; i < 5; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 3:
                dish = getString(R.string.dish_name3);
                ingredient[0] = getString(R.string.ingredient_name10);
                ingredient[1] = getString(R.string.ingredient_name0);
                ingredient[2] = getString(R.string.ingredient_name77);
                for (int i = 0; i < 3; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 4:
                dish = getString(R.string.dish_name4);
                ingredient[0] = getString(R.string.ingredient_name10);
                ingredient[1] = getString(R.string.ingredient_name0);
                ingredient[2] = getString(R.string.ingredient_name24);
                ingredient[3] = getString(R.string.ingredient_name15);
                for (int i = 0; i < 4; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 5:
                dish = getString(R.string.dish_name5);
                ingredient[0] = getString(R.string.ingredient_name37);
                ingredient[1] = getString(R.string.ingredient_name23);
                ingredient[2] = getString(R.string.ingredient_name79);
                for (int i = 0; i < 3; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 6:
                dish = getString(R.string.dish_name6);
                ingredient[0] = getString(R.string.ingredient_name80);
                ingredient[1] = getString(R.string.ingredient_name36);
                ingredient[2] = getString(R.string.ingredient_name6);
                ingredient[3] = getString(R.string.ingredient_name0);
                ingredient[4] = getString(R.string.ingredient_name59);
                for (int i = 0; i < 5; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 7:
                dish = getString(R.string.dish_name7);
                ingredient[0] = getString(R.string.ingredient_name41);
                ingredient[1] = getString(R.string.ingredient_name37);
                ingredient[2] = getString(R.string.ingredient_name74);
                for (int i = 0; i < 3; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 8:
                dish = getString(R.string.dish_name8);
                ingredient[0] = getString(R.string.ingredient_name58);
                ingredient[1] = getString(R.string.ingredient_name23);
                ingredient[2] = getString(R.string.ingredient_name3);
                ingredient[3] = getString(R.string.ingredient_name14);
                for (int i = 0; i < 4; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 9:
                dish = getString(R.string.dish_name9);
                ingredient[0] = getString(R.string.ingredient_name0);
                ingredient[1] = getString(R.string.ingredient_name36);
                ingredient[2] = getString(R.string.ingredient_name82);
                for (int i = 0; i < 3; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 10:
                dish = getString(R.string.dish_name10);
                ingredient[0] = getString(R.string.ingredient_name83);
                ingredient[1] = getString(R.string.ingredient_name23);
                ingredient[2] = getString(R.string.ingredient_name84);
                for (int i = 0; i < 3; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 11:
                dish = getString(R.string.dish_name11);
                ingredient[0] = getString(R.string.ingredient_name3);
                ingredient[1] = getString(R.string.ingredient_name24);
                ingredient[2] = getString(R.string.ingredient_name85);
                ingredient[3] = getString(R.string.ingredient_name0);
                for (int i = 0; i < 4; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 12:
                dish = getString(R.string.dish_name12);
                ingredient[0] = getString(R.string.ingredient_name39);
                ingredient[1] = getString(R.string.ingredient_name58);
                ingredient[2] = getString(R.string.ingredient_name15);
                ingredient[3] = getString(R.string.ingredient_name24);
                ingredient[4] = getString(R.string.ingredient_name0);
                for (int i = 0; i < 5; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 13:
                dish = getString(R.string.dish_name13);
                ingredient[0] = getString(R.string.ingredient_name58);
                ingredient[1] = getString(R.string.ingredient_name0);
                ingredient[2] = getString(R.string.ingredient_name18);
                ingredient[3] = getString(R.string.ingredient_name85);
                ingredient[4] = getString(R.string.ingredient_name24);
                for (int i = 0; i < 5; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 14:
                dish = getString(R.string.dish_name14);
                ingredient[0] = getString(R.string.ingredient_name3);
                ingredient[1] = getString(R.string.ingredient_name9);
                ingredient[2] = getString(R.string.ingredient_name24);
                ingredient[3] = getString(R.string.ingredient_name23);
                ingredient[4] = getString(R.string.ingredient_name57);
                for (int i = 0; i < 5; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 15:
                dish = getString(R.string.dish_name15);
                ingredient[0] = getString(R.string.ingredient_name12);
                ingredient[1] = getString(R.string.ingredient_name65);
                ingredient[2] = getString(R.string.ingredient_name35);
                for (int i = 0; i < 3; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 16:
                dish = getString(R.string.dish_name16);
                ingredient[0] = getString(R.string.ingredient_name79);
                ingredient[1] = getString(R.string.ingredient_name86);
                ingredient[2] = getString(R.string.ingredient_name65);
                ingredient[3] = getString(R.string.ingredient_name82);
                for (int i = 0; i < 4; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
            case 17:
                dish = getString(R.string.dish_name17);
                ingredient[0] = getString(R.string.ingredient_name3);
                ingredient[1] = getString(R.string.ingredient_name24);
                ingredient[2] = getString(R.string.ingredient_name0);
                ingredient[3] = getString(R.string.ingredient_name15);
                ingredient[4] = getString(R.string.ingredient_name59);
                for (int i = 0; i < 5; i++) {
                    istr.append(ingredient[i]);
                    istr.append("\n");
                }
                dv.setText(dish);
                iv.setText(istr.toString());
                break;
        }


        findViewById(R.id.button).setOnClickListener(event);

        findViewById(R.id.home).setOnClickListener(event2);
    }

    private String readFromFile(int[] ingre, int len) throws IOException, FileNotFoundException {
        int count = 0;

        String result = "";
        InputStream inputStream = openFileInput("ingredient.txt");

        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            String tempString = "";
            String tempString2 = "";
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();

            while ((tempString = bufferedReader.readLine()) != null) {
                for (int i = 0; i < len; i++) {
                    if (count == ingre[i]) {
                        stringBuilder.append(tempString2);
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