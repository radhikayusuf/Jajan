package com.pkl.gits.jajan.Network.Dagger;

import com.pkl.gits.jajan.Network.api.Core.ApiClient;

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
