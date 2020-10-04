package com.example.simpleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username,nohp;
    Button next;
    EditText user,telpon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.nextbtn);
        user = findViewById(R.id.usertxt);
        telpon = findViewById(R.id.tlp);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateAll()==true)
                {
                    Intent intent = new Intent(MainActivity.this, TrolleyActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                }
            }
        });
    }

    public boolean validateAll()
    {
        if((validateName()==false)&&(validateNumber()==false))
        {
            Toast.makeText(MainActivity.this,"Nama dan nomor hp tidak valid",Toast.LENGTH_LONG).show();
            return false;
        }
        else if(validateName()==false)
        {
            Toast.makeText(MainActivity.this,"Nama tidak valid",Toast.LENGTH_LONG).show();
            return false;
        }
        else if(validateNumber()==false)
        {
            Toast.makeText(MainActivity.this,"Nomor hp tidak valid",Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public boolean validateName()
    {
        username = user.getText().toString();

        if(isEmpty(username)==true)
        {
            return false;
        }

        return true;
    }

    public boolean validateNumber()
    {
        nohp = telpon.getText().toString();

        if(isEmpty(nohp)==true)
        {
            return false;
        }

        return TextUtils.isDigitsOnly(nohp);
    }

    public boolean isEmpty(String x)
    {
        return TextUtils.isEmpty(x);
    }
}