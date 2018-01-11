package com.example.shalini.msit;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.provider.Settings;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

import static com.example.shalini.msit.R.menu.mymenu;

public class Second extends AppCompatActivity {//textstyle bold
    GridView gd;
    AlertDialog.Builder ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        gd = (GridView) findViewById(R.id.gv11);
        final ImageAdapter img = new ImageAdapter(this);//array list m bitmap type ki class for image storage
        gd.setAdapter(img);
        gd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {

                    Intent i1 = new Intent(Second.this, Third.class);
                    startActivity(i1);
                } else if (position == 1) {
                    Intent i2 = new Intent(Second.this, Fourth.class);
                    startActivity(i2);
                } else if (position == 2) {
                    /*Intent i3 = new Intent(Second.this, Eleven.class);
                    startActivity(i3);*/
                    Uri uri = Uri.parse("http://www.msit.in/"); // missing 'http://' will cause crashed
                    Intent i3 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i3);
                } else if (position == 3) {
                   /* Intent i4 = new Intent(Second.this, Twelve.class);
                    startActivity(i4);*/
                    Uri uri = Uri.parse("http://moodle.msit.in/"); // missing 'http://' will cause crashed
                    Intent i4 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i4);
                } else if (position == 4) {
                    Intent i5 = new Intent(Second.this, Fifth.class);
                    startActivity(i5);
                }else if (position == 5) {
                    Intent i6 = new Intent(Second.this, Sixth.class);
                    startActivity(i6);

                } else if (position == 6) {

                    //startActivity(i7);
                    Uri uri = Uri.parse("http://www.msit.in/achievements"); // missing 'http://' will cause crashed
                    Intent i7 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(i7);
                }  else if (position == 7) {
                    Intent i8 = new Intent(Second.this, Eight.class);
                    startActivity(i8);
                }
                else if(position==8)
                {   Intent i16=new Intent(Second.this,Ninth.class);
                    startActivity(i16);

                }
                else {
                    Intent i17 = new Intent(Second.this, Tenth.class);
                    startActivity(i17);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(mymenu, menu);


        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item1) {
          /*  Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("text/plain");
            String shareBody = "Here is the share  content body";
           // sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject Here");
            sharingIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
            startActivity(sharingIntent);
            //startActivity(Intent.createChooser(sharingIntent, "Share via"));
*/
       /* else if(id==R.id.item2)
        {
            Toast.makeText(this,"item2,",Toast.LENGTH_LONG).show();
        }
        else
        {
            Intent i=new Intent(Settings.ACTION_SETTINGS);
            startActivityForResult(i,0);
        }*/
            ApplicationInfo Msit=getApplicationContext().getApplicationInfo();
            String filePath=Msit.sourceDir;
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("*/*");
            intent.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(new File(filePath)));
            startActivity(Intent.createChooser(intent,"share app via"));

        }
        /*
        else if(id == R.id.item2)
        {   /*final View addView=getLayoutInflater().inflate(R.menu.mymenu,null);


            ab=new AlertDialog.Builder(Second.this);

            ab.setTitle("Feedback");  //these all are predefined functions of alertdialog class
            ab.setIcon(R.mipmap.minion);
            ab.setMessage("Do you like this app?");
            ab.setCancelable(false);
            ab.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Second.this,"THANK YOU",Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                }
            });
            ab.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(Second.this,"GET LOST",Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                }
            });
            final Dialog d=new Dialog(Second.this);
            d.setContentView(R.layout.custom);
            //d.setTitle("Rate this app");
            RatingBar rt=(RatingBar) d.findViewById(R.id.rb11);
            Button b22= (Button) d.findViewById(R.id.b111);
            TextView t1=(TextView)findViewById(R.id.t111);
        }*/
            return super.onOptionsItemSelected(item);




    }
}