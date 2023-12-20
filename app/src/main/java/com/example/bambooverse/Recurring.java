package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Recurring extends AppCompatActivity {
    TextView txtView, txtView2, txtView3, txtView4, txtView5, txtView6, txtView7, txtView8, etNumber;
    Button btnWeek, btnMonth, btnQuart, btnPM, btnDN, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recurring);
        txtView = findViewById(R.id.txtView);
        txtView2 = findViewById(R.id.txtView2);
        txtView3 = findViewById(R.id.txtView3);
        txtView4 = findViewById(R.id.txtView4);
        txtView5 = findViewById(R.id.txtView5);
        txtView6 = findViewById(R.id.txtView6);
        txtView7 = findViewById(R.id.txtView7);
        txtView8 = findViewById(R.id.txtView8);
        etNumber = findViewById(R.id.etNumber);
        btnWeek = findViewById(R.id.btnWeek);
        btnMonth = findViewById(R.id.btnMonth);
        btnQuart = findViewById(R.id.btnQuart);
        btnPM = findViewById(R.id.btnPM);
        btnDN = findViewById(R.id.btnDN);
        button3 = findViewById(R.id.button3);

        btnWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Recurring.this, "Your choice is WEEKLY", Toast.LENGTH_SHORT).show();
            }
        });

        btnMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Recurring.this, "Your choice is MONTHLY", Toast.LENGTH_SHORT).show();
            }
        });

        btnQuart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Recurring.this, "Your choice is QUARTERLY", Toast.LENGTH_SHORT).show();

            }
        });

        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = etNumber.getText().toString();
                openDonationSuccess();
            }
        });

        btnPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Recurring.this, PaymentMethod.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void openDonationSuccess() {
        Intent intent = new Intent(this, DonationSuccess.class);
        startActivity(intent);
    }
}