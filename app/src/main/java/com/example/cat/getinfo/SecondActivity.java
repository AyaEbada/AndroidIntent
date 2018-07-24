package com.example.cat.getinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvemail,tvpass,tvagain,tvmob;
    String email,pass,again,mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvemail=(TextView)findViewById(R.id.TVemail);
        tvpass=(TextView)findViewById(R.id.TVpass);
        tvagain=(TextView)findViewById(R.id.TVagain);
        tvmob=(TextView)findViewById(R.id.TVmob);

        Intent intent = getIntent();

        email = intent.getStringExtra("email");
        pass = intent.getStringExtra("password");
        again = intent.getStringExtra("confirm");
        mob = intent.getStringExtra("mobil");

        tvemail.setText(email);
        tvpass.setText(pass);
        tvagain.setText(again);
        tvmob.setText(mob);



    }
}
