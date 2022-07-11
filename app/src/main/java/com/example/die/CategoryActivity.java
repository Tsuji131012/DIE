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

        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), CardActivity.class);
                startActivity(intent);
            }
        };

        findViewById(R.id.changebutton1).setOnClickListener(event);
        findViewById(R.id.changebutton2).setOnClickListener(event);
        findViewById(R.id.changebutton3).setOnClickListener(event);
    }


}
