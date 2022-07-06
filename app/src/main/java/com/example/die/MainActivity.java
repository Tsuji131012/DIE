package com.example.die;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;


//xml関係
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
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

final int DISHIES = 7;
View vieww[] = new View[DISHIES];
String ryouri[] = new String[20];
String filepath = "activity_choice.xml";

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        Button button1 = findViewById(R.id.button);

        Button button1 = findViewById(R.id.button23);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);
                startActivity(intent);
            }
        });
         */

        //実験
        vieww[0]=R.id.button0;
        vieww[1]=R.id.button1;
        vieww[2]=R.id.button2;
        vieww[3]=R.id.button3;
        vieww[4]=R.id.button4;
        vieww[5]=R.id.button5;
        vieww[6]=R.id.button6;


        View.OnClickListener event = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), ChoiceActivity.class);
                startActivity(intent);

                for (int i = 0; i < DISHIES; i++) {
                    if (vieww[i] == v) {
                        ryouri[0]="ryouridayo"//excelからの読み込み
                        //変えるやつ


                        try {

                            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                            Document doc = docBuilder.parse(filepath);

                            //Get the root element
                            Node company = doc.getFirstChild();

                            //Get the staff element , it may not working if tag has spaces, or
                            //whatever weird characters in front...it's better to use
                            //getElementsByTagName() to get it directly.
                            //Node staff = company.getFirstChild();

                            //Get the staff element by tag name directly
                            Node TextView = doc.getElementsByTagName("TextView").item(0);


                            //update staff attribute
                            NamedNodeMap attr = TextView.getAttributes();
                            Node nodeAttr = attr.getNamedItem("android:text");
                            nodeAttr.setTextContent(ryouri[0]);
                        }
                            /*

                            //append a new node to staff
                            Element age = doc.createElement("age");
                            age.appendChild(doc.createTextNode("28"));
                            staff.appendChild(age);

                            //loop the staff child node
                            NodeList list = staff.getChildNodes();

                            for (int i = 0; i < list.getLength(); i++) {

                                Node node = list.item(i);

                                //get the salary element, and update the value
                                if ("salary".equals(node.getNodeName())) {
                                    node.setTextContent("2000000");
                                }

                                //remove firstname
                                if ("firstname".equals(node.getNodeName())) {
                                    staff.removeChild(node);
                                }

                            }

                            //write the content into xml file
                            TransformerFactory transformerFactory = TransformerFactory.newInstance();
                            Transformer transformer = transformerFactory.newTransformer();
                            DOMSource source = new DOMSource(doc);
                            StreamResult result = new StreamResult(new File(filepath));
                            transformer.transform(source, result);

                            System.out.println("Done");

                        } catch (ParserConfigurationException pce) {
                            pce.printStackTrace();
                        } catch (TransformerException tfe) {
                            tfe.printStackTrace();
                        } catch (IOException ioe) {
                            ioe.printStackTrace();
                        } catch (SAXException sae) {
                            sae.printStackTrace();
                        }
                        */


                        break;

                    }


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

    }
}