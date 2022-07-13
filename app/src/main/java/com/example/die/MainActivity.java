package com.example.die;

import androidx.appcompat.app.AppCompatActivity;

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
    View vieww[] = new View[DISHIES1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vieww[0]=findViewById(R.id.button0);
        vieww[1]=findViewById(R.id.button1);
        vieww[2]=findViewById(R.id.button2);
        vieww[3]=findViewById(R.id.button3);
        vieww[4]=findViewById(R.id.button4);
        vieww[5]=findViewById(R.id.button5);
        vieww[6]=findViewById(R.id.button6);
        vieww[7]=findViewById(R.id.button7);
        vieww[8]=findViewById(R.id.button8);
        vieww[9]=findViewById(R.id.button9);
        vieww[10]=findViewById(R.id.button10);
        vieww[11]=findViewById(R.id.button11);
        vieww[12]=findViewById(R.id.button12);
        vieww[13]=findViewById(R.id.button13);
        vieww[14]=findViewById(R.id.button14);
        vieww[15]=findViewById(R.id.button15);
        vieww[16]=findViewById(R.id.button16);
        vieww[17]=findViewById(R.id.button17);


        View.OnClickListener event = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);
                startActivity(intent);


                for (int i = 0; i < DISHIES1; i++) {
                    if (vieww[i] == v) {
                        String j = String.valueOf(i);
                        intent.putExtra("SEND_DATA", j);

                    }

                }
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

    }
}