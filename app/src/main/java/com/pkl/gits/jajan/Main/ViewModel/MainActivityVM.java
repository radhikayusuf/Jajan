package com.pkl.gits.jajan.Main.ViewModel;

import android.app.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;

import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.ContentMainBinding;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 17/10/16.
 */

public class MainActivityVM extends GitsVM {
    public AppBarVM appBarVM;
    public MainActivityVM(Context context) {
        super(context);
        appBarVM = new AppBarVM(mContext);
    }

}
