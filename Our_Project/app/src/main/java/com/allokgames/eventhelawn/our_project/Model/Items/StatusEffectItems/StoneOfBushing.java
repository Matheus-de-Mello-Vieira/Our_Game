package com.allokgames.eventhelawn.our_project.Model.Items.StatusEffectItems;

import com.allokgames.eventhelawn.our_project.Model.Monster;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class StoneOfBushing implements UsableStateBehaviour{
    public void useItem(Monster enemyMonster) {
        enemyMonster.getStatusEffects().setOnFire(false);
    }
}
