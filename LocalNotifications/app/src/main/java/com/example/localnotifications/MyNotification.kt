package com.example.localnotifications

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat

const val channelID = "Channel1"
const val notificationID = 1
const val titleExtra = "titleExtra"
const val messageExtra = "MessageExtra"

class MyNotification : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        val notification = NotificationCompat.Builder(context, channelID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle(intent.getStringExtra(titleExtra))
            .setContentText(intent.getStringExtra(messageExtra))
            .build()

        val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(notificationID, notification)



    }
}