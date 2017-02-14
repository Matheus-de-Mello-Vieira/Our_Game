package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Pikachu extends Pichu {
    Pikachu(short spd, int exp, short maxexp, short hp, short maxhp, short atk, short happiness, short maxenergy, short maxsatiety, short firsty, short maxfirsty, short energy, short def, short lvl, String name, short satiety){
        this.exp=exp;
        this.pok="pikachu";
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
        if(this.name=="pichu")this.name="pikachu";
        this.maxsatiety=maxsatiety;
        this.type1="Thunder";
    }
}
