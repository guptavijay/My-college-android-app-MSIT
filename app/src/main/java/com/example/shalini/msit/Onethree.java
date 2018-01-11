package com.example.shalini.msit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Onethree extends AppCompatActivity {
TextView t1;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onethree);
        t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Uri uri = Uri.parse("http://ieee.msit.in/"); // missing 'http://' will cause crashed
                Intent i61 = new Intent(Onethree.this,Onethreetwo.class);
                startActivity(i61);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Uri uri = Uri.parse(" http://prakriti.msit.in"); // missing 'http://' will cause crashed
                Intent i62 = new Intent(Onethree.this,Onethreeone.class);
                startActivity(i62);
            }
        });
    }
}
