package com.allokgames.eventhelawn.our_project.Model;

/**
 * Created by DoctorZlo on 15.02.2017.
 */

/* вот сейчас реальная отсебятина о том, как я вижу хранение
   данных об айтемах и работу с магазином)))) 100% треш
*/
public class Shop {
    private Item[] itemList;
    private int[] priceList;
    private final int SHOP_CAPACITY = 20; //собсна на свой вкус, пока что.
    private int size;

    Shop() {
        // заполняем массив айтемов и массив цен соответственно. Выставляем начальный "size"
    }

    public Item ifPurchaseItem(int valueOfItemInShop) {
        return itemList[valueOfItemInShop];
        //Опять же, от блока try-catch пока воздержался. Обсудим этот момент.
    }
    public void appendNewItem(Item newItem) throws NumberOfItemsException {
        if (size < SHOP_CAPACITY) {
            itemList[size++] = newItem;
        }
        if (size == SHOP_CAPACITY) {
            System.out.println("Невозможно добавить новый предмет");
            throw new NumberOfItemsException();
        }
        //Эт на случай, если захочешь расширяемый со временем магаз)
        //Ну там, типо, с уровнем новые айтемы доступны, всё такое.
        //Пока что максимальное кол-во айтемов я ограничил, но это
        //можно и убрать, как захочешь)
    }

    public int getItemPrice(int valueOfItem) {
        return priceList[valueOfItem];
    }
    public Item getItem(int valueOfItem) {
        return itemList[valueOfItem];
    }

}
// Так как айтемы покупает игрок, специфику покупки повяжу на игрока. Здесь тупо
// хранилище. Мне кажется, это более-менее удачное решение.