package com.example.shalini.msit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.shalini.msit.R.drawable.d;
import static com.example.shalini.msit.R.drawable.developerdesk;

public class Tenth extends AppCompatActivity {
ImageView i1;
    TextView t1,t2,t3,t4,t5,t6;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);
        i1=(ImageView)findViewById(R.id.iv11);
        t1=(TextView)findViewById(R.id.t11);
        t2=(TextView)findViewById(R.id.t22);
        t3=(TextView)findViewById(R.id.t33);
        t4=(TextView)findViewById(R.id.t44);
        t5=(TextView)findViewById(R.id.t55);
         b2=(Button)findViewById(R.id.b22);
        b1=(Button)findViewById(R.id.b11);
        t6=(TextView)findViewById(R.id.t66);
        t1.setText("Hey, this is Vijay Kumar Gupta persuing B.Tech(3rd year IT,morning shift) from MSIT.\n"+
        "This is a basic and my first application that I had build in a short span of time.It contains various details of our college.\n"+
        "Hope you guys liked it.\n");
        t2.setText("For any Details/Queries feel free to ask.");
         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Uri uri = Uri.parse("https://www.facebook.com/profile.php?id=100001615556957"); // missing 'http://' will cause crashed
                 Intent i30 = new Intent(Intent.ACTION_VIEW, uri);
                 startActivity(i30);
             }
         });
b2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        Uri uri = Uri.parse("https://www.instagram.com/vijaygupta_07/"); // missing 'http://' will cause crashed
        Intent i40 = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i40);




    }
});
    }
}
