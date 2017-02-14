package com.example.allokgames.pokemongame;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.Timer;
import java.util.TimerTask;

public class Upload extends Service {
    public Upload() {
    }

    Game g=new Game();
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Timer timer1=new Timer();
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                g.p.satiety = (short) (g.p.satiety - 2);
                g.p.firsty = (short) (g.p.firsty - 2);
                if ((g.p.satiety <= 50) || (g.p.firsty <= 50)) {
                    g.p.happiness -= 2;
                    g.p.hp -= 2;
                }
            }
        },3000,3000);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
