package com.qianniao.dialog;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

public class DialogPlugin extends Application {

    private static Context context;
    private static Handler handler;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static Context getContext() {
        return context;
    }

    public static Handler getHandler() {
        return handler;
    }
}
