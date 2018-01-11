package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sixth extends AppCompatActivity {

TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
        t4=(TextView)findViewById(R.id.t44);
        t5=(TextView)findViewById(R.id.t55);
        t6=(TextView)findViewById(R.id.t66);
        t7=(TextView)findViewById(R.id.t77);
        t8=(TextView)findViewById(R.id.t88);
        t9=(TextView)findViewById(R.id.t99);
        t10=(TextView)findViewById(R.id.t100);
        t11=(TextView)findViewById(R.id.t101);
        t12=(TextView)findViewById(R.id.t102);
        t13=(TextView)findViewById(R.id.t103);
        t14=(TextView)findViewById(R.id.t104);
        t15=(TextView)findViewById(R.id.t105);
        t16=(TextView)findViewById(R.id.t106);
           t16.setText("There are teo shifts Morning(M) and Evening(E) in college.\n"+
           "85% of seats are reserved for Delhi region candidates,i.e. those who have passed the qualifying examination from any school/Institute located in Delhi.");




    }

}
