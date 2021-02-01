package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity{
    EditText email,sandi,konfirm;
    Button brktemail,buat,lupa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.email);
        sandi = (EditText)findViewById(R.id.sandi);
        konfirm = (EditText)findViewById(R.id.konfirm);
        brktemail = (Button)findViewById(R.id.btnemail);
        buat = (Button) findViewById(R.id.btakun);
        lupa = (Button) findViewById(R.id.lupa);

        brktemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                String email_input = email.getText().toString();
                Intent intent = new Intent(MainActivity.this, Password.class);
                startActivity(intent);
            }
        });
        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                String email_input = email.getText().toString();
                Intent intent = new Intent(MainActivity.this, Find.class);
                startActivity(intent);
            }
        });
        buat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                String email_input = email.getText().toString();
                Intent intent = new Intent(MainActivity.this, Buat.class);
                startActivity(intent);
            }
        });
    }
}