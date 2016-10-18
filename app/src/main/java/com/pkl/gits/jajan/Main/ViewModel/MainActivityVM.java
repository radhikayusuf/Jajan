package com.pkl.gits.jajan.Main.ViewModel;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;
import android.view.View;

import com.pkl.gits.jajan.Category.Category.CategoryActivity;
import com.pkl.gits.jajan.Main.Fragment.DashboardFragment;
import com.pkl.gits.jajan.Main.Fragment.HomeFragment;
import com.pkl.gits.jajan.Main.Navigation.ViewModel.NavigationVM;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.NavHeaderMainBinding;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 17/10/16.
 */

public class MainActivityVM extends GitsVM{

    private static Context ctx;
    private DrawerLayout drawerLayout;
    private FragmentManager supportFragment;

    public MainActivityVM(Context context, NavigationView navigationView, DrawerLayout drawer, FragmentManager supportFragmentManager) {
        super(context);
        ctx = context;
        drawerLayout = drawer;
        supportFragment = supportFragmentManager;
//        NavigationVM vm = new NavigationVM(mContext);
//        vm.title.set("Login / Register");

//        View header = navigationView.getHeaderView(0);
//        NavHeaderMainBinding binding = DataBindingUtil.bind(header);
//        binding.setVm(vm);
    }
}