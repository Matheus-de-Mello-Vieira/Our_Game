package com.allokgames.eventhelawn.our_project.Model;

/**
 * Created by DoctorZlo on 15.02.2017.
 */

public class PlayerItems {
    private Item[] itemList;
    private final int ITEM_LIST_CAPACITY = 99;
    private int size;

    PlayerItems(){
        size = 0;
        itemList = new Item[ITEM_LIST_CAPACITY];
    }

    public void addItemToList(Item item) throws NumberOfItemsException {
        if (size < ITEM_LIST_CAPACITY) {
            itemList[size++] = item;
        }
        else {
            throw new NumberOfItemsException();
        }
    }
    public void deleteItemFromList(int valueOfItem) throws NumberOfItemsException {
        if (size > 0) {
            for (int i = valueOfItem; i < size; i++) {
                itemList[i] = itemList[i + 1];
            }
            size--;
        }
        if (size == 0) {
            throw new NumberOfItemsException();
        }
    }
    public Item getItemFromList (int valueOfItem) {
        return itemList[valueOfItem];
        /*здесь пока не стал прописывать блок try-catch
          неизвестно ещё какие замуты будут, возможно
          придётся писать finally, так что оставил пока так.
          подправим ес чё
        */
    }
    //getItemInfo пока тоже не прописываю(читай бестиарий))
}
