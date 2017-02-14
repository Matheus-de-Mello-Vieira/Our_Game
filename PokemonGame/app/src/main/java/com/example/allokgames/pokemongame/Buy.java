package com.example.allokgames.pokemongame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Buy extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        // super.onBackPressed()
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        final Game g = new Game();
        Stone stone;
        if (Stone.stones.size()==0){
            stone=new Stone("Thunder stone",1000);
            stone=new Stone("Fire stone",1000);
            stone=new Stone("Water stone",1000);
            stone=new Stone("Leaf stone",1000);
        }
        ListView lv=(ListView)findViewById(R.id.lv);
        final ArrayList<String> stones=new ArrayList<>();
        for(Stone stone1:Stone.stones){
            stones.add(stone1.name);
        }
        String[]strs=new String[stones.size()];
        strs=stones.toArray(strs);
        lv.setAdapter(new MyArrayAdapter2(this, strs));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = stones.get(position);
                g.buystone(s);
            }
        });

    }
}
