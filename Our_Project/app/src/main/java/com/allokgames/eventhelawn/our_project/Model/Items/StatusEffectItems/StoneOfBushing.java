package com.allokgames.eventhelawn.our_project.Model.Items.StatusEffectItems;

import com.allokgames.eventhelawn.our_project.Model.Monster;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class StoneOfBushing implements UsableStateBehaviour{
    private static String NAME = "Stone of Bushing";
    @Override
    public String getName() {
        return NAME;
    }
    public void useItem(Monster enemyMonster) {
        enemyMonster.getStatusEffects().setOnFire(false);
    }
}
