package com.allokgames.eventhelawn.our_project.Data;

import com.allokgames.eventhelawn.our_project.Model.Monster;
import com.allokgames.eventhelawn.our_project.Model.MonsterNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class GlobalBestiary {
    private ArrayList<Monster> bestiary;
    public GlobalBestiary() {
        bestiary = new ArrayList<Monster>();
    }
    public void addMonsterToBestiary(Monster monster) {
        bestiary.add(monster);
    }
    public Monster deleteMonsterFromBestiary(Monster monster) throws MonsterNotFoundException {
        if (!bestiary.contains(monster)) {
            throw new MonsterNotFoundException();
        }
        Monster temp = monster;
        bestiary.remove(monster);
        return monster;
    }
    public Monster getMonster(Monster monster) throws MonsterNotFoundException{
        Iterator<Monster> iterator = bestiary.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().equals(monster)) {
                return monster;
            }
        }
        throw new MonsterNotFoundException();
    }
}
