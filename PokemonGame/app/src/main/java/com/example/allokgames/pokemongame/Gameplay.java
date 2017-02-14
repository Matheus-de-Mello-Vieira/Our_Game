package com.example.allokgames.pokemongame;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Gameplay extends AppCompatActivity {
    ImageView view;
    Button drink;
    Button feed;
    Button play;
    Button walk;
    Button heal;
    Button train;
    TextView satiety;
    TextView firsty;
    TextView happiness;
    TextView hp;
    TextView lvl;
    TextView exp;
    Game g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        view = (ImageView) findViewById(R.id.pokemon);
        satiety = (TextView) findViewById(R.id.satiety3);
        firsty = (TextView) findViewById(R.id.firsty3);
        happiness = (TextView) findViewById(R.id.happiness3);
        hp = (TextView) findViewById(R.id.hp3);
        lvl = (TextView) findViewById(R.id.lvl3);
        exp = (TextView) findViewById(R.id.exp3);
        drink = (Button) findViewById(R.id.drink1);
        feed = (Button) findViewById(R.id.feed1);
        play = (Button) findViewById(R.id.play1);
        walk = (Button) findViewById(R.id.walk1);
        heal = (Button) findViewById(R.id.heal1);
        train = (Button) findViewById(R.id.train1);
        if (Game.p == null) {
            Pokemon p = new Charmander();
            g = new Game(p);
        } else {
            g = new Game();
        }
        //startService(new Intent(this,Upload.class));
        lvl.setText("Lvl: " + g.p.lvl + " ");
        exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
        firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
        satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
        hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
        happiness.setText("Happy: " + g.p.happiness + " ");
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.eat();
                lvl.setText("Lvl: " + g.p.lvl + " ");
                exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
                firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
                satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
                hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
                happiness.setText("Happy: " + g.p.happiness + " ");
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.play();
                lvl.setText("Lvl: " + g.p.lvl + " ");
                exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
                firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
                satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
                hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
                happiness.setText("Happy: " + g.p.happiness + " ");
            }
        });
        walk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.walk();
                lvl.setText("Lvl: " + g.p.lvl + " ");
                exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
                firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
                satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
                hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
                happiness.setText("Happy: " + g.p.happiness + " ");
            }
        });
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.drink();
                lvl.setText("Lvl: " + g.p.lvl + " ");
                exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
                firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
                satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
                hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
                happiness.setText("Happy: " + g.p.happiness + " ");
            }
        });
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.train();
                g.evolve();
                lvl.setText("Lvl: " + g.p.lvl + " ");
                exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
                firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
                satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
                hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
                happiness.setText("Happy: " + g.p.happiness + " ");
            }
        });
        heal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.p.hp = g.p.maxhp;
                lvl.setText("Lvl: " + g.p.lvl + " ");
                exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
                firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
                satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
                hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
                happiness.setText("Happy: " + g.p.happiness + " ");
            }
        });
        Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {if (g.p!=null){
                g.p.satiety = (short) (g.p.satiety - 2);
                g.p.firsty = (short) (g.p.firsty - 2);
                if ((g.p.satiety <= 50) || (g.p.firsty <= 50)) {
                    g.p.happiness -= 2;
                    g.p.hp -= 2;
                }}
            }
        }, 10000, 10000);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new toasts());
                runOnUiThread(new updateUi());
            }

        }, 20, 20);
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }
    class toasts implements Runnable {
        @Override
        public void run() {if (g.p!=null){
            if ((g.p.satiety <= 50) || (g.p.firsty <= 50)) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Покемон требует внимания!", Toast.LENGTH_SHORT);
                toast.show();
            }
            if ((g.p.satiety <= 0) || (g.p.firsty <= 0)||(g.p.hp<=0)) {
                Gameover();
            }}
        }
    }
public void Gameover(){
    startActivity(new Intent(getApplicationContext(), GAME_OVER.class));
    finish();
}
    class updateUi implements Runnable {

        @Override
        public void run() {if (g.p!=null){
            switch (g.p.pok) {
                case "pichu": {
                    view.setImageResource(R.drawable.pichu);
                    break;
                }
                case "charmander": {
                    view.setImageResource(R.drawable.charmander);
                    break;
                }
                case "weedle": {
                    view.setImageResource(R.drawable.weedle);
                    break;
                }
                case "lotad": {
                    view.setImageResource(R.drawable.lotad);
                    break;
                }
                case "shieldon": {
                    view.setImageResource(R.drawable.shieldon);
                    break;
                }
                case "pikachu": {
                    view.setImageResource(R.drawable.pikachu);
                    break;
                }
                case "raichu": {
                    view.setImageResource(R.drawable.raichu);
                    break;
                }
                case "kakuna": {
                    view.setImageResource(R.drawable.kakuna);
                    break;
                }
                case "beedrill": {
                    view.setImageResource(R.drawable.beedrill);
                    break;
                }
                case "charmeleon": {
                    view.setImageResource(R.drawable.charmeleon);
                    break;
                }
                case "charizard": {
                    view.setImageResource(R.drawable.charizard);
                    break;
                }
                case "lombre": {
                    view.setImageResource(R.drawable.lombre);
                    break;
                }
                case "ludicolo": {
                    view.setImageResource(R.drawable.ludicolo);
                    break;
                }
                case "bastiodon": {
                    view.setImageResource(R.drawable.bastiodon);
                    break;
                }

            }
            lvl.setText("Lvl: " + g.p.lvl + " ");
            exp.setText("Exp: " + g.p.exp + "/" + g.p.maxexp + " ");
            firsty.setText("Thirsty: " + g.p.firsty + "/" + g.p.maxfirsty + " ");
            satiety.setText("Satiety: " + g.p.satiety + "/" + g.p.maxsatiety + " ");
            hp.setText("Hp: " + g.p.hp + "/" + g.p.maxhp + " ");
            happiness.setText("Happy: " + g.p.happiness + " ");
        }}
    }

}
