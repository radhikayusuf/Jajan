package com.pkl.gits.jajan.Main.Navigation.ViewModel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Varokah on 10/17/2016.
 */

public class NavigationVM extends GitsVM{
    public static ObservableField<String> title = new ObservableField<>();
    public static ObservableBoolean isLogin = new ObservableBoolean();
    public LinearLayout.OnClickListener layoutClick;

    public NavigationVM(Context context) {
        super(context);
        isLogin.set(false);
        title.set("Login / Register");

        layoutClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isLogin.get()){
                    isLogin.set(false);
                }else {
                    isLogin.set(true);
                }
            }
        };
    }

    public void onClickLogin(Boolean bool){
        if(!bool){
            Toast.makeText(mContext,"is not login",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(mContext,"is login",Toast.LENGTH_SHORT).show();
        }
    }
    @BindingAdapter({"onchange"})
    public static void onchange(TextView textView, Boolean bool){
        if(bool){
            title.set("HAS LOGIN");
        }else {
            title.set("Login / Register");
        }
        textView.setText(title.get());
    }
}
