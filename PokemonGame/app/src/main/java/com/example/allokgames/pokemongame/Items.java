package com.example.allokgames.pokemongame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Items extends AppCompatActivity {
    ListView listView;
    ArrayList<Item> items;
    ArrayAdapter menu;

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
        setContentView(R.layout.activity_items);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        listView=(ListView)findViewById(R.id.items);

        update();
    }

    void update(){
        items=Game.items;
        String[] strs=new String[items.size()];
        for (int i=0;i<items.size();i++)strs[i]=items.get(i).toString();
        menu=new MyArrayAdapter2(this, strs);
        listView.setAdapter((ListAdapter)menu);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if ((items.get(position) instanceof Stone)&&(Game.p!=null)) {
                    Game.stone = items.get(position).name;
                    Game.usestone();
                    Game.stone = null;
                    Game.items.remove(position);
                    update();
                }
            }
        });
    }
}
