package fr.test.bgservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BGServiceStarter extends BroadcastReceiver {

    public static final String tag = "bgstarter";

    public BGServiceStarter() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.v(tag, "received " + action);
        Boolean ok = false;
        ok |= action.equalsIgnoreCase(BGService.START);
        ok |= action.equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED);
        if (!ok) return;
        Intent svc = new Intent(context, BGService.class);
        context.startService(svc);
    }
}
