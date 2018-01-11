package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Onethreeone extends AppCompatActivity {
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onethreeone);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t2.setText("Prakriti, the eco club of MSIT, was founded on 3rd March ,2010, in the wake of need for a college society that aims at promoting and increasing environmental consciousness, awareness and responsibility amongst the college youth and the populace.\n"+
        "As a non profitable society, Prakriti is committed to the belief that solutions are more effective and enduring when they involve mass local participation in planning and implementing projects.\n" +
                "\n" +
                "Prakriti also exists to support and strengthen NGOs (such as Goonj) and rural or urban communities (like Lions’ Club) that work towards betterment of the society.\n"+
        "An important part of our growth and motivation as people , lies in contributing to the greater good; being part of something greater than ourselves. So, take the privilege and join hands with us in an attempt to transform our society’s present ecological scenario.\n"+
        "Teacher-in-Charge: Mr. Dinesh Sheoran (Assistant Professor, ECE 1st shift)");
    }
}
