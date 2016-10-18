package com.pkl.gits.jajan.Main.ViewModel;

import android.app.Activity;
import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.design.widget.NavigationView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;

import com.pkl.gits.jajan.Main.RecyclerViewSetting.BestSeller.BestSellerAdapter;
import com.pkl.gits.jajan.Main.RecyclerViewSetting.SecondRecyclerView.SecondAdapter;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.api.Response.Diskon;
import com.pkl.gits.jajan.api.Response.RatingReview;
import java.util.ArrayList;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 17/10/16.
 */

public class MainActivityVM extends GitsVM {

    private static Context ctx;
    public MainActivityVM(Context context) {
        super(context);
        ctx = context;

    }

    @BindingAdapter({"header"})
    public static void changeHeader(NavigationView navigationView,String noString){
        View header = LayoutInflater.from(ctx).inflate(R.layout.nav_header_main,null);
        navigationView.addHeaderView(header);
    }
}