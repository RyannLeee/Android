package com.example.broadcasttest2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Y-Lee on 2017/3/27.
 */

public class AnotherBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive (Context context, Intent intent) {
        Toast.makeText(context, "received in AnotherBroadcastReceiver", Toast.LENGTH_SHORT).show();
    }
}

