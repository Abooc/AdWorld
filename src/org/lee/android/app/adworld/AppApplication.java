package org.lee.android.app.adworld;

import android.app.Application;

import org.lee.android.util.Toast;

/**
 * Created by author:李瑞宇
 * email:allnet@live.cn
 * on 14-09-05.
 */
public class AppApplication extends Application {

    private static final String PROPERTY_ID = "UA-59448211-1";

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.init(this);

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

}
