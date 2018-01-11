package com.example.shalini.msit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Onefirst extends AppCompatActivity {
ImageView i1;
    TextView t1;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onefirst);
        i1=(ImageView)findViewById(R.id.i11);
        t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.but1);
        b2=(Button)findViewById(R.id.but2);
        b3=(Button)findViewById(R.id.but3);
        b4=(Button)findViewById(R.id.but4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12=new Intent(Onefirst.this,Oneone.class);
                startActivity(i12);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i13=new Intent(Onefirst.this,Oneonetwo.class);
                startActivity(i13);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i14=new Intent(Onefirst.this,Oneonethree.class);
                startActivity(i14);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i15=new Intent(Onefirst.this,Oneonefour.class);
                startActivity(i15);
            }
        });

    }
}
