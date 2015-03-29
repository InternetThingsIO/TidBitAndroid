package io.internetthings.tidbit;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

import java.util.concurrent.TimeUnit;

/*
     The TidBit Service, runs in the background and currently displays in the logcat window when a
     notification was posted or removed.

 */

public class TidBitNotificationService extends NotificationListenerService {

    private final String logTag = this.getClass().getName();

    public TidBitNotificationService() {
    }

    //Displays notification posted with the ID in the logcat window
    @Override
    public void onNotificationPosted(StatusBarNotification sbn){
        Log.w(logTag, "Notification Posted****************" + sbn.getPackageName() + " Id: " + sbn.getId());
        //adding a comment
    }

    //Displays notifications removed in the logcat window
    @Override
    public void onNotificationRemoved(StatusBarNotification sbn){
        Log.w(logTag, "Notification Removed****************" + sbn.getPackageName() + " Id: " + sbn.getId());
    }


}
