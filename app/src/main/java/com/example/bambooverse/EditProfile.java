package com.example.bambooverse;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfile extends AppCompatActivity {

    Animation scaleUp, scaleDown;
    TextView EditProfile, textViewChangePass;

    EditText editTextUsername, editTextCN, editTextOldPass, editTextNewPass;

    Button button25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        EditProfile = findViewById(R.id.EditProfile);
        textViewChangePass = findViewById(R.id.textViewChangePass);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextCN = findViewById(R.id.editTextCN);
        editTextOldPass = findViewById(R.id.editTextOldPass);
        editTextNewPass = findViewById(R.id.editTextNewPass);
        button25 = findViewById(R.id.button25);
        ImageView back = findViewById(R.id.ImageViewBack);
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
                        Intent intent = new Intent(EditProfile.this, Dashboard.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                return true;
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String cellphoneNumber = editTextCN.getText().toString();
                String oldPassword = editTextOldPass.getText().toString();
                String newPassword = editTextNewPass.getText().toString();

                if (username.isEmpty() || cellphoneNumber.isEmpty() || oldPassword.isEmpty() || newPassword.isEmpty()) {
                    Toast.makeText(EditProfile.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(EditProfile.this, "Profile updated successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(EditProfile.this, Dashboard.class);
                startActivity(intent);

            }
        });
    }
}




