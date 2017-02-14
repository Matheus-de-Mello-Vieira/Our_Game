package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 17.04.2016.
 */
public class Charizard extends Charmeleon {
    Charizard(short spd, int exp, short maxexp, short hp, short maxhp, short atk, short happiness, short maxenergy, short maxsatiety, short firsty, short maxfirsty, short energy, short def, short lvl, String name, short satiety) {
        super(spd, exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
        this.pok="charizard";
        this.type1="Fire";
        this.type2="Flying";
        if(this.name=="charmeleon")this.name="charizard";
    }
}
