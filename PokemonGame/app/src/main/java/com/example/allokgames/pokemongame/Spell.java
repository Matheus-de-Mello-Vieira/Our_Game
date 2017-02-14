package com.example.allokgames.pokemongame;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Spell {
    short dmg;
    String type;
    short chance;
    boolean isatack;
    boolean isbuff;
    boolean isdebuff;
    boolean isparalize;
    boolean ischarm;
    short paralize;
    short buffatk;
    short buffdef;
    public void use(Pokemon p1,Pokemon p2){
        if (isatack){float mn;
            switch (this.type){
                case "normal":mn=p2.mnnormal;break;
                case "fire":mn=p2.mnfire;break;
                case "water":mn=p2.mnwater;break;
                case "thunder":mn=p2.mnthunder;break;
                case "grass":mn=p2.mngrass;break;
                case "ice":mn=p2.mnice;break;
                case "fighting":mn=p2.mnfighting;break;
                case "poison":mn=p2.mnpoison;break;
                case "ground":mn=p2.mnground;break;
                case "flying":mn=p2.mnflying;break;
                case "psycho":mn=p2.mnpsycho;break;
                case "bug":mn=p2.mnbug;break;
                case "rock":mn=p2.mnrock;break;
                case "ghost":mn=p2.mnghost;break;
                case "dragon":mn=p2.mndragon;break;
                case "dark":mn=p2.mndark;break;
                case "steel":mn=p2.mnsteel;break;
                default: mn=1;
            }
            p2.hp-=(p1.atk+p1.buffatk)/(p2.def+p2.buffdef)*mn*dmg;
        }
        else if(isbuff){
            p1.buffatk+=buffatk;
            p1.buffdef+=buffdef;
        }
        else if(isdebuff){
            p2.buffdef+=buffdef;
            p2.buffatk+=buffatk;
        }
        else if(isparalize)p2.paralize+=paralize;
        else if(ischarm)p2.isconfused=true;
    }
}
