package com.allokgames.eventhelawn.our_project.Data;

import com.allokgames.eventhelawn.our_project.Model.Items.Item;
import com.allokgames.eventhelawn.our_project.Model.ItemNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class GlobalItemList {
    private ArrayList<Item> items;
    public GlobalItemList() {
        items = new ArrayList<Item>();
    }
    public void addItemToList(Item item) {
        items.add(item);
    }
    public Item deleteItemFromList(Item item) throws ItemNotFoundException {
        if (!items.contains(item)) {
            throw new ItemNotFoundException();
        }
        Item temp = item;
        items.remove(item);
        return temp;
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
