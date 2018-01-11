package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Onetwo extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6,t7,t8;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onetwo);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
        t4=(TextView)findViewById(R.id.t44);
        t5=(TextView)findViewById(R.id.t55);
        t6=(TextView)findViewById(R.id.t66);
        t7=(TextView)findViewById(R.id.t77);
        t8=(TextView)findViewById(R.id.t88);
        i1=(ImageView)findViewById(R.id.i11);
        t4.setText("Maharaja Surajmal Institute of Technology is located at C-4, Janakpuri in New Delhi, India. It comes after tier-III engineering colleges in India. It has a campus spread over 8 acres (3.2 ha) of land\n"+
        "It is the engineering branch of the Maharaja Surajmal Institute.It is recently accredited by NBA . The college is affiliated with Guru Gobind Singh Indraprastha University\n"+
        "Maharaja Surajmal Institute is a self-financing Institute. The Institute is situated at the heart of Janakpuri and is spread over 8 acres (3.2 ha) of land. The governing body of the institutes (MSI, MSIP and MSIT) is Surajmal Memorial Educational Society (SMES).\n"+
        " Institute was earlier operating from four storey building of 6279 sq.m of built up area. Recently it has been shifted to a more spacious seven storeyed building with built up area of 9660 sq.m\n"+
        "The institute has over a short span of time acquired and developed impressive infrastructure, expertise and resources for imparting high quality engineering education.\n"+
        " It has developed into one of the best engineering colleges in delhi, with higher standards of quality education.\n");
    }
}
