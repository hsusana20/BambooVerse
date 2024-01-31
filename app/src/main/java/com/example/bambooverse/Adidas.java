package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adidas extends AppCompatActivity {
    TextView txtPb, txtPb2, txtPb3, txtPb4, txtPb5, txtPb6;
    Button btnGd, btnBk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adidas);
        txtPb = findViewById(R.id.txtPb);
        txtPb2 = findViewById(R.id.txtPb2);
        txtPb3 = findViewById(R.id.txtPb3);
        txtPb4 = findViewById(R.id.txtPb4);
        txtPb5 = findViewById(R.id.txtPb5);
        txtPb6 = findViewById(R.id.txtPb6);

        btnGd = findViewById(R.id.btnGd);
        btnBk = findViewById(R.id.btnBk);

        txtPb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVoucher();
            }
        });

        btnGd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneTime();
            }
        });

        btnBk.setOnClickListener(new View.OnClickListener() {
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