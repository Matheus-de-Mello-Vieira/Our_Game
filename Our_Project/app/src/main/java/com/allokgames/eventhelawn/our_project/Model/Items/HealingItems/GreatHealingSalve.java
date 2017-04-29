package com.allokgames.eventhelawn.our_project.Model.Items.HealingItems;

import com.allokgames.eventhelawn.our_project.Model.Monster;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class GreatHealingSalve implements UsableHealingBehavior{
    private static String NAME = "Great healing salve";
    @Override
    public String getName() {
        return NAME;
    }
    public void useItem(Monster thatMonster) {
        thatMonster.getHealed(200);
    }
}
