package com.example.obd2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class Page5 extends AppCompatActivity {
    TextView simpleTextView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);


        simpleTextView =(TextView) findViewById(R.id.simpleTextView);

        simpleTextView.setText(" Commande de Transmission -Panne  "); //set text for text view

        simpleTextView.setTextColor(Color.RED);
    }
}
