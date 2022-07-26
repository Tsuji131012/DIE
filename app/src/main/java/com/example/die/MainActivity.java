package com.example.die;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


//xml関係
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class MainActivity extends AppCompatActivity {

    final int DISHIES1 = 18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Public pl = (Public)getApplication();

        //料理・材料確認画面に遷移し、また押したボタンのデータを渡す
        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);

                for (int i = 0; i < DISHIES1; i++) {
                    if (v.getId() == R.id.button0) {
                        pl.setdinum(0);
                    } else if (v.getId() == R.id.button1) {
                        pl.setdinum(1);
                    } else if (v.getId() == R.id.button2) {
                        pl.setdinum(2);
                    } else if (v.getId() == R.id.button3) {
                        pl.setdinum(3);
                    } else if (v.getId() == R.id.button4) {
                        pl.setdinum(4);
                    } else if (v.getId() == R.id.button5) {
                        pl.setdinum(5);
                    } else if (v.getId() == R.id.button6) {
                        pl.setdinum(6);
                    } else if (v.getId() == R.id.button7) {
                        pl.setdinum(7);
                    } else if (v.getId() == R.id.button8) {
                        pl.setdinum(8);
                    } else if (v.getId() == R.id.button9) {
                        pl.setdinum(9);
                    } else if (v.getId() == R.id.button10) {
                        pl.setdinum(10);
                    } else if (v.getId() == R.id.button11) {
                        pl.setdinum(11);
                    } else if (v.getId() == R.id.button12) {
                        pl.setdinum(12);
                    } else if (v.getId() == R.id.button13) {
                        pl.setdinum(13);
                    } else if (v.getId() == R.id.button14) {
                        pl.setdinum(14);
                    } else if (v.getId() == R.id.button15) {
                        pl.setdinum(15);
                    } else if (v.getId() == R.id.button16) {
                        pl.setdinum(16);
                    } else if (v.getId() == R.id.button17) {
                        pl.setdinum(17);
                    }
                }
                pl.setflag(false);
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


        findViewById(R.id.button0).setOnClickListener(event);
        findViewById(R.id.button1).setOnClickListener(event);
        findViewById(R.id.button2).setOnClickListener(event);
        findViewById(R.id.button3).setOnClickListener(event);
        findViewById(R.id.button4).setOnClickListener(event);
        findViewById(R.id.button5).setOnClickListener(event);
        findViewById(R.id.button6).setOnClickListener(event);
        findViewById(R.id.button7).setOnClickListener(event);
        findViewById(R.id.button8).setOnClickListener(event);
        findViewById(R.id.button9).setOnClickListener(event);
        findViewById(R.id.button10).setOnClickListener(event);
        findViewById(R.id.button11).setOnClickListener(event);
        findViewById(R.id.button12).setOnClickListener(event);
        findViewById(R.id.button13).setOnClickListener(event);
        findViewById(R.id.button14).setOnClickListener(event);
        findViewById(R.id.button15).setOnClickListener(event);
        findViewById(R.id.button16).setOnClickListener(event);
        findViewById(R.id.button17).setOnClickListener(event);

        findViewById(R.id.home).setOnClickListener(event2);

    }
}