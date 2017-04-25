package com.allokgames.eventhelawn.our_project.Model;

/**
 * Created by DoctorZlo on 15.02.2017.
 */

public class Player {
    private Monster currentMonster;
    private PlayerBestiaryList bestiary;
    private PlayerItemsList items;
    private long money;

    Player() {
        bestiary = new PlayerBestiaryList();
        items = new PlayerItemsList();
        //Продумать конструктор (возможно добавление начального монстра в "бестиарий" и "текущего монстра")
    }

    public Monster getCurrentMonster() {
        return currentMonster;
    }
    public void setCurrentMonster(Monster monster) {                                                //тут тоже конечно ещё хрен пойми, по значению в массиве монстров выбирать
        currentMonster = monster;                                                                   //и предметы, или ещё как, я толком не знаю что именно можно получить
    }                                                                                               //"тапнув" на покупку/выбор в магазине/бестираии... Сделаю что могу а ты уж оценишь.
    public void changeActiveMonster(int valueOfMonsterInBestiary) {
        currentMonster = bestiary.getMonster(valueOfMonsterInBestiary);
    }


    //useItem пока не прописываю, хотя ввиду твоего "тамагочного фетиша", возможно, такие
    //возможности понадобятся. Если что добавлю и запушу, когда инфы о специфике желаемой
    //больше будет))
}
