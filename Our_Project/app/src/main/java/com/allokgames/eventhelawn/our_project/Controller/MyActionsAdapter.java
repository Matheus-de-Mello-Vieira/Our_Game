package com.allokgames.eventhelawn.our_project.Controller;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 26.04.2017.
 */

public class MyActionsAdapter<T> extends ArrayAdapter<T> {
    private final Activity context;
    public MyActionsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<T> objects) {
        super(context, resource, objects);
        this.context= (Activity) context;
    }
    static class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }
/*
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
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
    }*/
}
