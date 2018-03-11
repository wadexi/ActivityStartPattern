package com.example.seele.activitystartpattern;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by SEELE on 2018/3/9.
 */

public class ActivityTaskUtils {

    public static void printActivityTask(Context context){
        final String TAG = "ActivityTaskUtils";
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        for (ActivityManager.AppTask appTask: appTasks){
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            Log.i(TAG, "RecentTaskInfo: 任务栈的id:" + taskInfo.id + "  任务栈的数量：" + taskInfo.numActivities + "  topActivity:" + taskInfo.topActivity);
        }
        Log.i(TAG, "printActivityTask: \n\n");
//        List<ActivityManager.RunningTaskInfo> runningTaskInfos = activityManager.getRunningTasks(100);
//        for (ActivityManager.RunningTaskInfo runningTaskInfo: runningTaskInfos){
//            Log.i(TAG, "RunningTaskInfo: 任务栈的id:" + runningTaskInfo.id + "  任务栈的数量：" + runningTaskInfo.numActivities + "  topActivity:" + runningTaskInfo.topActivity);
//        }

    }
}
