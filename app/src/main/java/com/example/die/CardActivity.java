package com.example.die;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;


public class CardActivity extends AppCompatActivity {

    int cardnum[] = new int[3];
    int ingredientnum[] = new int[6];
    boolean swi = true;
    boolean swi2 = true;
    int[] choose = new int[3];
    int mainch, viewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_card);

        cardnum[0] = R.id.card0;
        cardnum[1] = R.id.card1;
        cardnum[2] = R.id.card2;

        ingredientnum[0] =R.id.ingredient0;
        ingredientnum[1] =R.id.ingredient1;
        ingredientnum[2] =R.id.ingredient2;
        ingredientnum[3] =R.id.ingredient3;
        ingredientnum[4] =R.id.ingredient4;
        ingredientnum[5] =R.id.ingredient5;

        //Categoryからの値の受け取り
        Intent intent = getIntent();
        int getdataC =  intent.getIntExtra("SEND_DATACARD", 0);
        Public pl = (Public)getApplication();
        int dinum = pl.getdinum();
        int ingnum = pl.getingnum();
        int[] viewIdnum = new int[3];
        String ing;

        //材料の個数判断と表示
        LinearLayout linearLayout = findViewById(R.id.insert_layout);

        switch (ingnum) {
            case 3:
                getLayoutInflater().inflate(R.layout.line3_layout, linearLayout);
                break;
            case 4:
                getLayoutInflater().inflate(R.layout.line4_layout, linearLayout);
                break;
            case 5:
                getLayoutInflater().inflate(R.layout.line5_layout, linearLayout);
                break;
            case 6:
                getLayoutInflater().inflate(R.layout.line6_layout, linearLayout);
                break;
        }

        //材料のイラスト貼り付け
        for (int i = 0; i < ingnum; i++) {
            StringBuilder j = new StringBuilder("image_name");
            j.append(pl.geting(i));
            viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
            ing = getString(viewId);
            viewId = getResources().getIdentifier(ing, "drawable", getPackageName());
            ((ImageView) findViewById(ingredientnum[i])).setImageResource(viewId);
        }


        //置き換える材料の貼り付け
        switch (getdataC) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    do {
                        Random random = new Random();
                        int r = random.nextInt(20);
                        StringBuilder j = new StringBuilder("image_name");
                        j.append(dinum * 50 + 10 + r);
                        choose[i] = dinum * 50 + 10 + r;
                        viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                        ing = getString(viewId);
                    } while (ing.equals(""));

                    viewId = getResources().getIdentifier(ing, "drawable", getPackageName());
                    viewIdnum[i] = viewId;
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    do {
                        Random random = new Random();
                        int r = random.nextInt(10);
                        StringBuilder j = new StringBuilder("image_name");
                        j.append(dinum * 50 + 30 + r);
                        choose[i] = dinum * 50 + 30 + r;
                        viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                        ing = getString(viewId);
                    } while (ing.equals(""));

                    viewId = getResources().getIdentifier(ing, "drawable", getPackageName());
                    viewIdnum[i] = viewId;
                }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    do {
                        Random random = new Random();
                        int r = random.nextInt(10);
                        StringBuilder j = new StringBuilder("image_name");
                        j.append(dinum * 50 + 40 + r);
                        choose[i] = dinum * 50 + 40 + r;
                        viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                        ing = getString(viewId);
                    } while (ing.equals(""));

                    viewId = getResources().getIdentifier(ing, "drawable", getPackageName());
                    viewIdnum[i] = viewId;
                }
                break;
        }

        //カードの裏返し
        View.OnClickListener event = new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                for (int i = 0; i < 3; i++) {
                    if (v.getId() == cardnum[i] && swi) {
                        ((ImageView) findViewById(cardnum[i])).setImageResource(viewIdnum[i]);
                        mainch = i;
                        swi = false;
                    }
                }
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

        //材料を置き換える
        View.OnClickListener event3 = new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                if(swi == false && swi2) {
                    for (int i = 0; i < 6; i++) {
                        if (v.getId() == ingredientnum[i]) {
                            ((ImageView) findViewById(ingredientnum[i])).setImageResource(viewIdnum[mainch]);

                            StringBuilder j = new StringBuilder("image_name");
                            j.append(pl.geting(i));
                            viewId = getResources().getIdentifier(j.toString(), "string", getPackageName());
                            viewId = getResources().getIdentifier(getString(viewId), "drawable", getPackageName());
                            ((ImageView) findViewById(cardnum[mainch])).setImageResource(viewId);

                            pl.seting(choose[mainch], i);
                            swi2 = false;
                        }
                    }
                    pl.setflag(true);

                    PopupWindow mPopupWindow = new PopupWindow(CardActivity.this);

                    // レイアウト設定
                    View popupView = getLayoutInflater().inflate(R.layout.popup, null);
                    popupView.findViewById(R.id.out_button).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplication(), ChoiceActivity.class);
                            startActivity(intent);
                            if (mPopupWindow.isShowing()) {
                                mPopupWindow.dismiss();
                            }
                        }
                    });

                    popupView.findViewById(R.id.continue_button).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(getApplication(), CategoryActivity.class);
                            startActivity(intent);
                            if (mPopupWindow.isShowing()) {
                                mPopupWindow.dismiss();
                            }
                        }
                    });
                    mPopupWindow.setContentView(popupView);

                    // 背景設定
                    mPopupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_main, null));

                    // タップ時に他のViewでキャッチされないための設定
                    mPopupWindow.setOutsideTouchable(false);
                    mPopupWindow.setFocusable(false);

                    // 表示サイズの設定 今回は幅300dp
                    float width = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 350, getResources().getDisplayMetrics());
                    float height = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 380, getResources().getDisplayMetrics());
                    mPopupWindow.setWidth((int) width);
                    mPopupWindow.setHeight((int) height);

                    // 画面中央に表示
                    mPopupWindow.showAtLocation(findViewById(R.id.card0), Gravity.CENTER, 0, 0);
                }
            }
        };

        findViewById(R.id.card0).setOnClickListener(event);
        findViewById(R.id.card1).setOnClickListener(event);
        findViewById(R.id.card2).setOnClickListener(event);

        if (ingnum == 3) {
            findViewById(ingredientnum[0]).setOnClickListener(event3);
            findViewById(ingredientnum[1]).setOnClickListener(event3);
            findViewById(ingredientnum[2]).setOnClickListener(event3);
        } else if (ingnum == 4) {
            findViewById(ingredientnum[0]).setOnClickListener(event3);
            findViewById(ingredientnum[1]).setOnClickListener(event3);
            findViewById(ingredientnum[2]).setOnClickListener(event3);
            findViewById(ingredientnum[3]).setOnClickListener(event3);
        } else if (ingnum == 5) {
            findViewById(ingredientnum[0]).setOnClickListener(event3);
            findViewById(ingredientnum[1]).setOnClickListener(event3);
            findViewById(ingredientnum[2]).setOnClickListener(event3);
            findViewById(ingredientnum[3]).setOnClickListener(event3);
            findViewById(ingredientnum[4]).setOnClickListener(event3);
        } else if (ingnum == 6) {
            findViewById(ingredientnum[0]).setOnClickListener(event3);
            findViewById(ingredientnum[1]).setOnClickListener(event3);
            findViewById(ingredientnum[2]).setOnClickListener(event3);
            findViewById(ingredientnum[3]).setOnClickListener(event3);
            findViewById(ingredientnum[4]).setOnClickListener(event3);
            findViewById(ingredientnum[5]).setOnClickListener(event3);
        }


        findViewById(R.id.home).setOnClickListener(event2);
    }
}
