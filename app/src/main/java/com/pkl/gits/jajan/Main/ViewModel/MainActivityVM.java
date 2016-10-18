package com.pkl.gits.jajan.Main.ViewModel;

import android.app.Activity;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import com.pkl.gits.jajan.Main.Fragment.DashboardFragment;
import com.pkl.gits.jajan.Main.Fragment.HomeFragment;
import com.pkl.gits.jajan.Main.Navigation.ViewModel.NavigationVM;
import com.pkl.gits.jajan.Main.RecyclerViewSetting.BestSeller.BestSellerAdapter;
import com.pkl.gits.jajan.Main.RecyclerViewSetting.SecondRecyclerView.SecondAdapter;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.api.Response.Diskon;
import com.pkl.gits.jajan.api.Response.RatingReview;
import com.pkl.gits.jajan.databinding.NavHeaderMainBinding;

import java.util.ArrayList;
import java.util.List;

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
        NavigationVM vm = new NavigationVM(mContext);
        vm.title.set("Login / Register");

        View header = navigationView.getHeaderView(0);
        NavHeaderMainBinding binding = DataBindingUtil.bind(header);
        binding.setVm(vm);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                Fragment fragment = null;
                Class fragmentClass = null;

                switch (id){
                    case R.id.nav_beranda :
                        fragmentClass = HomeFragment.class;
                        break;
                    case R.id.nav_dashboard:
                        fragmentClass = DashboardFragment.class;
                        break;
                }

                try {
                    fragment = (Fragment) fragmentClass.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                FragmentManager fragmentManager = supportFragment;
                fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}