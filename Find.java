package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Find extends AppCompatActivity {

    EditText tlpemail;
    Button brktfind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        tlpemail = (EditText) findViewById(R.id.tlpemail);
        brktfind = (Button) findViewById(R.id.btnfind);

        brktfind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_password);
                String pass_input = tlpemail.getText().toString();
                Intent intent = new Intent(Find.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}