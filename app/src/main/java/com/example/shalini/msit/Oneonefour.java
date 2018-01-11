package com.example.shalini.msit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Oneonefour extends AppCompatActivity {
ImageView i1;
    TextView t1,t2,t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneonefour);
        i1=(ImageView)findViewById(R.id.i11);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);

        t3.setText("Maharaja Surajmal institute continues to follow its tradition of developing the holistic personality of our students.\n" +
                " At MSI we not only concentrate on academic excellence but believe in all round development\n " +
        "For this we organize number of co-curricular activities throughout the year and sports are an integral part of MSI culture.\n" +
                " Every year we organize various intra-mural competitions of cricket, volleyball, football badminton, table tennis, chess, carom etc. for boys and girls. We also organize two days Annual Sport Day every year, for 2016-17 session the sports day was organized on 9th and 10th Jan. 2017 at college ground.\n" +
                "Various events were organized on these two days, starting with march past by the students of various departments, torch lighting by chief guest, oath taking ceremony etc. during these two students participate in huge numbers and show there true sportsmanship and their interest towards sports.\n" +
        "The annual sports meet 2k16-17 was great success and clearly shows the interest of MSI and MSIT students towards sports.");



    }
}
