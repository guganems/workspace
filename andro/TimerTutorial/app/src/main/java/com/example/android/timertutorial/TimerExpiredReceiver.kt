package com.example.android.timertutorial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.android.timertutorial.util.NotificationUtil
import com.example.android.timertutorial.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        NotificationUtil.showTimerExpired(context)

        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
