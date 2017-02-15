package com.allokgames.eventhelawn.our_project.Model;

/**
 * Created by DoctorZlo on 15.02.2017.
 */

public class Bestiary {
    private Monster[] monsterList;
    private int size;
    private final int MAX_CAPACITY = 10;  //Спокойно можно поменять при желании. избавиться от final тоже.

    Bestiary() {
        size = 0;
        monsterList = new Monster[MAX_CAPACITY];
    }

    public void addMonsterToBestiary(Monster monster) throws NumberOfMonstersException {
        if (size < MAX_CAPACITY) {
            monsterList[size++] = monster;
        }
        if (size >= MAX_CAPACITY) {
            throw new NumberOfMonstersException();
        }
    }
    public void deleteMonsterFromBestiary(int valueOfMonster) throws NumberOfMonstersException {
        if (size > 0) {
            for (int i = valueOfMonster; i < size; i++) {
                monsterList[i] = monsterList[i + 1];
            }
            size--;
        }
        if (size == 0) {
            throw new NumberOfMonstersException();
        }
    }
    public Monster getMonsterFromBestiary(int valueOfMonster) {
        return monsterList[valueOfMonster];
        /*здесь пока не стал прописывать блок try-catch
          неизвестно ещё какие замуты будут, возможно
          придётся писать finally, так что оставил пока так.
          подправим ес чё
        */
    }
    //getMonsterInfo пока не прописываю, возможно, придётся пилить целый объект с окошком информации.
}
