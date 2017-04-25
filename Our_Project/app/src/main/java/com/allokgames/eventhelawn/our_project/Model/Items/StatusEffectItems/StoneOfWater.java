package com.allokgames.eventhelawn.our_project.Model.Items.StatusEffectItems;

import com.allokgames.eventhelawn.our_project.Model.Monster;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class StoneOfWater implements UsableStateBehaviour {
    public void useItem(Monster thisMonster) {
        thisMonster.getStatusEffects().setOnFire(false);
    }
}
