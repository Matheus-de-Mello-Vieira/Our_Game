package com.example.allokgames.pokemongame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Галимзянов Газинур on 16.04.2016.
 */
public class Stats extends AppCompatActivity {

    TextView name;
    TextView satiety;
    TextView firsty;
    TextView happiness;
    TextView hp;
    TextView lvl;
    TextView exp;
    TextView atk;
    TextView def;
    TextView type;
    TextView spd;
    TextView pok;
    Game g;

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        // super.onBackPressed()
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Game.p==null){
            startActivity(new Intent(getApplicationContext(),Main2Activity.class));
            finish();
        }
        setContentView(R.layout.activity_stats);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        name=(TextView)findViewById(R.id.name1);
        satiety=(TextView)findViewById(R.id.satiety1);
        firsty=(TextView)findViewById(R.id.firsty1);
        happiness=(TextView)findViewById(R.id.happiness1);
        hp=(TextView)findViewById(R.id.hp1);
        lvl=(TextView)findViewById(R.id.lvl1);
        exp=(TextView)findViewById(R.id.exp1);
        atk=(TextView)findViewById(R.id.atk1);
        def=(TextView)findViewById(R.id.def1);
        spd=(TextView)findViewById(R.id.spd1);
        pok=(TextView)findViewById(R.id.pok1);
        type=(TextView)findViewById(R.id.type1);
        g=new Game();
        name.setText("Name: "+g.p.name);
        lvl.setText("Lvl: "+g.p.lvl + "");
        exp.setText("Exp: "+g.p.exp + "/" + g.p.maxexp);
        firsty.setText("Thirsty: "+g.p.firsty + "/" + g.p.maxfirsty);
        satiety.setText("Satiety: "+g.p.satiety + "/" + g.p.maxsatiety);
        hp.setText("Hp: "+g.p.hp + "/" + g.p.maxhp);
        happiness.setText("Happiness: "+g.p.happiness + "");
        pok.setText("Pokemon: "+g.p.pok);
        atk.setText("Atk: "+g.p.atk);
        def.setText("Def: "+g.p.def);
        spd.setText("Spd: "+g.p.spd);
        type.setText("Tupe: "+g.p.type1);
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new updateUi());
            }
        },20,20);


    }
    class updateUi implements Runnable{

        @Override
        public void run() {

            exp.setText("Exp: "+g.p.exp + "/" + g.p.maxexp);
            firsty.setText("Thirsty: "+g.p.firsty + "/" + g.p.maxfirsty);
            satiety.setText("Satiety: "+g.p.satiety + "/" + g.p.maxsatiety);
            hp.setText("Hp: "+g.p.hp + "/" + g.p.maxhp);
            happiness.setText("Happiness: "+g.p.happiness + "");
            pok.setText("Pokemon: "+g.p.pok);
            atk.setText("Atk: "+g.p.atk);
            def.setText("Def: "+g.p.def);
            spd.setText("Spd: "+g.p.spd);
            type.setText("Tupe: "+g.p.type1);
        }
    }
}
