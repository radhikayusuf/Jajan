package com.pkl.gits.jajan.Main.Navigation.ViewModel;

import android.content.Context;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.widget.Toast;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Varokah on 10/17/2016.
 */

public class NavigationVM extends GitsVM{
    public ObservableField<String> title = new ObservableField<>();
    public ObservableBoolean isLogin = new ObservableBoolean();
    public String titled;
    public NavigationVM(Context context) {
        super(context);
        isLogin.set(false);
        title.set("Login / Register");
    }

    public void onClickLogin(Boolean bool){
        if(!bool){
            Toast.makeText(mContext,"is not login",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(mContext,"is login",Toast.LENGTH_SHORT).show();
        }
    }
}
