package com.allokgames.eventhelawn.our_project.Model.Items;

import com.allokgames.eventhelawn.our_project.Model.Monster;

/**
 * Created by User on 14.02.2017.
 */
public interface Item {
    void useItem(Monster monster);
    String getName();
}
