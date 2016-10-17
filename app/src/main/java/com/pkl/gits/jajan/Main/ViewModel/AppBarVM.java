package com.pkl.gits.jajan.Main.ViewModel;

import android.content.Context;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 17/10/16.
 */


public class AppBarVM extends GitsVM{
    public ContentMainVM contentMainVM;

    public AppBarVM(Context context) {
        super(context);
        contentMainVM = new ContentMainVM(mContext);


    }
}
