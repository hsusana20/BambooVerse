package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PapaJohns extends AppCompatActivity {
    TextView text1, text3, text4, text5, text6;
    Button btnGO, btnBA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_papa_johns);
        text1 = findViewById(R.id.text1);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);

        btnGO = findViewById(R.id.btnGO);
        btnBA = findViewById(R.id.btnBA);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVoucher();
            }
        });

        btnGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneTime();
            }
        });

        btnBA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void openVoucher() {
        Intent intent = new Intent(this, UpdatedLandingPage.class);
        startActivity(intent);
    }

    public void openOneTime() {
        Intent intent = new Intent(this, OneTime.class);
        startActivity(intent);
    }
}