package com.example.allokgames.pokemongame;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.IBinder;

import java.util.Timer;
import java.util.TimerTask;

public class Notifyer extends Service {
    private static final int NOTIFY_ID = 322;
    Game g=new Game();
    public Notifyer() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if((g.p.firsty<=50)||(g.p.satiety<=50))notifyme();
            }
        },10,10);
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    public void notifyme(){
        Context context = getApplicationContext();

        Intent notificationIntent = new Intent(context, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(context,
                0, notificationIntent,
                PendingIntent.FLAG_CANCEL_CURRENT);

        Resources res = context.getResources();
        Notification.Builder builder = new Notification.Builder(context);

        builder.setContentIntent(contentIntent)
                .setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.sadpoke))
                //.setTicker(res.getString(R.string.warning)) // текст в строке состояния
                .setTicker("Последнее китайское предупреждение!")
                .setWhen(System.currentTimeMillis())
                .setAutoCancel(true)
                //.setContentTitle(res.getString(R.string.notifytitle)) // Заголовок уведомления
                .setContentTitle("Напоминание")
                //.setContentText(res.getString(R.string.notifytext))
                .setContentText("Покемону нужно внимание"); // Текст уведомления

        // Notification notification = builder.getNotification(); // до API 16
        Notification notification = builder.build();

        NotificationManager notificationManager = (NotificationManager) context
                .getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFY_ID, notification);
    }
}
