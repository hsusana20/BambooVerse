package com.example.bambooverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class WebsiteSlot extends AppCompatActivity {

    Animation scaleUp, scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website_slot);

        ImageButton backLeft = findViewById(R.id.imageButton32);


        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);


        backLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    backLeft.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    backLeft.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(WebsiteSlot.this, Website.class);
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
