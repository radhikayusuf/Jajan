package com.pkl.gits.jajan.Main.ViewModel;

import android.content.Context;
import android.media.Rating;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.pkl.gits.jajan.Main.RecyclerViewSetting.BestSeller.BestSellerAdapter;
import com.pkl.gits.jajan.Main.RecyclerViewSetting.SecondRecyclerView.SecondAdapter;
import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.api.Response.Diskon;
import com.pkl.gits.jajan.api.Response.RatingReview;

import java.util.ArrayList;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by root on 17/10/16.
 */

public class ContentMainVM extends GitsVM {
    public BestSellerAdapter bestSellerAdapter;
    public SecondAdapter secondAdapter;
    public LinearLayoutManager linearLayoutManager;
    public GridLayoutManager gridLayoutManager;
    List<BarangResponse> barangResponses = new ArrayList<>();
    List<String> url = new ArrayList<>();
    List<String> warna = new ArrayList<>();
    List<Diskon> diskons = new ArrayList<>();
    List<RatingReview> ratings = new ArrayList<>();
    BarangResponse barangResponse;
    public ContentMainVM(Context context) {
        super(context);
        linearLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        gridLayoutManager = new GridLayoutManager(mContext, 2);
        bestSellerAdapter = new BestSellerAdapter(barangResponses);
        secondAdapter = new SecondAdapter(barangResponses);


        //dummy data//
        url.add("img");
        url.add("url");
        url.add("pic");
        warna.add("silver");
        diskons.add(new Diskon("30","1","2"));
        ratings.add(new RatingReview("4","Good","2"));
        barangResponses.add(new BarangResponse("Sendok","15000","30","4","","Sendok Terbaik Abad ini","Logam Murni 100 Gram",url, warna,"1","5",diskons,ratings));
        barangResponses.add(new BarangResponse("Sendok","15000","30","4","","Sendok Terbaik Abad ini","Logam Murni 100 Gram",url, warna,"1","5",diskons,ratings));
        barangResponses.add(new BarangResponse("Sendok","15000","30","4","","Sendok Terbaik Abad ini","Logam Murni 100 Gram",url, warna,"1","5",diskons,ratings));
        barangResponses.add(new BarangResponse("Sendok","15000","30","4","","Sendok Terbaik Abad ini","Logam Murni 100 Gram",url, warna,"1","5",diskons,ratings));
        //dummy data//

        secondAdapter.notifyDataSetChanged();
        bestSellerAdapter.notifyDataSetChanged();



    }
}
