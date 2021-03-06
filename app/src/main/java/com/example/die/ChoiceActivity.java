package com.example.die;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;



public class ChoiceActivity extends AppCompatActivity {

    String dish;
    String ingredient[] = new String[10];
    StringBuilder istr = new StringBuilder("");
    int howmany = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        //カテゴリー選択画面に遷移する
        View.OnClickListener move = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CategoryActivity.class);
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

        //料理選択画面から送られてきたボタンのデータを受け取る
        Intent intent = getIntent();

        //受け取ったボタンより、文字を変える
        TextView dv = findViewById(R.id.dish_text);
        TextView iv = findViewById(R.id.ingredient_text);

        Public pl = (Public)getApplication();
        int dinum = pl.getdinum();
        boolean swi = pl.getflag();



        //料理と材料の表示
        StringBuilder jdish = new StringBuilder("dish_name");
        jdish.append(dinum);
        int viewIdish = getResources().getIdentifier(jdish.toString(), "string", getPackageName());

        if (!swi) {
            dish = getString(viewIdish);
        } else {
            dish = "〇 " + getString(viewIdish);
        }

        for (int i = 0; i < 10; i++) {
            StringBuilder j = new StringBuilder("ingredient_name");
            if (!swi) {
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
            howmany++;
        }
        pl.setingnum(howmany);
        dv.setText(dish);
        iv.setText(istr.toString());

        findViewById(R.id.button).setOnClickListener(move);

        findViewById(R.id.home).setOnClickListener(home);
    }
}