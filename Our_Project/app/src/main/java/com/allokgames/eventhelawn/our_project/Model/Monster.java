package com.allokgames.eventhelawn.our_project.Model;

import android.graphics.Bitmap;

import com.allokgames.eventhelawn.our_project.Model.Items.Item;

import java.util.ArrayList;

/**
 * Created by User on 14.02.2017.
 */

//мостров пока не трогал. более менее всё необходимое есть, как разберёмся с возможностями айтемов и скилов добавлю большее.
//нужно статы в арай листе выводить
public class Monster {
    private String name;
    private String type;
    public ArrayList<Spell> spells;
    private ArrayList<Item> items;
    private ArrayList<Weakneses> weakneses;
    private StatusEffects statusEffects;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int hp;
    private int maxHp;
    private int happines;
    private boolean isDead;
    private long exp;
    private int lvl;
    private int stage;
    private Bitmap view;

    public Monster() {
        //перевод из json
    }

    public Monster(String name, String type, ArrayList<Spell> spells, ArrayList<Item> items, ArrayList<Weakneses> weakneses, int atk, int def, int spAtk, int spDef, int hp, int maxHp, int happines, boolean isDead, long exp, int lvl, int stage, Bitmap view) {
        this.name = name;
        this.type = type;
        this.spells = spells;
        this.items = items;
        this.weakneses = weakneses;
        this.atk = atk;
        this.def = def;
        this.spAtk = spAtk;
        this.spDef = spDef;
        this.hp = hp;
        this.maxHp = maxHp;
        this.happines = happines;
        this.isDead = isDead;
        this.exp = exp;
        this.lvl = lvl;
        this.stage = stage;
        this.view = view;
    }
    public void getDamage(int val){
        isDead=(val>=hp);
        hp-=val;
    }
    public  void getHealed(int val){
        hp+=val;
        if (hp>maxHp)hp=maxHp;
    }
    public void getFullyHealed(){
        hp=maxHp;
    }
    public void revive(){
        isDead=false;
        hp=maxHp/5;
    }
    public void maxRevive(){
        isDead=false;
        hp=maxHp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public StatusEffects getStatusEffects() {
        return statusEffects;
    }

    public void setStatusEffects(StatusEffects statusEffects) {
        this.statusEffects = statusEffects;
    }
    public ArrayList getStats(){
        ArrayList a=new ArrayList();
        return a;
    }
}
