package com.example.allokgames.pokemongame;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Галимзянов Газинур on 17.04.2016.
 */
public class MyArrayAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] names;

    public MyArrayAdapter(Activity context, String[] names) {
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
            rowView = inflater.inflate(R.layout.rowlayout, null, true);
            holder = new ViewHolder();
            holder.textView = (TextView) rowView.findViewById(R.id.label);
            holder.imageView = (ImageView) rowView.findViewById(R.id.icon1);
            rowView.setTag(holder);
        } else {
            holder = (ViewHolder) rowView.getTag();
        }

        holder.textView.setText(names[position]);
        String s = names[position];
        switch (s){
            case "pichu":holder.imageView.setImageResource(R.drawable.pichu);break;
            case "charmander":holder.imageView.setImageResource(R.drawable.charmander);break;
            case "weedle":holder.imageView.setImageResource(R.drawable.weedle);break;
            case "lotad":holder.imageView.setImageResource(R.drawable.lotad);break;
            case "shieldon":holder.imageView.setImageResource(R.drawable.shieldon);break;
        }

        return rowView;
    }
}