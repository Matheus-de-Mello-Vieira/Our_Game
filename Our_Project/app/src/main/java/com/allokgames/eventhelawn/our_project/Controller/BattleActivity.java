package com.allokgames.eventhelawn.our_project.Controller;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.allokgames.eventhelawn.our_project.R;
/**
 * Created by User on 20.04.2017.
 */
public class BattleActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battle);
        lv=(ListView)findViewById(R.id.list);
        mRecyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyAdapter();
        mRecyclerView.setAdapter(mAdapter);
    }
    public static void changeMenu(String menu){
                switch(menu){
                    case "Items":
                        break;
                    case "Spells":
                        break;
                    case "Stats":
                        break;
                }
    }
    public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

        Slider[] data=Slider.values();
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.slideritem,parent,false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
            holder.bind(data[position].name());
        }
        @Override
        public int getItemCount() {
            return data.length;
        }
    }
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView tv;
        String s;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv= (TextView) itemView.findViewById(R.id.slidertext);
        }

        public void bind(String val) {
            s=val;
            tv.setText(val);
        }
        public void chose(){
            tv.setBackgroundResource(R.drawable.slider);
        }

        @Override
        public void onClick(View v) {
            changeMenu(s);
            chose();
        }
    }
    enum Slider{
        Spells,Items,Stats
    }
}
