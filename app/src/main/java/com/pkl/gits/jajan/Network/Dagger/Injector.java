package com.pkl.gits.jajan.Network.Dagger;

import android.app.Application;

/**
 * Created by Varokah on 10/17/2016.
 */

public class Injector {
    public static DiComponent component;
    public static DiComponent Initialize(Application application){
        component = DaggerDiComponent.builder()
                .appModule(new AppModule(application))
                .netModule(new NetModule())
                .build();
        return component;
    }
}
