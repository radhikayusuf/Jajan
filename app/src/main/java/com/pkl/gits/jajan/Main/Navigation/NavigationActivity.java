package com.pkl.gits.jajan.Main.Navigation;

import android.databinding.ViewDataBinding;

import com.pkl.gits.jajan.Main.Navigation.ViewModel.NavigationVM;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.NavHeaderMainBinding;

import id.gits.mvvmcore.activity.GitsActivity;
import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Varokah on 10/17/2016.
 */

public class NavigationActivity extends GitsActivity<NavigationVM,NavHeaderMainBinding>{
    @Override
    protected int getToolbarId() {
        return 0;
    }

    @Override
    public int getResLayout() {
        return R.layout.nav_header_main;
    }

    @Override
    public NavigationVM getViewModel() {
        return new NavigationVM(this);
    }

    @Override
    public void bindViewModel(NavHeaderMainBinding binding, NavigationVM viewModel) {
        binding.setVm(viewModel);
    }
}
