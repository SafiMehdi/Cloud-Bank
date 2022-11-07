package com.example.appbank;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] maintitle;
    private final String[] moneyText;
    private final String[] dateText;
    private final Integer[] imgid;

    public MyListAdapter(Activity context, String[] maintitle,String[] moneyText,String[] dateText, Integer[] imgid) {
        super(context, R.layout.activity_listcomp, maintitle);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.maintitle=maintitle;
        this.moneyText=moneyText;
        this.dateText=dateText;
        this.imgid=imgid;

    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_listcomp, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.title);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView money = (TextView) rowView.findViewById(R.id.moneyText);
        TextView date = (TextView) rowView.findViewById(R.id.dateText);

        titleText.setText(maintitle[position]);
        imageView.setImageResource(imgid[position]);
        money.setText(moneyText[position]);
        date.setText(dateText[position]);

        return rowView;

    };
}