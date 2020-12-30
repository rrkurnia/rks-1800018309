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
    EditText email, password,dpn,blkng,nama,sandi,konfirm,tlpemail;
    Button brktemail,brktpass,brktbuat,brktfind,buat,lupa,lp,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.password);
        setContentView(R.layout.buat);
        setContentView(R.layout.find);

        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.pass);
        dpn = (EditText)findViewById(R.id.depan);
        blkng = (EditText)findViewById(R.id.belakang);
        nama = (EditText)findViewById(R.id.nampeng);
        sandi = (EditText)findViewById(R.id.sandi);
        konfirm = (EditText)findViewById(R.id.konfirm);
        tlpemail = (EditText) findViewById(R.id.tlpemail);
        brktemail = (Button)findViewById(R.id.btnemail);
        buat = (Button) findViewById(R.id.btakun);
        lupa = (Button) findViewById(R.id.lupa);
        lp = (Button) findViewById(R.id.lp);
        login = (Button) findViewById(R.id.loginsaja);
        brktpass = (Button) findViewById(R.id.btnpass);
        brktbuat = (Button) findViewById(R.id.btnbuat);
        brktfind = (Button) findViewById(R.id.btnfind);

        brktemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
                String email_input = email.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, (R.layout.password));
                startActivity(Intent);
            }
        });
        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.);
                String email_input = email.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, (R.layout.find));
                startActivity(Intent);
            }
        });
        buat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.);
                String email_input = email.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, (R.layout.buat));
                startActivity(Intent);
            }
        });
        lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.);
                String email_input = email.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, (R.layout.find));
                startActivity(Intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.);
                String email_input = email.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, (R.layout.activity_main));
                startActivity(Intent);
            }
        });
        brktpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.password);
                String pass_input = password.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/"));
                startActivity(Intent);
            }
        });
        brktbuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.buat);
                String namadpn = dpn.getText().toString();
                String namablkng = blkng.getText().toString();
                String namap = nama.getText().toString();
                String snd = sandi.getText().toString();
                String knfrm = konfirm.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, (R.layout.activity_main));
                startActivity(Intent);
            }
        });
        brktfind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.password);
                String pass_input = tlpemail.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, (R.layout.activity_main))
            }
        });
    }
}