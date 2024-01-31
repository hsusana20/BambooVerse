package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BambooCups extends AppCompatActivity {
    TextView textBc, textBc2, textBc3, textBc4, textBc5, textBc6;
    Button btnGT, btnBK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamboo_cups);
        textBc = findViewById(R.id.textBc);
        textBc2 = findViewById(R.id.textBc2);
        textBc3 = findViewById(R.id.textBc3);
        textBc4 = findViewById(R.id.textBc4);
        textBc5 = findViewById(R.id.textBc5);
        textBc6 = findViewById(R.id.textBc6);

        btnGT = findViewById(R.id.btnGT);
        btnBK = findViewById(R.id.btnBK);

        textBc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVoucher();
            }
        });

        btnGT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneTime();
            }
        });

        btnBK.setOnClickListener(new View.OnClickListener() {
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