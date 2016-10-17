package com.pkl.gits.jajan.Main.ViewModel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.text.Layout;

import com.pkl.gits.jajan.R;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 17/10/16.
 */


public class AppBarVM extends GitsVM{
    public ContentMainVM contentMainVM;
    public String includeLayout = "pesanan saya";


    public AppBarVM(Context context) {
        super(context);
        contentMainVM = new ContentMainVM(mContext);
    }


}
