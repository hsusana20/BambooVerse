package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PaymentMethod extends AppCompatActivity {
    TextView textView;
    Button btnE, btnCd, btnP, btnO, btnChoose, button3;
    String selectedPaymentMethod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method);
        textView = findViewById(R.id.textView);
        btnE = findViewById(R.id.btnE);
        btnCd = findViewById(R.id.btnCd);
        btnP = findViewById(R.id.btnP);
        btnO = findViewById(R.id.btnO);
        btnChoose = findViewById(R.id.btnChoose);
        button3 = findViewById(R.id.button3);



        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedPaymentMethod = "E-WALLET";
                btnChoose.setText(" " + selectedPaymentMethod);
            }
        });

        btnCd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedPaymentMethod = "CREDIT/DEBIT CARD";
                btnChoose.setText(" " + selectedPaymentMethod);

            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedPaymentMethod = "PAY VIA BANK TRANSFER";
                btnChoose.setText(" " + selectedPaymentMethod);

            }
        });

        btnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedPaymentMethod = "Over the counter";
                btnChoose.setText(" " + selectedPaymentMethod);

            }
        });

        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedPaymentMethod != null) {
                    Toast.makeText(PaymentMethod.this, "Your choice is successful. Chosen payment method: " + selectedPaymentMethod, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PaymentMethod.this, "Please choose a payment method", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }
}