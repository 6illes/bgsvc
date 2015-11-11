package fr.test.bgservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class BGService extends Service {

    public static final String tag = "bgservice";

    public static final String START = "fr.test.bgservice.intent.action.START";

    public BGService() {
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v(tag, "created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v(tag, "started");
        return START_NOT_STICKY;
    }
}
