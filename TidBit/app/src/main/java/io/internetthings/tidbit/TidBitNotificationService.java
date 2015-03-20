package io.internetthings.tidbit;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;


public class TidBitNotificationService extends NotificationListenerService {

    private final String logTag = this.getClass().getName();

    public TidBitNotificationService() {
    }

    @Override
    public void onNotificationPosted(StatusBarNotification sbn){
        Log.w(logTag, "Notification Posted****************" + sbn.getPackageName());
        //adding a comment
    }

    @Override
    public void onNotificationRemoved(StatusBarNotification sbn){
        Log.w(logTag, "Notification Removed****************" + sbn.getPackageName());
    }

}
