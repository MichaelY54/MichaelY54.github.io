package com.example.simpleapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TrolleyActivity extends AppCompatActivity {
    TextView welcome,qty,qty1,qty2,qty3,qty4,qty5,totalbuy;
    ImageView minus,minus1,minus2,minus3,minus4,minus5,plus,plus1,plus2,plus3,plus4,plus5,logo;
    String username;
    Integer total=0,buy=0,buy1=0,buy2=0,buy3=0,buy4=0,buy5=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trolley);

        welcome = findViewById(R.id.welcomemsg);
        minus = findViewById(R.id.minus);
        minus1 = findViewById(R.id.minus1);
        minus2 = findViewById(R.id.minus2);
        minus3 = findViewById(R.id.minus3);
        minus4 = findViewById(R.id.minus4);
        minus5 = findViewById(R.id.minus5);
        plus = findViewById(R.id.plus);
        plus1 = findViewById(R.id.plus1);
        plus2 = findViewById(R.id.plus2);
        plus3 = findViewById(R.id.plus3);
        plus4 = findViewById(R.id.plus4);
        plus5 = findViewById(R.id.plus5);
        qty = findViewById(R.id.qty);
        qty1 = findViewById(R.id.qty1);
        qty2 = findViewById(R.id.qty2);
        qty3 = findViewById(R.id.qty3);
        qty4 = findViewById(R.id.qty4);
        qty5 = findViewById(R.id.qty5);
        logo = findViewById(R.id.checkout);
        totalbuy = findViewById(R.id.totalbuy);

        username = getIntent().getExtras().getString("username");
        welcome.setText("Selamat datang "+username);

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buy>0)
                {
                    buy-=1;
                    total-=11000;
                }
                qty.setText(buy.toString());
                totalbuy.setText(total.toString());
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy+=1;
                total+=11000;
                qty.setText(buy.toString());
                totalbuy.setText(total.toString());
            }
        });

        minus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buy1>0)
                {
                    buy1-=1;
                    total-=10500;
                }
                qty1.setText(buy1.toString());
                totalbuy.setText(total.toString());
            }
        });

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy1+=1;
                total+=10500;
                qty1.setText(buy1.toString());
                totalbuy.setText(total.toString());
            }
        });

        minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buy2>0)
                {
                    buy2-=1;
                    total-=950;
                }
                qty2.setText(buy2.toString());
                totalbuy.setText(total.toString());
            }
        });

        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy2+=1;
                total+=950;
                qty2.setText(buy2.toString());
                totalbuy.setText(total.toString());
            }
        });

        minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buy3>0)
                {
                    buy3-=1;
                    total-=12500;
                }
                qty3.setText(buy3.toString());
                totalbuy.setText(total.toString());
            }
        });

        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy3+=1;
                total+=12500;
                qty3.setText(buy3.toString());
                totalbuy.setText(total.toString());
            }
        });

        minus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buy4>0)
                {
                    buy4-=1;
                    total-=2000;
                }
                qty4.setText(buy4.toString());
                totalbuy.setText(total.toString());
            }
        });

        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy4+=1;
                total+=2000;
                qty4.setText(buy4.toString());
                totalbuy.setText(total.toString());
            }
        });

        minus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(buy5>0)
                {
                    buy5-=1;
                    total-=13000;
                }
                qty5.setText(buy5.toString());
                totalbuy.setText(total.toString());
            }
        });

        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buy5+=1;
                total+=13000;
                qty5.setText(buy5.toString());
                totalbuy.setText(total.toString());
            }
        });

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(TrolleyActivity.this,"Transaksi sebesar Rp "+total+" telah diproses, terima kasih",Toast.LENGTH_LONG).show();
                total=0;
                totalbuy.setText(total.toString());
                buy=0;
                qty.setText(buy.toString());
                buy1=0;
                qty1.setText(buy1.toString());
                buy2=0;
                qty2.setText(buy2.toString());
                buy3=0;
                qty3.setText(buy.toString());
                buy4=0;
                qty4.setText(buy.toString());
                buy5=0;
                qty5.setText(buy.toString());
            }
        });
    }
}