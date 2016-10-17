package com.pkl.gits.jajan.Main.ViewModel;

import android.content.Context;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 17/10/16.
 */

public class ContentMainVM extends GitsVM {
    public String Hello;
    public ContentMainVM(Context context) {
        super(context);
        Hello = "It's Working!";
    }
}
