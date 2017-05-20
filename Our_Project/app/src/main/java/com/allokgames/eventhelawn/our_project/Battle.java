package com.allokgames.eventhelawn.our_project;

import com.allokgames.eventhelawn.our_project.Model.Monster;

/**
 * Created by DoctorZlo on 14.05.2017.
 */

public class Battle extends Thread{
    private Monster monster1;
    private Monster monster2;
    public Battle(Monster monster1, Monster monster2) {
        this.monster1 = monster1;
        this.monster2 = monster2;
    }

    @Override
    public void run() {


    }
}
