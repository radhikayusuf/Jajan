package com.pkl.gits.jajan.Main.Fragment.ViewModel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.pkl.gits.jajan.Main.RecyclerViewSetting.BestSeller.BestSellerAdapter;
import com.pkl.gits.jajan.Main.RecyclerViewSetting.SecondRecyclerView.SecondAdapter;
import com.pkl.gits.jajan.api.Response.BarangResponse;
import com.pkl.gits.jajan.api.Response.Diskon;
import com.pkl.gits.jajan.api.Response.RatingReview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Varokah on 10/17/2016.
 */

public class HomeFragmentVM extends GitsVM{


    public BestSellerAdapter bestSellerAdapter;
    public SecondAdapter secondAdapter;
    public LinearLayoutManager linearLayoutManager;
    public GridLayoutManager gridLayoutManager;
    List<BarangResponse> barangResponses = new ArrayList<>();
    List<String> url = new ArrayList<>();
    List<String> warna = new ArrayList<>();
    List<Diskon> diskons = new ArrayList<>();
    List<RatingReview> ratings = new ArrayList<>();
    public HashMap<String, String> url_slide = new HashMap<>();
    private static Context ctx;

    public HomeFragmentVM(Context context) {
        super(context);
        ctx = context;
        linearLayoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        gridLayoutManager = new GridLayoutManager(mContext, 2);
        bestSellerAdapter = new BestSellerAdapter(barangResponses);
        secondAdapter = new SecondAdapter(barangResponses);


        //dummy data//
        url_slide.put("Teh Botol", "http://1.bp.blogspot.com/-j918TfttqlU/T7RjznZtgSI/AAAAAAAAAEM/sZo42DpmC3U/s640/Sosro.jpg");
        url_slide.put("Teh Botol Lagi", "http://1.bp.blogspot.com/-j918TfttqlU/T7RjznZtgSI/AAAAAAAAAEM/sZo42DpmC3U/s640/Sosro.jpg");
        url.add("img");
        url.add("url");
        url.add("pic");
        warna.add("silver");
        diskons.add(new Diskon("30", "1", "2"));
        ratings.add(new RatingReview("4", "Good", "2"));
        barangResponses.add(new BarangResponse("Sendok", "15000", "30", "4", "", "Sendok Terbaik Abad ini", "Logam Murni 100 Gram", url, warna, "1", "5", diskons, ratings));
        barangResponses.add(new BarangResponse("Sendok", "15000", "30", "4", "", "Sendok Terbaik Abad ini", "Logam Murni 100 Gram", url, warna, "1", "5", diskons, ratings));
        barangResponses.add(new BarangResponse("Sendok", "15000", "30", "4", "", "Sendok Terbaik Abad ini", "Logam Murni 100 Gram", url, warna, "1", "5", diskons, ratings));
        barangResponses.add(new BarangResponse("Sendok", "15000", "30", "4", "", "Sendok Terbaik Abad ini", "Logam Murni 100 Gram", url, warna, "1", "5", diskons, ratings));
        //dummy data//

        secondAdapter.notifyDataSetChanged();
        bestSellerAdapter.notifyDataSetChanged();
    }
    @BindingAdapter({"setBackground"})
    public static void setBackground(SliderLayout background, HashMap<String, String> url){

        for(String link : url.keySet()){
            TextSliderView textSliderView = new TextSliderView(ctx);

            textSliderView
                    .description(link)
                    .image(url.get(link))
                    .setScaleType(BaseSliderView.ScaleType.CenterCrop);

            background.addSlider(textSliderView);
        }
    }
}
