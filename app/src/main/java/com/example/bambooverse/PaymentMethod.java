package com.example.bambooverse;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bambooverse.R;

public class PaymentMethod extends AppCompatActivity {

    Button btnOpen, btnBack;
    TextView textPayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);

        btnOpen = findViewById(R.id.btnOpen);
        btnBack = findViewById(R.id.btnBack);
        textPayment = findViewById(R.id.textPayment);
        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGCashApp();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOneTime();
            }
        });
    }

    private void openGCashApp() {
        String gcashWebsiteUrl = "https://www.new.gcash.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gcashWebsiteUrl));
        startActivity(intent);
    }




    private void openOneTime() {
        Intent intent = new Intent(this, OneTime.class);
        startActivity(intent);
    }
}