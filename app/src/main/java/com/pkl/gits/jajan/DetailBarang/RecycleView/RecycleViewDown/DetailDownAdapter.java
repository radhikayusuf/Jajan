package com.pkl.gits.jajan.DetailBarang.RecycleView.RecycleViewDown;

import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.pkl.gits.jajan.DetailBarang.RecycleView.Dao.RowDao;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.RowContentDetailDownBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;
import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by Varokah on 10/18/2016.
 */

public class DetailDownAdapter extends GitsAdapter<RowDao,DetailRowDownVM,RowContentDetailDownBinding>{
    public DetailDownAdapter(List<RowDao> collection) {
        super(collection);
    }

    @Override
    public DetailRowDownVM createViewModel(AppCompatActivity activity, RowContentDetailDownBinding binding, RowDao item, int position) {
        return new DetailRowDownVM(activity,binding,item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_content_detail_down;
    }

    @Override
    public void render(RowContentDetailDownBinding binding, DetailRowDownVM viewModel, RowDao item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(RowDao data, int position) {

    }
}
