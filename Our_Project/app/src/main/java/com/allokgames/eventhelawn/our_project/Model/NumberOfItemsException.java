package com.allokgames.eventhelawn.our_project.Model;

/**
 * Created by DoctorZlo on 15.02.2017.
 */

public class NumberOfItemsException extends Exception {
    @Override
    public String toString() {
        return "Ошибка при добавлении/удалении предмета в лист \n";
    }
}
