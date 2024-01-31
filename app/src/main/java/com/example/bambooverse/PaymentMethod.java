package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentMethod extends AppCompatActivity {
    TextView textView;
    Button btnG, btnBP, button3, button4;
    String selectedPaymentMethod;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
        textView = findViewById(R.id.textView);
        btnG = findViewById(R.id.btnG);
        btnBP = findViewById(R.id.btnBP);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);


        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGCashLink();

            }
        });

        btnBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBPILink();


            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUpdatedLandingPage();
            }
        });
    }


    private void openGCashLink() {
        String gCashUrl = "https://www.gcash.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(gCashUrl));
        startActivity(intent);
    }

    private void openBPILink () {
        String bpiUrl = "https://online.bpi.com.ph/login";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(bpiUrl));
        startActivity(intent);

    }

    private void openUpdatedLandingPage () {
        Intent intent = new Intent(PaymentMethod.this, UpdatedLandingPage.class);
        startActivity(intent);
    }
}




