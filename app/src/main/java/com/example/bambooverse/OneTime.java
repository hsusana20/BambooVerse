package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OneTime extends AppCompatActivity {
    TextView txtView, txtView2, txtView3, txtView4, txtView5, txtView6, txtView7, txtView8, etNumber;
    Button btnPM, btnDN, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_time);
        txtView = findViewById(R.id.txtView);
        txtView2 = findViewById(R.id.txtView2);
        txtView3 = findViewById(R.id.txtView3);
        txtView4 = findViewById(R.id.txtView4);
        txtView5 = findViewById(R.id.txtView5);
        txtView6 = findViewById(R.id.txtView6);
        txtView7 = findViewById(R.id.txtView7);
        txtView8 = findViewById(R.id.txtView8);
        etNumber = findViewById(R.id.etNumber);
        btnPM = findViewById(R.id.btnPM);
        btnDN = findViewById(R.id.btnDN);
        button3 = findViewById(R.id.button3);

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
                Intent intent = new Intent(OneTime.this, PaymentMethod.class);
                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void openDonationSuccess() {
        Intent intent = new Intent(this, DonationSuccess.class);
        startActivity(intent);

    }

    public void openMainActivity() {
        Intent intent = new Intent(this, OTorRC.class);
        startActivity(intent);
    }
}