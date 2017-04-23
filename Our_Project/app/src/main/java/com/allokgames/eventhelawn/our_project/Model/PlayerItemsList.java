package com.allokgames.eventhelawn.our_project.Model;

import com.allokgames.eventhelawn.our_project.Model.Items.Item;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class PlayerItemsList {
    private ArrayList<Item> items;
    public PlayerItemsList() {
        items = new ArrayList<Item>();
    }

    public void addItemToList(Item item) {
        items.add(item);
    }
    public Item deleteItemFromList(Item item) throws ItemNotFoundException{
        if (!items.contains(item)) {
            throw new ItemNotFoundException();
        }
        Item temp = item;
        items.remove(item);
        return temp;
    }
    public Item deleteItemFromList(int index) {
        Item temp = getItem(index);
        items.remove(index);
        return temp;
    }
    public Item getItem(int index) {
        return items.get(index);
    }
    public Item getItem(Item item) throws ItemNotFoundException{
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(item)) {
                return item;
            }
        }
        throw new ItemNotFoundException();
    }
}
