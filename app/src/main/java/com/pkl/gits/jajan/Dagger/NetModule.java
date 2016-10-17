package com.pkl.gits.jajan.Dagger;

import com.pkl.gits.jajan.api.ApiInterface;
import com.pkl.gits.jajan.api.Core.ApiClient;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Varokah on 10/17/2016.
 */
@Module
public class NetModule {
    @Singleton
    @Provides
    ApiClient provideApiClient(){
        return new ApiClient("example link");
    }
}
