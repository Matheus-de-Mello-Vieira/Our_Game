package com.allokgames.eventhelawn.our_project.Model;

/**
 * Created by DoctorZlo on 23.04.2017.
 */

public class StatusEffects {
    private boolean onFire = false;
    private boolean stunned = false;
    private static int stunResistanceCounter = 0;   //НЕ ЗАБЫВАТЬ УМЕНЬШАТЬ НА ЕДЕНИЦУ ДО НУЛЯ, ВО ВРЕМЯ БИТВЫ

    public void setOnFire(boolean onFire) {
        this.onFire = onFire;
    }

    public void setStunned(boolean stunned) {
        if (!(stunResistanceCounter > 0)) {
            this.stunned = stunned;
        }
    }

    public boolean isOnFire() {
        return onFire;
    }
    public boolean isStunned() {
        return stunned;
    }

    public void careFromStun(int numberOfTurns) {
        stunResistanceCounter = numberOfTurns;
    }
}
