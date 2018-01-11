package com.example.shalini.msit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Third extends AppCompatActivity {
Button b1,b2,b3;
    ImageView i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third3);
        b1=(Button)findViewById(R.id.b11);
        b2=(Button)findViewById(R.id.b22);
        b3=(Button)findViewById(R.id.b33);
        i1=(ImageView)findViewById(R.id.iv11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9=new Intent(Third.this,Onefirst.class);
                startActivity(i9);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10=new Intent(Third.this,Onetwo.class);
                startActivity(i10);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11=new Intent(Third.this,Onethree.class);
                startActivity(i11);

            }
        });
    }
}
