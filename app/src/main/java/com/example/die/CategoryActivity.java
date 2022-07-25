package com.example.die;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CategoryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //カード選択画面に遷移する
        View.OnClickListener event = new View.OnClickListener() {



            //Mainから受け取った料理の番号
            Intent intent = getIntent();

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
