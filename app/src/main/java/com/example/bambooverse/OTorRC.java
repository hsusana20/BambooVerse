package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OTorRC extends AppCompatActivity {
    TextView txtView;
    Button btnOneT, btnRec, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otor_rc);
        txtView = findViewById(R.id.txtView);

        btnOneT = findViewById(R.id.btnOneT);
        btnRec = findViewById(R.id.btnRec);
        button3 = findViewById(R.id.button3);

        btnOneT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOneTime();
            }
        });

        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecurring();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void openOneTime() {
        Intent intent = new Intent(this, OneTime.class);
        startActivity(intent);

    }

    public void openRecurring() {
        Intent intent = new Intent(this, Recurring.class);
        startActivity(intent);
    }
}