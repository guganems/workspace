package com.example.android.timertutorial.util

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.net.Uri
import android.support.v4.app.NotificationCompat
import com.example.android.timertutorial.AppConstants
import com.example.android.timertutorial.TimerNotificationActionReceiver

class NotificationUtil {
    companion object {
        private const val CHANNEL_ID_TIMER = "menu_timer"
        private const val CHANNEL_NAME_TIMER = "Timer App Timer"
        private const val TIMER_ID = 0

        fun showTimerExpired(context: Context){
            val startIntent = Intent(context, TimerNotificationActionReceiver::class.java)
            startIntent.action = AppConstants.ACTION_START
            val startPendingIntent = PendingIntent.getBroadcast(context,
                    0, startIntent, PendingIntent.FLAG_UPDATE_CURRENT)

            val nBuilder = getBasicNotificationBuilder(context, CHANNEL_ID_TIMER, true)
        }

        private fun getBasicNotificationBuilder(context: Context, channelId: String, playSound: Boolean)
                : NotificationCompat.Builder {
            val notificationSound: Uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val nBuilder = NotificationCompat.Builder(context, channelId)
        }
    }
}