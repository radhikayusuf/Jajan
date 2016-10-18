package com.pkl.gits.jajan.Network.Dagger;

import com.pkl.gits.jajan.Main.ViewModel.MainActivityVM;
import com.pkl.gits.jajan.Network.api.Core.ApiClient;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Varokah on 10/17/2016.
 */
@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface DiComponent {
    ApiClient apiClient();
    void InjectMainVM(MainActivityVM mainActivityVM);
}
