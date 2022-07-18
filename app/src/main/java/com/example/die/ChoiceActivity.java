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

public class ChoiceActivity extends AppCompatActivity {

    String dish;
    String ingredient[] = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CategoryActivity.class);
                startActivity(intent);
            }
        };

        View.OnClickListener event2 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        };

        Intent intent = getIntent();
        int getdata =  intent.getIntExtra("SEND_DATA", 0);

        TextView tv = findViewById(R.id.dish_text);

        switch (getdata) {
            case 0:
                dish = getString(R.string.dish_name0);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name1);
                break;
            case 1:
                dish = getString(R.string.dish_name1);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name2);
                break;
            case 2:
                dish = getString(R.string.dish_name2);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name3);
                break;
            case 3:
                dish = getString(R.string.dish_name3);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name4);
                break;
            case 4:
                dish = getString(R.string.dish_name4);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name5);
                break;
            case 5:
                dish = getString(R.string.dish_name5);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name6);
                break;
            case 6:
                dish = getString(R.string.dish_name6);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name7);
                break;
            case 7:
                dish = getString(R.string.dish_name7);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name8);
                break;
            case 8:
                dish = getString(R.string.dish_name8);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name9);
                break;
            case 9:
                dish = getString(R.string.dish_name9);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name10);
                break;
            case 10:
                dish = getString(R.string.dish_name10);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name11);
                break;
            case 11:
                dish = getString(R.string.dish_name11);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name12);
                break;
            case 12:
                dish = getString(R.string.dish_name12);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name13);
                break;
            case 13:
                dish = getString(R.string.dish_name13);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name14);
                break;
            case 14:
                dish = getString(R.string.dish_name14);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name15);
                break;
            case 15:
                dish = getString(R.string.dish_name15);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name16);
                break;
            case 16:
                dish = getString(R.string.dish_name16);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name17);
                break;
            case 17:
                dish = getString(R.string.dish_name17);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name18);
                break;
        }

        findViewById(R.id.button).setOnClickListener(event);

        findViewById(R.id.home).setOnClickListener(event2);
    }
}
