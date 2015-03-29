package io.internetthings.tidbit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/*
 * This class autostarts the Tidbit Service upon phone boot.
 */

public class autostart extends BroadcastReceiver {
    public void onReceive(Context arg0, Intent arg1)
    {
        Intent intent = new Intent(arg0,TidBitNotificationService.class);
        arg0.startService(intent);
        Log.i("Autostart", "TidBit service started");
    }
}
