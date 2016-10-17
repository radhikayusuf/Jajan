package com.pkl.gits.jajan.Main.Fragment;


import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pkl.gits.jajan.Main.Fragment.ViewModel.HomeFragmentVM;
import com.pkl.gits.jajan.R;
import com.pkl.gits.jajan.databinding.FragmentHomeBinding;

import id.gits.mvvmcore.fragment.GitsFragment;
import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends GitsFragment<HomeFragmentVM, FragmentHomeBinding> {

    @Override
    public int getResLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public HomeFragmentVM getViewModel() {
        return new HomeFragmentVM(getActivity());
    }

    @Override
    public void bindViewModel(FragmentHomeBinding binding, HomeFragmentVM viewModel) {
        binding.setVm(viewModel);
    }
}
