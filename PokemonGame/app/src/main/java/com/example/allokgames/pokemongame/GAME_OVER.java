package com.example.allokgames.pokemongame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Галимзянов Газинур on 27.05.2016.
 */
public class GAME_OVER extends Activity {
    public GAME_OVER() {
        super();
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        // super.onBackPressed()
        Game.p = null;
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Game.p = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover);
    }
}
