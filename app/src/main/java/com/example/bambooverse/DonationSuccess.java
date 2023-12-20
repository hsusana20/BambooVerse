package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DonationSuccess extends AppCompatActivity {
    TextView txtTY;
    Button btnDa, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_success);
        txtTY = findViewById(R.id.txtTY);
        btnDa = findViewById(R.id.btnDa);
        btnBack = findViewById(R.id.btnBack);

        btnDa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void openMainActivity() {
        Intent intent = new Intent(this, OTorRC.class);
        startActivity(intent);
    }
}