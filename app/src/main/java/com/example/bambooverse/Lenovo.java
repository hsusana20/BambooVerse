package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Lenovo extends AppCompatActivity {
    TextView txT1, txT2, txT3, txT4, txT5, txT6;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovo);
        txT1 = findViewById(R.id.txT1);
        txT2 = findViewById(R.id.txT2);
        txT3 = findViewById(R.id.txT3);
        txT4 = findViewById(R.id.txT4);
        txT5 = findViewById(R.id.txT5);
        txT6 = findViewById(R.id.txT6);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        txT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVoucher();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
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

    public void openMainActivity() {
        Intent intent = new Intent(this, OTorRC.class);
        startActivity(intent);
    }
}