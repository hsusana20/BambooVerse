package com.example.bambooverse;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EditProfile extends AppCompatActivity {

    TextView EditImage, textViewChangePass;

    EditText editTextUsername, editTextCN, editTextOldPass, editTextNewPass;

    Button button25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        EditImage = findViewById(R.id.EditImage);
        textViewChangePass = findViewById(R.id.textViewChangePass);
        editTextUsername = findViewById(R.id.editTextUsername);
        editTextCN = findViewById(R.id.editTextCN);
        editTextOldPass = findViewById(R.id.editTextOldPass);
        editTextNewPass = findViewById(R.id.editTextNewPass);
        button25 = findViewById(R.id.button25);



}
