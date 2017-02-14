package com.example.allokgames.pokemongame;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Галимзянов Газинур on 18.04.2016.
 */
public class MyArrayAdapter2 extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] names;

    public MyArrayAdapter2(Activity context, String[] names) {
        super(context, R.layout.rowlayout, names);
        this.context = context;
        this.names = names;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        View rowView = convertView;
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.rowlayout2, null, true);
            holder = new ViewHolder();
            holder.textView = (TextView) rowView.findViewById(R.id.label1);
            holder.imageView = (ImageView) rowView.findViewById(R.id.icon2);
            rowView.setTag(holder);
        } else {
            holder = (ViewHolder) rowView.getTag();
        }

        holder.textView.setText(names[position]);
        String s = names[position];
        switch (s){
            case "Leaf stone":holder.imageView.setImageResource(R.drawable.leafstone);break;
            case "Thunder stone":holder.imageView.setImageResource(R.drawable.thunderstone);break;
            case "Fire stone":holder.imageView.setImageResource(R.drawable.firestone);break;
            case "Water stone":holder.imageView.setImageResource(R.drawable.waterstone);break;
        }

        return rowView;
    }
}