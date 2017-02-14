package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Raichu extends Pikachu {
    Raichu(short spd, int exp, short maxexp, short hp, short maxhp, short atk, short happiness, short maxenergy, short maxsatiety, short firsty, short maxfirsty, short energy, short def, short lvl, String name, short satiety) {
        super(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
        if(this.name=="pikachu")this.name="raichu";
        this.pok="raichu";
        this.maxhpup=2;
        this.spdup=1;
        this.atkup=1;
        this.defup=1;
    }
}
