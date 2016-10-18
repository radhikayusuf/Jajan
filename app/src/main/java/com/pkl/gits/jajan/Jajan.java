package com.pkl.gits.jajan;

import android.app.Application;

import com.pkl.gits.jajan.Network.Dagger.Injector;

/**
 * Created by root on 17/10/16.
 */

public class Jajan extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Injector.Initialize(this);
    }
}
