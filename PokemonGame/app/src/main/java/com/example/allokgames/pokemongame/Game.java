package com.example.allokgames.pokemongame;

import java.util.ArrayList;

/**
 * Created by Галимзянов Газинур on 15.04.2016.
 */
public class Game {
    static Pokemon p=null   ;
    static int money=1000000000;
    static String stone=null;
    static ArrayList<Item> items=new ArrayList<>();
    public Game(){

    }
    public Game(Pokemon p) {
        this.p=p;
    }
    public void evolve(){
        if(!p.lvlupped)return;
        if (p.pok=="pichu") {
            if (p.happiness >= 250) {
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+15);
                short maxhp = (short) (p.maxhp+15);
                short atk = (short) (p.atk+15);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+15);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd+30);
                p= new Pikachu(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);

            }
        }
        if (p.pok=="charmander"){
            if(p.lvl==16){
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+19);
                short maxhp = (short) (p.maxhp+19);
                short atk = (short) (p.atk+12);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+15);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd+15);
                p= new Charmeleon(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);

            }
        }
        if(p.pok=="carmeleon"){
            if(p.lvl==36){
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+20);
                short maxhp = (short) (p.maxhp+20);
                short atk = (short) (p.atk+20);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+20);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd+20);
                p= new Charizard(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
            }
        }
        if(p.pok=="shieldon"){
            if(p.lvl==30){
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+30);
                short maxhp = (short) (p.maxhp+30);
                short atk = (short) (p.atk+10);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+50);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd=p.spd;
                p= new Bastiodon(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
            }
        }
        if (p.pok=="weedle"){
            if(p.lvl==7){
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+5);
                short maxhp = (short) (p.maxhp+5);
                short atk = (short) (p.atk-10);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+20);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd-15);
                p= new Kakuna(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
            }

        }
        if(p.pok=="kakuna"){

            if(p.lvl==10){
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+15);
                short maxhp = (short) (p.maxhp+15);
                short atk = (short) (p.atk+55);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def-10);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd+40);
                p= new Beedrill(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
            }
        }
        if (p.pok=="lotad"){
            if(p.lvl==14){
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+20);
                short maxhp = (short) (p.maxhp+20);
                short atk = (short) (p.atk+20);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+20);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd+20);
                p= new Lombre(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
            }
        }
    }
    public void buystone(String stone){
        for(Stone stone1:Stone.stones){
            if(stone1.name==stone)items.add(stone1);
        }
    }
    public static void usestone(){
        p.usestone(stone);
        if (p.pok=="pikachu") {
            if (p.stoneused=="Thunder stone") {
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+25);
                short maxhp = (short) (p.maxhp+25);
                short atk = (short) (p.atk+35);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+25);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd+10);
                p= new Raichu(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
            }
        }
        if (p.pok=="lombre") {
            if (p.stoneused=="Water stone") {
                int exp = p.exp;
                short maxexp = p.maxexp;
                short hp = (short) (p.maxhp+20);
                short maxhp = (short) (p.maxhp+20);
                short atk = (short) (p.atk+20);
                short happiness = p.happiness;
                short maxenergy = p.maxenergy;
                short maxsatiety = p.maxsatiety;
                short firsty = p.maxfirsty;
                short maxfirsty = p.maxfirsty;
                short energy = p.maxenergy;
                short def = (short) (p.def+20);
                short lvl = p.lvl;
                String name = p.name;
                short satiety = p.maxsatiety;
                short spd= (short) (p.spd+20);
                p= new Ludicolo(spd,exp, maxexp, hp, maxhp, atk, happiness, maxenergy, maxsatiety, firsty, maxfirsty, energy, def, lvl, name, satiety);
            }
        }
    }
}
