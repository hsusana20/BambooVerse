package com.example.bambooverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BookSlot extends AppCompatActivity {

    Animation scaleUp, scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_slot);

        ImageButton back = findViewById(R.id.imageButton35);

        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);


        back.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    back.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    back.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(BookSlot.this, Book.class);
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
