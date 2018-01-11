package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Oneonethree extends AppCompatActivity {
ImageView i1;
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneonethree);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
        t3.setText("ENVA is the foundation day of Prakriti, MSIT. It is the birthday celebration of a well\u00ADknown society of the college.\n"+
        "Prakriti is the Eco and Humanitarian Society of MSIT that has been one of the most active and focused societies of MSIT since its inception on March 03, 2010.\n" +
                " All the prakritians vow to deliver their best in saving the environment from its further degradation. Their ulterior aim is to benefit the society and nature around us in any small way we can.\n" +
                "Ever since its bricks were laid, Prakriti has been striving hard to outdo itself with every passing year. \n" +
                "The progress that this small society has made in 6 years is commendable.\n");


    }
}
