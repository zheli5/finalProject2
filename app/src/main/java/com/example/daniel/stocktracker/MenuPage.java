package com.example.daniel.stocktracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.widget.Toast;

public class MenuPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGoogleInc();
            }

        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAppleInc();
            }

        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDowJones();
            }

        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSP500();
            }

        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNASDAQ();
            }

        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMicrosoftInc();
            }

        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBOA_Inc();
            }

        });
    }
    public void openGoogleInc() {
        Intent intent = new Intent(this, GoogleInc.class);
        startActivity(intent);
    }

    public void openAppleInc() {
        Intent intent = new Intent(this, AppleInc.class);
        startActivity(intent);
    }

    public void openDowJones() {
        Intent intent = new Intent(this, DowJones.class);
        startActivity(intent);
    }

    public void openSP500() {
        Intent intent = new Intent(this, SP500.class);
        startActivity(intent);
    }

    public void openNASDAQ() {
        Intent intent = new Intent(this, NASDAQ.class);
        startActivity(intent);
    }

    public void openMicrosoftInc() {
        Intent intent = new Intent(this, MicrosoftInc.class);
        startActivity(intent);
    }

    public void openBOA_Inc() {
        Intent intent = new Intent(this, BOA_Inc.class);
        startActivity(intent);
    }




    /*@Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.button2:
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }*/
}
