package io.internetthings.tidbit;
/*
    Created by: Jason Maderski and George Sapp
    Date:03/29/2015
    Name: Tidbit
    Version: 0.2

    v.1 - The Tidbit program, currently very simple and just say's "hi" and runs the Tidbit service if
    it is not running.

    v0.2 - added button to take user to Notification access menu in settings

 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    //Initialize the activity, Always followed by onStart()
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toastMSG("Hi");
    }

    /*Called after your activity has been stopped, prior to it being started again.
    Always followed by onStart() */
    protected void onRestart(){
        super.onRestart();
    }

    /*Called when the activity is becoming visible to the user.  Followed by onResume if the
    activity comes to the foreground, or onStop() if it becomes hidden */
    protected void onStart(){
        super.onStart();
    }

    /*Called when the activity will start interacting with the user. At this point your
    activity is at the top of the activity stack, with user input going to it. Always
    followed by onPause(). */
    protected void onResume(){
        super.onResume();
    }

    /*Called when the system is about to start resuming a previous activity.  Followed by
      onResume() or onStop() */
    protected void onPause(){
        super.onPause();
    }

    /*  Called when the activity is no longer visible to the user, because another activity
    has been resumed and is covering this one. Followed by onRestart or onDestroy */
    protected void onStop(){
        super.onStop();
    }

    /*The final call you receive before your activity is destroyed. */
    protected void onDestroy(){
        super.onDestroy();
    }

    //Takes user to the notification access menu
    public void nAccessButton(View v){
        Intent intent=new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        startActivity(intent);
    }

    //Creates toast message
    public void toastMSG(CharSequence text){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
