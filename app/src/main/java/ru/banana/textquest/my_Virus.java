package ru.banana.textquest;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class my_Virus extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "fkjd", Toast.LENGTH_LONG).show();
    }
}
