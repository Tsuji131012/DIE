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

    final int DISHIES2 = 14;
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

        Intent intent = getIntent();
        int getdata =  intent.getIntExtra("SEND_DATA", 0);

        TextView tv = findViewById(R.id.dish_text);

        switch (getdata) {
            case 1:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 2:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 3:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 4:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 5:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 6:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 7:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 8:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 9:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 10:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 11:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 12:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 13:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 14:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 15:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 16:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
            case 17:
                dish = getString(R.string.dish_name);
                tv.setText(dish);
                ingredient[0] = getString(R.string.ingredient_name);
                break;
        }

        findViewById(R.id.button).setOnClickListener(event);
    }
}
