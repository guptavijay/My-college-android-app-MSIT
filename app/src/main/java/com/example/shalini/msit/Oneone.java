package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class Oneone extends AppCompatActivity {
TextView t1,t2,t3;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneone);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
        i1=(ImageView)findViewById(R.id.i11);
        t3.setText("Maharaja Surajmal Group of Institutions organized its Annual Cultural Fest\n" +
                "“GENEIS 2017” on 13th to 14th January 2k17.\n"+
                "This Annual extravaganza is a platform for students to showcase their co-curricular skills along with celebration of other related activities. \n" +
                "It consisted of 16 events in total spread over 2 days.\n"+
                " A wide spectrum of events related to Dramatics, Music, Dance & Literary were part of the show. Mr. & Ms.GENESIS2k17’ attracted a lot of enthusiasm from the students.\n"+
                "A large number of participation was seen in all the events.\n"+
                "Sh S.P.Singh, Hon’ble Chairman of SMES was the Chief Guest of Prize Distribution ceremony which was conducted on 14th  January, 2017.\n"+

                "The event was successful and received appreciation all around the" );


    }
}
