package com.allokgames.eventhelawn.our_project.Model.Items.StatusEffectItems;

import com.allokgames.eventhelawn.our_project.Model.Monster;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class StoneOfStunResistance implements UsableStateBehaviour{
    private static String NAME = "Stone of stun resistance";
    @Override
    public String getName() {
        return NAME;
    }
    private final int NUMBER_OF_TURNS = 3;
    public void useItem(Monster thisMonster) {
        thisMonster.getStatusEffects().careFromStun(NUMBER_OF_TURNS);
    }
}
