package com.pkl.gits.jajan.DetailBarang.RecycleView.RecycleViewDown;

import android.content.Context;
import android.databinding.ViewDataBinding;

import com.pkl.gits.jajan.DetailBarang.RecycleView.Dao.RowDao;
import com.pkl.gits.jajan.Network.api.Response.BarangResponse;
import com.pkl.gits.jajan.databinding.RowContentDetailDownBinding;

import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by Varokah on 10/18/2016.
 */

public class DetailRowDownVM extends GitsRowVM<RowDao,RowContentDetailDownBinding> {
    public DetailRowDownVM(Context context, RowContentDetailDownBinding binding, RowDao data) {
        super(context, binding, data);
    }
}
