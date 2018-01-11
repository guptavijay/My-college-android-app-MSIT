package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Oneonetwo extends AppCompatActivity {
ImageView i1;
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneonetwo);
        i1 = (ImageView) findViewById(R.id.i11);
        t1 = (TextView) findViewById(R.id.t11);
        t2 = (TextView) findViewById(R.id.t22);
        t3 = (TextView) findViewById(R.id.t33);
        t3.setText("Avensis, Technical festival of 2017, is jointly organized by Maharaja Surajmal\n" +
                "Institute of Technology and Maharaja Surajmal Institute on 11th and 12th January 2017.\n" +
                "Sh. Kaptan Singh Ji, Vice-President, Surajmal Memorial Education Society has graced the inaugural ceremony on 11th January 2017. It witnessed a huge footfall of around 7000 students from various reputed colleges across the state from various departments and an unmatched zeal and enthusiasm is observed among the students.\n"+
                "The events under various categories like technical, robotics, literacy and quizzes and last but not the least fun & creativity, offered variety in term of contest, skill and presence of mind. Among all these categories, some very wonderful events\n" +
                "have been awarded with best event certificates namely, Foodgasm from fun and creativity, Online Coding from technical, Group Discussion from literacy & quizzes and Carnage from robotics.\n"+
                "Our esteemed Chief Guest Sh. S.P.Singhji, President, Surajmal Memorial Education Society has graced the valedictory function with his benign presence on 12th January 2017");




    }
}
