package com.pkl.gits.jajan.Dagger;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Varokah on 10/17/2016.
 */
@Module
public class AppModule {
    Application maApplication;
    public AppModule(Application application){
        maApplication = application;
    }

    @Singleton
    @Provides
    Application providesApplication(){
        return maApplication;
    }
}
