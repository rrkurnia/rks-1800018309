package com.example.rks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Buat extends AppCompatActivity {

    EditText email,dpn,blkng,nama,sandi,konfirm;
    Button brktbuat,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat);

        dpn = (EditText)findViewById(R.id.depan);
        blkng = (EditText)findViewById(R.id.belakang);
        nama = (EditText)findViewById(R.id.nampeng);
        email = (EditText)findViewById(R.id.email);
        login = (Button) findViewById(R.id.loginsaja);
        brktbuat = (Button) findViewById(R.id.btnbuat);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_buat);
                String email_input = email.getText().toString();
                Intent intent = new Intent(Buat.this, MainActivity.class);
                startActivity(intent);
            }
        });

        brktbuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_buat);
                String namadpn = dpn.getText().toString();
                String namablkng = blkng.getText().toString();
                String namap = nama.getText().toString();
                String snd = sandi.getText().toString();
                String knfrm = konfirm.getText().toString();
                Intent intent = new Intent(Buat.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}