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

//テキストファイル関連
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Optional;

public class ChoiceActivity extends AppCompatActivity {


    //テキスト
    private static final File EXECUTABLE_PATH = Objects.requireNonNull(getExecutablePath());// アプリケーションの実行パス

    private static final File getExecutablePath() {
        File f = null;
        try {
            URL location = ChoiceActivity.class.getProtectionDomain().getCodeSource().getLocation();
            f = new File(location.toURI().getPath());
        } catch (java.net.URISyntaxException ex) {
            ex.printStackTrace();
        }
        return f;
    }

    final int DISHIES2 = 7;
    String dish[] = new String[20];
    int linenumber;

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

        //テキスト
        linenumber = getdata*8;
        Path path = Paths.get(EXECUTABLE_PATH.toString(), "dish.txt");
        try{
            try (BufferedReader br = Files.newBufferedReader(path)) {
                Optional<String> line = br.lines().skip(linenumber).findFirst();
                dish[0]=line.get();
            }



        dish[1] = "";

        for (int i = 0; i < DISHIES2; i++) {
            if (getdata == i) {

                TextView tv = findViewById(R.id.dish_text);
                tv.setText(dish[0]);
            }
        }

        findViewById(R.id.button).setOnClickListener(event);
    }
}
