package com.example.bambooverse;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Book extends AppCompatActivity {

    Animation scaleUp, scaleDown;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ImageView BambooUn = findViewById(R.id.BambooUnveiled);
        ImageView BambooTrai = findViewById(R.id.TrainingM);
        ImageView BBB = findViewById(R.id.BuildingBambooBridge);
        ImageView FBamboo = findViewById(R.id.FarmingBamboo);
        ImageView BambooAr = findViewById(R.id.BambooArc);
        ImageView BWB = findViewById(R.id.BuildingWithBamboo);

        TextView Back = findViewById(R.id.textView34);
        TextView NextPage = findViewById(R.id.textView35);

        scaleUp = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this, R.anim.scale_down);

        BambooUn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    BambooUn.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    BambooUn.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://designrr.page/?id=202210&token=2187254619&h=9990"));
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        BambooTrai.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    BambooTrai.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    BambooTrai.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://static1.squarespace.com/static/5e5cd082c50ea102c52e5bb0/t/5ed212b3939ba41cd13ccb38/1590825654277/bamboo_charcoal_training_manual.pdf"));
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        BBB.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    BBB.startAnimation(scaleUp);
                } else if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    BBB.startAnimation(scaleDown);
                }
                scaleDown.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://static1.squarespace.com/static/5e5cd082c50ea102c52e5bb0/t/5ed210f89654580ae7c98e75/1590825214752/bamboo_bridges_with_jorg_stamm.pdf"));
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
