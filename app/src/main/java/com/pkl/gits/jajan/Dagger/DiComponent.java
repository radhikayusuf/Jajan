package com.pkl.gits.jajan.Dagger;

import com.pkl.gits.jajan.Main.MainActivity;
import com.pkl.gits.jajan.Main.ViewModel.MainActivityVM;
import com.pkl.gits.jajan.api.Core.ApiClient;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;

/**
 * Created by Varokah on 10/17/2016.
 */
@Singleton
@Component(modules = {AppModule.class,NetModule.class})
public interface DiComponent {
    ApiClient apiClient();
    void InjectMainVM(MainActivityVM mainActivityVM);
}
