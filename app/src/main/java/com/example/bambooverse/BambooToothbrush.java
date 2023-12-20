package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BambooToothbrush extends AppCompatActivity {
    TextView textBt, textBt2, textBt3, textBt4, textBt5, textBt6;
    Button btnG1, btnB1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamboo_toothbrush);
        textBt = findViewById(R.id.textBt);
        textBt2 = findViewById(R.id.textBt2);
        textBt3 = findViewById(R.id.textBt3);
        textBt4 = findViewById(R.id.textBt4);
        textBt5 = findViewById(R.id.textBt5);
        textBt6 = findViewById(R.id.textBt6);

        btnG1 = findViewById(R.id.btnG1);
        btnB1 = findViewById(R.id.btnB1);

        textBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVoucher();
            }
        });

        btnG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        btnB1.setOnClickListener(new View.OnClickListener() {
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