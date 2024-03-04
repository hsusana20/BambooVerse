package com.example.bambooverse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class OneTime extends AppCompatActivity {
    TextView txtView, txtView3, txtView4, txtView5, txtView6, txtView7, txtView8, etNumber;
    Button btnPM, btnDN, button3;

    Animation scaleUp, scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_time);
        txtView = findViewById(R.id.txtView);
        txtView3 = findViewById(R.id.txtView3);
        txtView4 = findViewById(R.id.txtView4);
        txtView5 = findViewById(R.id.txtView5);
        txtView6 = findViewById(R.id.txtView6);
        txtView7 = findViewById(R.id.txtView7);
        txtView8 = findViewById(R.id.txtView8);
        etNumber = findViewById(R.id.etNumber);
        btnDN = findViewById(R.id.btnDN);
        button3 = findViewById(R.id.button3);

        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);

        btnDN.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    btnDN.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    btnDN.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(OneTime.this, PaymentMethod.class);
                        startActivity(intent);
                    }


                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    button3.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    button3.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(OneTime.this, UpdatedLandingPage.class);
                        startActivity(intent);
                    }


                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });
    }
}



