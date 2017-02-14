package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 17.04.2016.
 */
public class Beedrill extends Kakuna {
    Beedrill(short spd, int exp, short maxexp, short hp, short maxhp, short atk, short happiness, short maxenergy, short maxsatiety, short firsty, short maxfirsty, short energy, short def, short lvl, String name, short satiety) {
        super(spd, exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
        this.pok="beedrill";
        this.type1="Bug";
        this.type2="Poison";
        if(this.name=="kakuna")this.name="beedrill";
    }
}
