package com.example.allokgames.pokemongame;

import android.content.SharedPreferences;

/**
 * Created by Галимзянов Газинур on 21.04.2016.
 */
public class SP {
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_NAME = "Name";
    public static final String APP_PREFERENCES_SPD = "Spd";
    public static final String APP_PREFERENCES_EXP = "Exp";
    public static final String APP_PREFERENCES_MAXEXP = "Maxexp";
    public static final String APP_PREFERENCES_HP = "Hp";
    public static final String APP_PREFERENCES_MAXHP = "Maxhp";
    public static final String APP_PREFERENCES_ATK = "Atk";
    public static final String APP_PREFERENCES_HAPPINESS = "Happiness";
    public static final String APP_PREFERENCES_MAXENERGY = "Maxenergy";
    public static final String APP_PREFERENCES_MAXSATIETY = "Maxsatiety";
    public static final String APP_PREFERENCES_MAXFIRSTY = "Maxfirsty";
    public static final String APP_PREFERENCES_FIRSTY = "Firsty";
    public static final String APP_PREFERENCES_ENERGY = "Energy";
    public static final String APP_PREFERENCES_DEF = "Def";
    public static final String APP_PREFERENCES_LVL = "Lvl";
    public static final String APP_PREFERENCES_POK = "Pok";
    public static final String APP_PREFERENCES_SATIETY = "Satiety";

    public static void save(Pokemon p, SharedPreferences mSettings) {
        String s;
        int i;
        SharedPreferences.Editor editor = mSettings.edit();
        s = p.name;
        editor.putString(APP_PREFERENCES_NAME, s);
        s = p.pok;
        editor.putString(APP_PREFERENCES_POK, s);
        i = p.spd;
        editor.putInt(APP_PREFERENCES_SPD, i);
        i = p.exp;
        editor.putInt(APP_PREFERENCES_EXP, i);
        i = p.maxexp;
        editor.putInt(APP_PREFERENCES_MAXEXP, i);
        i = p.hp;
        editor.putInt(APP_PREFERENCES_HP, i);
        i = p.maxhp;
        editor.putInt(APP_PREFERENCES_MAXHP, i);
        i = p.atk;
        editor.putInt(APP_PREFERENCES_ATK, i);
        i = p.happiness;
        editor.putInt(APP_PREFERENCES_HAPPINESS, i);
        i = p.maxenergy;
        editor.putInt(APP_PREFERENCES_MAXENERGY, i);
        i = p.maxsatiety;
        editor.putInt(APP_PREFERENCES_MAXSATIETY, i);
        i = p.firsty;
        editor.putInt(APP_PREFERENCES_FIRSTY, i);
        i = p.maxfirsty;
        editor.putInt(APP_PREFERENCES_MAXFIRSTY, i);
        i = p.energy;
        editor.putInt(APP_PREFERENCES_ENERGY, i);
        i = p.def;
        editor.putInt(APP_PREFERENCES_DEF, i);
        i = p.lvl;
        editor.putInt(APP_PREFERENCES_LVL, i);
        i = p.satiety;
        editor.putInt(APP_PREFERENCES_SATIETY, i);
        editor.apply();
    }

    public static Pokemon load(SharedPreferences mSettings) {
        Pokemon p = null;
        int exp = mSettings.getInt(APP_PREFERENCES_EXP, 0);
        short maxexp = (short) mSettings.getInt(APP_PREFERENCES_MAXEXP, 0);
        short hp = (short) mSettings.getInt(APP_PREFERENCES_HP, 0);
        short maxhp = (short) mSettings.getInt(APP_PREFERENCES_MAXHP, 0);
        short atk = (short) mSettings.getInt(APP_PREFERENCES_ATK, 0);
        short happiness = (short) mSettings.getInt(APP_PREFERENCES_HAPPINESS, 0);
        short maxenergy = (short) mSettings.getInt(APP_PREFERENCES_MAXENERGY, 0);
        short maxsatiety = (short) mSettings.getInt(APP_PREFERENCES_MAXSATIETY, 0);
        short firsty = (short) mSettings.getInt(APP_PREFERENCES_FIRSTY, 0);
        short maxfirsty = (short) mSettings.getInt(APP_PREFERENCES_MAXFIRSTY, 0);
        short energy = (short) mSettings.getInt(APP_PREFERENCES_ENERGY, 0);
        short def = (short) mSettings.getInt(APP_PREFERENCES_DEF, 0);
        short lvl = (short) mSettings.getInt(APP_PREFERENCES_LVL, 0);
        String name = mSettings.getString(APP_PREFERENCES_NAME, "");
        short satiety = (short) mSettings.getInt(APP_PREFERENCES_SATIETY, 0);
        short spd = (short) mSettings.getInt(APP_PREFERENCES_SPD, 0);
        switch (mSettings.getString(APP_PREFERENCES_POK, "")) {
            case "pichu":p=new Pichu(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "charmander":p=new Charmander(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "weedle":p=new Weedle(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "lotad":p=new Lotad(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "shieldon":p=new Shieldon(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "pikachu":p=new Pikachu(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "raichu":p=new Raichu(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "charmeleon":p=new Charmeleon(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "charizard":p=new Charizard(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "kakuna":p=new Kakuna(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "beedrill":p=new Beedrill(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "bastiodon":p=new Bastiodon(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "lombre":p=new Lombre(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;
            case "ludicolo":p=new Ludicolo(spd,exp,maxexp,hp,maxhp,atk,happiness,maxenergy,maxsatiety,firsty,maxfirsty,energy,def,lvl,name,satiety);break;

        }
        return p;
    }
}
