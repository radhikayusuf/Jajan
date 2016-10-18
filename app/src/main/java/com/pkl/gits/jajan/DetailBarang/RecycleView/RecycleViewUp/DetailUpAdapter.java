package com.pkl.gits.jajan.DetailBarang.RecycleView.RecycleViewUp;

import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.pkl.gits.jajan.DetailBarang.RecycleView.Dao.RowDao;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.RowContentDetailBinding;

import java.util.List;

import id.gits.mvvmcore.adapter.GitsAdapter;
import id.gits.mvvmcore.viewmodel.GitsRowVM;

/**
 * Created by Varokah on 10/18/2016.
 */

public class DetailUpAdapter extends GitsAdapter<RowDao,DetailRowUpVM,RowContentDetailBinding>{
    public DetailUpAdapter(List<RowDao> collection) {
        super(collection);
    }

    @Override
    public DetailRowUpVM createViewModel(AppCompatActivity activity, RowContentDetailBinding binding, RowDao item, int position) {
        return new DetailRowUpVM(activity,binding,item);
    }

    @Override
    public int getLayoutRes() {
        return R.layout.row_content_detail;
    }

    @Override
    public void render(RowContentDetailBinding binding, DetailRowUpVM viewModel, RowDao item) {
        binding.setVm(viewModel);
    }

    @Override
    public void onRowClick(RowDao data, int position) {

    }
}
