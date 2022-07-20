package com.example.die;

import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





public class CardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        //Categoryからの値の受け取り
        Intent intent = getIntent();
        int getdataC =  intent.getIntExtra("SEND_DATACARD", 0);
        int getdata = intent.getIntExtra("SEND_DATA", 0);

        //受け取った値によってさまざま
        switch (getdataC) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        }

        //料理番号
        for (int i = getdata; i < getdata+1; i++) {
            if (i == 0) {
                intent.putExtra("SEND_DATA", 0);
            } else if (i == 1) {
                intent.putExtra("SEND_DATA", 1);
            } else if (i == 2) {
                intent.putExtra("SEND_DATA", 2);
            } else if (i == 3) {
                intent.putExtra("SEND_DATA", 3);
            } else if (i == 4) {
                intent.putExtra("SEND_DATA", 4);
            } else if (i == 5) {
                intent.putExtra("SEND_DATA", 5);
            } else if (i == 6) {
                intent.putExtra("SEND_DATA", 6);
            } else if (i == 7) {
                intent.putExtra("SEND_DATA", 7);
            } else if (i == 8) {
                intent.putExtra("SEND_DATA", 8);
            } else if (i == 9) {
                intent.putExtra("SEND_DATA", 9);
            } else if (i == 10) {
                intent.putExtra("SEND_DATA", 10);
            } else if (i == 11) {
                intent.putExtra("SEND_DATA", 11);
            } else if (i == 12) {
                intent.putExtra("SEND_DATA", 12);
            } else if (i == 13) {
                intent.putExtra("SEND_DATA", 13);
            } else if (i == 14) {
                intent.putExtra("SEND_DATA", 14);
            } else if (i == 15) {
                intent.putExtra("SEND_DATA", 15);
            } else if (i == 16) {
                intent.putExtra("SEND_DATA", 16);
            } else if (i == 17) {
                intent.putExtra("SEND_DATA", 17);
            }
        }


        //料理選択画面に戻る
        View.OnClickListener event2 = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), MainActivity.class);
                startActivity(intent);
            }
        };

        findViewById(R.id.home).setOnClickListener(event2);
    }


    //text実験
    private String readFromFile(int[] ingre, int len) throws IOException {
        int count = 0;

        String result = "";
        InputStream inputStream = openFileInput("読み込むファイル名.txt");

        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


            String tempString = "";
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilder2 = new StringBuilder();

            while ((tempString = bufferedReader.readLine()) != null) {
                for (int i = 0; i < len; i++) {
                    if (count == ingre[i]) {
                        stringBuilder.append(tempString);
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
