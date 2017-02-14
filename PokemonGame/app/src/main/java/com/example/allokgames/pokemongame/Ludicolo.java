package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 17.04.2016.
 */
public class Ludicolo extends Lombre {
    Ludicolo(short spd, int exp, short maxexp, short hp, short maxhp, short atk, short happiness, short maxenergy, short maxsatiety, short firsty, short maxfirsty, short energy, short def, short lvl, String name, short satiety) {
        super(spd, exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
        this.pok="ludicolo";
        this.type1="Water";
        this.type2="Grass";
        if(this.name=="lombre")this.name="ludicolo";
    }
}
