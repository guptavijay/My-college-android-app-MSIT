package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class Ninth extends AppCompatActivity {
    TextView t1;
   ImageView i1,i2,i3,i4,i5,i6,i7,i8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);
        t1 = (TextView) findViewById(R.id.t11);
        i1=(ImageView)findViewById(R.id.iv11);
        i2=(ImageView)findViewById(R.id.iv22);
        i3=(ImageView)findViewById(R.id.iv33);
        i4=(ImageView)findViewById(R.id.iv44);
        i5=(ImageView)findViewById(R.id.iv55);
        i6=(ImageView)findViewById(R.id.iv66);
        i7=(ImageView)findViewById(R.id.iv77);
        i8=(ImageView)findViewById(R.id.iv88);
    }
}