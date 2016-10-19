package com.pkl.gits.jajan.DetailBarang.RecycleView.RecycleViewDown;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.databinding.ViewDataBinding;
import android.graphics.Color;
import android.os.Build;
import android.widget.TextView;

import com.pkl.gits.jajan.DetailBarang.RecycleView.Dao.RowDao;
import com.pkl.gits.jajan.Network.api.Response.BarangResponse;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.RowContentDetailDownBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by Varokah on 10/18/2016.
 */

public class DetailRowDownVM extends GitsRowVM<RowDao,RowContentDetailDownBinding> {

    public ObservableField<String> content = new ObservableField<>();
    public ObservableField<String> status = new ObservableField<>();
    private static Context ctx;
    public DetailRowDownVM(Context context, RowContentDetailDownBinding binding, RowDao data) {
        super(context, binding, data);
        content.set(data.getRowContent());
        status.set(data.getStatus());
        ctx = mContext;

    }
    @BindingAdapter({"rowStatus"})
    public static void onStatusChange(TextView textView, String state){
        if(state.equalsIgnoreCase("1")){
            textView.setTextColor(Color.WHITE);
            textView.setBackgroundColor(Color.parseColor("#283593"));
        }else {
            textView.setTextColor(Color.parseColor("#283593"));
            final int sdk = Build.VERSION.SDK_INT;
            if(sdk < Build.VERSION_CODES.JELLY_BEAN) {
                textView.setBackgroundDrawable( ctx.getResources().getDrawable(R.drawable.bg_content_border) );
            } else {
                textView.setBackground( ctx.getResources().getDrawable(R.drawable.bg_content_border));
            }
            //ctx.getDrawable(R.drawable.bg_content_border);
        }
    }
}
