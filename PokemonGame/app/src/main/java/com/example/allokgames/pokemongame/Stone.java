package com.example.allokgames.pokemongame;

import java.util.ArrayList;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Stone extends Item {
    String name;
    int cost;
    static ArrayList<Stone> stones=new ArrayList<Stone>();

    public Stone(String name, int cost) {
        super(name,cost);
        this.name = name;
        this.cost = cost;
        stones.add(this);
    }
}
