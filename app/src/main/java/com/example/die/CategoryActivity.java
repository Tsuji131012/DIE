package com.example.die;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

public class CategoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //カード選択画面に遷移する
        View.OnClickListener move = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CardActivity.class);
                //Cardに渡す値
                for (int i = 1; i < 4; i++) {
                    if (v.getId() == R.id.changebutton1) {
                        //おさえめ
                        intent.putExtra("SEND_DATACARD", 1);
                    } else if (v.getId() == R.id.changebutton2) {
                        //やばい
                        intent.putExtra("SEND_DATACARD", 2);
                    } else if (v.getId() == R.id.changebutton3) {
                        //やばすぎる
                        intent.putExtra("SEND_DATACARD", 3);
                    }
                }
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


        findViewById(R.id.changebutton1).setOnClickListener(move);
        findViewById(R.id.changebutton2).setOnClickListener(move);
        findViewById(R.id.changebutton3).setOnClickListener(move);

        findViewById(R.id.home).setOnClickListener(home);
    }


}
