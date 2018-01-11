package com.example.shalini.msit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shalini on 22-07-2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;
    public ImageAdapter (Context c)
    {
        context=c;
    }
    public Integer pic[]={R.drawable.a,R.drawable.b,R.drawable.collegesite,R.drawable.moodle,R.drawable.connect,R.drawable.c,R.drawable.e,R.drawable.f,R.drawable.slideshow,R.drawable.image};
    public String values[]={"About College","Placements","College Website","Student Login","Connectivity","Courses/Seats","Acheivements","Hostel","Gallery","Developer's Desk"};

    @Override
    public int getCount() {
        return pic.length;
    }

    @Override
    public Object getItem(int position) {
        return pic[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      /*  ImageView imageView;
        if(convertView==null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(353,353));//designing of imageview 420,360
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setPadding(0,0 , 0, 0);



        }
        else
        {
            imageView=(ImageView) convertView;
        }
        //imageView.setImageResource(pic[position]);
        imageView.setAdjustViewBounds(true);
        imageView.setBackgroundResource(pic[position]);
        return imageView;
    */
        View grid;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null)
        {
            grid=new View(context);
            grid=inflater.inflate(R.layout.customlayout,null,true);


        }
        else
        {
            grid=(View)convertView;
        }
        TextView textview=(TextView)grid.findViewById(R.id.tv);
        ImageView imageview=(ImageView)grid.findViewById(R.id.iv);
        textview.setText(values[position]);
        imageview.setImageResource(pic[position]);
        return grid;
    }
}

