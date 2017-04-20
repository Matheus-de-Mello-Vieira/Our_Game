package com.allokgames.eventhelawn.our_project.Controller;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.widget.RecyclerView;

import com.allokgames.eventhelawn.our_project.R;
/**
 * Created by User on 20.04.2017.
 */
public class BattleActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battle);
        mRecyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);
    }
}
