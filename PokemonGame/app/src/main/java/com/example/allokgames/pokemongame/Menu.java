package com.example.allokgames.pokemongame;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Галимзянов Газинур on 16.04.2016.
 */
public class Menu extends AppCompatActivity {
    ListView list;
    Adapter menu;
    String itemclicked;
    String[] myArrList;
    Game g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        list=(ListView)findViewById(R.id.lv2);
        myArrList= new String[]{"Start game", "Stats", "Inventory", "Shop"};
        menu=new ArrayAdapter(this,R.layout.menu_item,R.id.t1,myArrList);
        list.setAdapter((ListAdapter) menu);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 1:
                        if (Game.p != null) {

                            Intent intent1 = new Intent(getApplicationContext(), Stats.class);
                            startActivity(intent1);
                        }
                        else {

                            Intent intent1 = new Intent(getApplicationContext(), Main2Activity.class);
                            startActivity(intent1);
                        }
                        finish();
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), Items.class);
                        startActivity(intent2);
                        finish();
                        break;
                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), Buy.class);
                        startActivity(intent3);
                        finish();
                        break;
                }
            }
        });
}
    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        // super.onBackPressed();
        openQuitDialog();
    }

    private void openQuitDialog() {
        AlertDialog.Builder quitDialog = new AlertDialog.Builder(
                Menu.this);
        quitDialog.setTitle("Выход: Вы уверены?");

        quitDialog.setPositiveButton("Таки да!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
                finish();
            }
        });

        quitDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub
            }
        });

        quitDialog.show();
    }}
