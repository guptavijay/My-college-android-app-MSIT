package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Eight extends AppCompatActivity {
TextView   t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eight);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t1.setText("There is ia separate hostel for boys and girls in college campus.\n"+
        "The intake of hostel is around 250 students.\n"+
                "Boys/Girls from outside delhi have more preference for Hostel in comaparison of Delhi students."
        );


    }
}
