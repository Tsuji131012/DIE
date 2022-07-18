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


        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);

                for (int i = 0; i < DISHIES1; i++) {
                    if (v.getId() == R.id.button0) {
                        intent.putExtra("SEND_DATA", 0);
                    } else if (v.getId() == R.id.button1) {
                        intent.putExtra("SEND_DATA", 1);
                    } else if (v.getId() == R.id.button2) {
                        intent.putExtra("SEND_DATA", 2);
                    } else if (v.getId() == R.id.button3) {
                        intent.putExtra("SEND_DATA", 3);
                    } else if (v.getId() == R.id.button4) {
                        intent.putExtra("SEND_DATA", 4);
                    } else if (v.getId() == R.id.button5) {
                        intent.putExtra("SEND_DATA", 5);
                    } else if (v.getId() == R.id.button6) {
                        intent.putExtra("SEND_DATA", 6);
                    } else if (v.getId() == R.id.button7) {
                        intent.putExtra("SEND_DATA", 7);
                    } else if (v.getId() == R.id.button8) {
                        intent.putExtra("SEND_DATA", 8);
                    } else if (v.getId() == R.id.button9) {
                        intent.putExtra("SEND_DATA", 9);
                    } else if (v.getId() == R.id.button10) {
                        intent.putExtra("SEND_DATA", 10);
                    } else if (v.getId() == R.id.button11) {
                        intent.putExtra("SEND_DATA", 11);
                    } else if (v.getId() == R.id.button12) {
                        intent.putExtra("SEND_DATA", 12);
                    } else if (v.getId() == R.id.button13) {
                        intent.putExtra("SEND_DATA", 13);
                    } else if (v.getId() == R.id.button14) {
                        intent.putExtra("SEND_DATA", 14);
                    } else if (v.getId() == R.id.button15) {
                        intent.putExtra("SEND_DATA", 15);
                    } else if (v.getId() == R.id.button16) {
                        intent.putExtra("SEND_DATA", 16);
                    } else if (v.getId() == R.id.button17) {
                        intent.putExtra("SEND_DATA", 17);
                    }
                }
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