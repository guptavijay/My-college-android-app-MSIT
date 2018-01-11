package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Onethreetwo extends AppCompatActivity {
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onethreetwo);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t2.setText("IEEE is the world’s largest professional association dedicated to advancing technological innovation and excellence for the benefit of humanity. IEEE MSIT is a Student Branch of IEEE, USA established in the year 2009 to edify technical skills in a dexterous manner among the students of MSIT. The main objective laid down at the very beginning was to promote IEEE amongst the students. IEEE MSIT with its aim of “leading the wave of change” aspires to achieve excellence in all its endeavors.\n"+
        "IEEE MSIT has been significant in organizing workshops, short term project initiatives, scientific excursions, lecture Series and competitions since its beginning. IEEE MSIT has conducted many hands-on workshops on robotics and Arduino, web development, and Android amongst others. In this academic session, IEEE MSIT launched the Short Term Project Initiative where students from 1st and 2nd year worked with the 3rd and 4th year students in the field of machine learning, game development using Python, electronics, and robotics for 2 months to gain practical knowledge in their interest area.\n"+
        "In order to make the benefits of IEEE accessible to maximum student members, IEEE MSIT believes in the concept of Special Interest Groups (SIG’s). The 6 SIG’s that  are active this year aim at providing an avenue to people with similar interests, enabling them to come together, explore their fields of interest and learn together. The society regularly manages Special Interest Groups namely C/C++, Android App Development, Canvas (Designing), Embedded and Robotics, Full stack web development using Python, and Java to provide a practical edge to the students in an artful manner\n"+
        "IEEE MSIT Student Branch has bequeathed dedication, passion and ardor to its members and the society shall continue this legacy to serve students and hence the institution with utmost zeal and dedication. The vision of the student branch can be aptly defined by the words of Henry Ford\n" +
                "\n" +
                "\"Coming together is a beginning. Keeping together is progress. Working together is success.\"");
    }
}
