package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Password extends AppCompatActivity {

    EditText email, password;
    Button brktpass,lp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.pass);
        lp = (Button) findViewById(R.id.lp);
        brktpass = (Button) findViewById(R.id.btnpass);

        lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_password);
                Intent intent = new Intent(Password.this, Find.class);
                startActivity(intent);
            }
        });
        brktpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_password);
                String pass_input = password.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/"));
                startActivity(intent);
            }
        });
    }
}