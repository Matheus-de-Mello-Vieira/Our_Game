package com.example.allokgames.pokemongame;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Main2Activity extends AppCompatActivity {

    Game g;
    Pokemon p;
    Intent intent;
    SharedPreferences mSettings;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intent = new Intent(this, Gameplay.class);
        setContentView(R.layout.activity_main2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        if (Game.p != null) startActivity(intent);
        final String[] values = new String[]{"pichu", "weedle", "lotad", "shieldon"};
        ListView lv = (ListView) findViewById(R.id.list);
        lv.setAdapter(new MyArrayAdapter(this, values));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = values[position];
                switch (s) {
                    case "pichu": {
                        p = new Pichu();
                        g = new Game(p);
                        startActivity(intent);
                        finish();
                        break;
                    }
                    case "charmander": {
                        p = new Charmander();
                        g = new Game(p);
                        startActivity(intent);
                        finish();
                        break;
                    }
                    case "weedle": {
                        p = new Weedle();
                        g = new Game(p);
                        startActivity(intent);
                        finish();
                        break;
                    }
                    case "lotad": {
                        p = new Lotad();
                        g = new Game(p);
                        startActivity(intent);
                        finish();
                        break;
                    }
                    case "shieldon": {
                        p = new Shieldon();
                        g = new Game(p);
                        startActivity(intent);
                        finish();
                        break;
                    }
                }
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.allokgames.pokemongame/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onBackPressed() {
        // TODO Auto-generated method stub
        // super.onBackPressed()
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }
    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main2 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.allokgames.pokemongame/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
