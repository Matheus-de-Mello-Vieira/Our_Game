package com.example.allokgames.pokemongame;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    TextView name;
    TextView satiety;
    TextView firsty;
    TextView happiness;
    TextView hp;
    TextView lvl;
    TextView exp;
    Button train;
    Button feed;
    Button drink;
    Button heal;
    Button walk;
    Button buy;
    Button play;
    Button stash;
    Button stats;
    SharedPreferences mSettings;
    Game g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        train =(Button)findViewById(R.id.train);
        feed =(Button)findViewById(R.id.feed);
        drink =(Button)findViewById(R.id.drink);
        heal =(Button)findViewById(R.id.heal);
        walk =(Button)findViewById(R.id.walk);
        buy =(Button)findViewById(R.id.buy);
        play =(Button)findViewById(R.id.play);
        stash =(Button)findViewById(R.id.stash);
        stats =(Button)findViewById(R.id.stats);
        name=(TextView)findViewById(R.id.name);
        satiety=(TextView)findViewById(R.id.satiety);
        firsty=(TextView)findViewById(R.id.firsty);
        happiness=(TextView)findViewById(R.id.happiness);
        Button menu=(Button)findViewById(R.id.menu1);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Menu.class);
                startActivity(intent);
            }
        });
        hp=(TextView)findViewById(R.id.hp);
        lvl=(TextView)findViewById(R.id.lvl);
        exp=(TextView)findViewById(R.id.exp);
        if(Game.p==null){Pokemon p = new Charmander();
            g = new Game(p);}
        else {g=new Game();}
        name.setText(g.p.name);
        lvl.setText(g.p.lvl + "");
        exp.setText(g.p.exp + "/" + g.p.maxexp);
        firsty.setText(g.p.firsty + "/" + g.p.maxfirsty);
        satiety.setText(g.p.satiety + "/" + g.p.maxsatiety);
        hp.setText(g.p.hp + "/" + g.p.maxhp);
        happiness.setText(g.p.happiness + "");
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.eat();
                name.setText(g.p.name);
                lvl.setText(g.p.lvl + "");
                exp.setText(g.p.exp + "/" + g.p.maxexp);
                firsty.setText(g.p.firsty + "/" + g.p.maxfirsty);
                satiety.setText(g.p.satiety + "/" + g.p.maxsatiety);
                hp.setText(g.p.hp + "/" + g.p.maxhp);
                happiness.setText(g.p.happiness + "");
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.play();
                name.setText(g.p.name);
                lvl.setText(g.p.lvl + "");
                exp.setText(g.p.exp + "/" + g.p.maxexp);
                firsty.setText(g.p.firsty + "/" + g.p.maxfirsty);
                satiety.setText(g.p.satiety + "/" + g.p.maxsatiety);
                hp.setText(g.p.hp + "/" + g.p.maxhp);
                happiness.setText(g.p.happiness + "");
            }
        });
        walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.walk();
                name.setText(g.p.name);
                lvl.setText(g.p.lvl + "");
                exp.setText(g.p.exp + "/" + g.p.maxexp);
                firsty.setText(g.p.firsty + "/" + g.p.maxfirsty);
                satiety.setText(g.p.satiety + "/" + g.p.maxsatiety);
                hp.setText(g.p.hp + "/" + g.p.maxhp);
                happiness.setText(g.p.happiness + "");
            }
        });
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.drink();
                name.setText(g.p.name);
                lvl.setText(g.p.lvl + "");
                exp.setText(g.p.exp + "/" + g.p.maxexp);
                firsty.setText(g.p.firsty + "/" + g.p.maxfirsty);
                satiety.setText(g.p.satiety + "/" + g.p.maxsatiety);
                hp.setText(g.p.hp + "/" + g.p.maxhp);
                happiness.setText(g.p.happiness + "");
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.train();
                g.evolve();
                lvl.setText(g.p.lvl + "");
                exp.setText(g.p.exp + "/" + g.p.maxexp);
                name.setText(g.p.name);
                firsty.setText(g.p.firsty + "/" + g.p.maxfirsty);
                satiety.setText(g.p.satiety + "/" + g.p.maxsatiety);
                hp.setText(g.p.hp + "/" + g.p.maxhp);
                happiness.setText(g.p.happiness + "");
            }
        });
        heal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.hp = g.p.maxhp;
                lvl.setText(g.p.lvl + "");
                exp.setText(g.p.exp + "/" + g.p.maxexp);
                name.setText(g.p.name);
                firsty.setText(g.p.firsty + "/" + g.p.maxfirsty);
                satiety.setText(g.p.satiety + "/" + g.p.maxsatiety);
                hp.setText(g.p.hp + "/" + g.p.maxhp);
                happiness.setText(g.p.happiness + "");
            }
        });
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Buy.class);
                startActivity(intent);
            }
        });
        stash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Items.class);
                startActivity(intent);
            }
        });
        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),Stats.class);
                startActivity(intent);
            }
        });
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new updateUi());
            }

        }, 20, 20);
        Timer t1=new Timer();
        t1.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new toasts());
            }
        },1,1);
    }


    class toasts implements Runnable{
        @Override
        public void run() {
            if ((g.p.satiety <= 50) || (g.p.firsty <= 50)){
            Toast toast=Toast.makeText(getApplicationContext(),
                    "Покемон требует внимания!", Toast.LENGTH_LONG);
            toast.show();}
            if ((g.p.satiety<=0)||(g.p.firsty<=0)){
                Game.p=null;
                Toast toast=Toast.makeText(getApplicationContext(),
                        "Покемон слился в унитаз!", Toast.LENGTH_LONG);
                toast.show();
                Intent intent=new Intent(getApplicationContext(),Menu.class);
                startActivity(intent);
            }
        }
    }
    class updateUi implements Runnable{

        @Override
        public void run() {
            name.setText(Game.p.name);
            firsty.setText(Game.p.firsty + "/" + Game.p.maxfirsty);
            satiety.setText(Game.p.satiety + "/" + Game.p.maxsatiety);
            hp.setText(Game.p.hp + "/" + Game.p.maxhp);
            happiness.setText(Game.p.happiness + "");
        }
    }
}
