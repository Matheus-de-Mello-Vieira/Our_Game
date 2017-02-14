package com.example.allokgames.pokemongame;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Pokemon {
    public ArrayList<Spell> spells=new ArrayList<>();
    public HashMap<Integer,Spell> allspells=new HashMap<Integer, Spell>();
    public boolean isdead=false;
    public short spd;
    public boolean lvlupped;
    public String pok;
    public short maxhpup;
    public short spdup;
    public short atkup;
    public short defup;
    public short lvl=0;
    public String stoneused;
    public String type1;
    public String type2;
    public boolean isconfused;
    public float mnnormal;
    public float mnfire;
    public float mnwater;
    public float mnthunder;
    public float mngrass;
    public float mnice;
    public float mnfighting;
    public float mnpoison;
    public float mnground;
    public float mnflying;
    public float mnpsycho;
    public float mnbug;
    public float mnrock;
    public float mnghost;
    public float mndragon;
    public float mndark;
    public float mnsteel;
    public short def;
    public short paralize;
    public short buffatk=0;
    public short buffdef=0;
    public String name=null;
    public short expforwin=100;
    public short expforlose=10;
    public int exp;
    public short maxexp;
    public short hp;
    public short maxhp;
    public short atk;
    public short happiness;
    public short maxenergy;
    public short maxsatiety;
    public short firsty;
    public short maxfirsty;
    public short energy;
    public short satiety;
    public void eat(){
        satiety+=maxsatiety/20;
        if (satiety>maxsatiety)satiety=maxsatiety;
    }
    public void sleep(){
        energy+=maxenergy/20;
        if(energy>maxenergy)energy=maxenergy;
    }
    public void drink(){
        energy+=maxenergy/10;
        firsty+=maxfirsty/20;
        if(energy>maxenergy)energy=maxenergy;
        if(firsty>maxfirsty)firsty=maxfirsty;
    }
    public void play(){
        happiness+=Math.random()*5+1;
        satiety-=Math.random()*5+1;
        firsty-=Math.random()*5+1;
        if((satiety<=0)||(firsty<=0))isdead=true;
    }
    public void walk(){
        happiness+=Math.random()*5+1;
        satiety-=Math.random()*5+1;
        firsty-=Math.random()*5+1;
        if((satiety<=0)||(firsty<=0))isdead=true;
    }
    public void train(){
        exp+=100;
        satiety-=Math.random()*5+1;
        firsty-=Math.random()*5+1;
        happiness+=Math.random()*5+1;
        if((satiety<=0)||(firsty<=0))isdead=true;
        lvlupped=false;
        if (exp>maxexp){
            lvlup();
        }
    }
    public void win(short oplvl){
        exp+=expforwin*oplvl/lvl;
        lvlupped=false;
        if (exp>maxexp){
            lvlup();
        }
    }

    public void lose(short oplvl){
        exp+=expforlose*oplvl/lvl;
        lvlupped=false;
        if (exp>maxexp){
            lvlup();
        }
    }

    public void lvlup(){
        lvlupped = true;
        exp-=maxexp;
        maxexp+=maxexp/4;
        if(maxexp>10000)maxexp=10000;
        float currenthp=hp/maxhp;
        maxhp+=maxhpup;
        hp= (short) (maxhp*currenthp);
        atk+=atkup;
        def+=defup;
        spd+=spdup;
        lvl++;
        if (exp>maxexp){
            lvlup();
        }
    }
    public void usestone(String stone){
        stoneused=stone;
    }
    public  void skill(){
        if (allspells.containsKey(this.lvl))this.spells.add(allspells.get(this.lvl));
    }
}
