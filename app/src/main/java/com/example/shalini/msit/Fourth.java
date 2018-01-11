package com.example.shalini.msit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Fourth extends AppCompatActivity {
TextView t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        t1=(TextView)findViewById(R.id.t11);
        b1=(Button)findViewById(R.id.b11);

        t1.setText("There is an active placement department in the campus which is putting in all out efforts for organizing several placement activities throughout the academic year for MSIT. The department is headed by Prof. Ashok Oberoi, Director Placements, SMES.  The placement department has given wonderful opportunities to our students.\n"+
        "To give them a feel of industrial environment, students undergo industrial training as part of their curriculum. They also undertake minor industry related project in pre-final semester and a major project in the final semester. Special sessions to hone up technical skills & much needed communication skills are conducted on a regular basis."
        );
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.msit.in/media/2017/03/15/updated_pplacements_2016_sheet_xls_-_sheet1.pdf"); // missing 'http://' will cause crashed
                Intent i60 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(i60);
            }
        });



    }
}
