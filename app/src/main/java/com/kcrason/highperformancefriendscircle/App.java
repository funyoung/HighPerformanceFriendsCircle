package com.kcrason.highperformancefriendscircle;

import android.app.Application;
import android.content.Context;

import com.kcrason.highperformancefriendscircle.others.DataCenter;

/**
 * @author KCrason
 * @date 2018/5/3
 */
public class App extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        DataCenter.init();
    }
}
