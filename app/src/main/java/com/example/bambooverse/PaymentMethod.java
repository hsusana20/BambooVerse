package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentMethod extends AppCompatActivity {
    TextView textView;
    Button btnG, btnBP,  button3;
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



        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGCashApp();

            }
        });

        btnBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBPIApp();


            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }

    private void openGCashApp() {
        openApp("com.globe.gcash.android");
    }

    private void openBPIApp() {
        openApp("com.bpi.mobile.banking");
    }

    private void openApp(String packageName) {
        try {
            Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
            if (intent != null) {
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            } else {
                Toast.makeText(this, "App not installed", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Error opening app", Toast.LENGTH_SHORT).show();
        }
    }
}