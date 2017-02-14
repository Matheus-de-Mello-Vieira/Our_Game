package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Item {
    String name;
    int cost;


    public Item(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
