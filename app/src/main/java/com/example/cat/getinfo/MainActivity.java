package com.example.cat.getinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText EDemail,EDpassword,EDconfirm,EDmob;
    TextView TVcont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EDemail = (EditText)findViewById(R.id.email);
        EDpassword = (EditText)findViewById(R.id.pass);
        EDconfirm = (EditText)findViewById(R.id.again);
        EDmob = (EditText)findViewById(R.id.mob);

        TVcont = (TextView)findViewById(R.id.cont);

        TVcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getInfo();

            }
        });
        }

    private void getInfo() {
        if (EDemail.getText().toString().trim().length() == 0 ||
                EDpassword.getText().toString().trim().length() == 0 ||
                EDconfirm.getText().toString().trim().length() == 0||
                EDmob.getText().toString().trim().length() == 0) {
            Toast.makeText(this, "please full your info", Toast.LENGTH_SHORT).show();
            return;
        }
        String Semail = EDemail.getText().toString();
        String Spass = EDpassword.getText().toString();
        String Sconf = EDconfirm.getText().toString();
        String Smob = EDmob.getText().toString();

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        if (Spass.equals(Sconf)){
            intent.putExtra("email",Semail);
            intent.putExtra("password",Spass);
            intent.putExtra("confirm",Sconf);
            intent.putExtra("mobil",Smob);
            startActivity(intent);

            EDemail.setText("");
            EDpassword.setText("");
            EDconfirm.setText("");
            EDmob.setText("");

        }
        else {
            Toast.makeText(this, "Passwords Does not Match", Toast.LENGTH_SHORT).show();
        }









    }

}
