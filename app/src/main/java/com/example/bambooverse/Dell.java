package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dell extends AppCompatActivity {
    TextView txtD1, txtD2, txtD3, txtD4, txtD5, txtD6;
    Button btnGtd1, btnBack2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dell);
        txtD1 = findViewById(R.id.txtD1);
        txtD2 = findViewById(R.id.txtD2);
        txtD3 = findViewById(R.id.txtD3);
        txtD4 = findViewById(R.id.txtD4);
        txtD5 = findViewById(R.id.txtD5);
        txtD6 = findViewById(R.id.txtD6);

        btnGtd1 = findViewById(R.id.btnGtd1);
        btnBack2 = findViewById(R.id.btnBack2);

        txtD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVoucher();
            }
        });

        btnGtd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneTime();
            }
        });

        btnBack2.setOnClickListener(new View.OnClickListener() {
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