package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 17.04.2016.
 */
public class Lombre extends Lotad {
    Lombre(short spd, int exp, short maxexp, short hp, short maxhp, short atk, short happiness, short maxenergy, short maxsatiety, short firsty, short maxfirsty, short energy, short def, short lvl, String name, short satiety){
        this.exp=exp;
        this.pok="lombre";
        this.spd=spd;
        this.maxexp=maxexp;
        this.hp=hp;
        this.maxhpup=2;
        this.spdup=1;
        this.atkup=1;
        this.defup=1;
        this.maxhp=maxhp;
        this.atk=atk;
        this.happiness=happiness;
        this.energy=energy;
        this.satiety=satiety;
        this.firsty=firsty;
        this.maxfirsty=maxfirsty;
        this.maxenergy=maxenergy;
        this.def=def;
        this.lvl=lvl;
        this.name=name;
        if(this.name=="lotad")this.name="lombre";
        this.maxsatiety=maxsatiety;
        this.type1="Water";
        this.type2="Grass";
    }
}
