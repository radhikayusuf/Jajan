package com.pkl.gits.jajan.DetailBarang.ViewModel;

import android.content.Context;
import android.databinding.BindingAdapter;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Varokah on 10/18/2016.
 */

public class DetailVM extends GitsVM {
    public static Context ctx;
    public HashMap<String,String> url_img = new HashMap<>();

    public DetailVM(Context context) {
        super(context);
        ctx = context;

        //dummy data
        url_img.put("teh","http://1.bp.blogspot.com/-j918TfttqlU/T7RjznZtgSI/AAAAAAAAAEM/sZo42DpmC3U/s640/Sosro.jpg");
        url_img.put("teh lagi","http://1.bp.blogspot.com/-j918TfttqlU/T7RjznZtgSI/AAAAAAAAAEM/sZo42DpmC3U/s640/Sosro.jpg");
        url_img.put("teh lagi lagi","http://1.bp.blogspot.com/-j918TfttqlU/T7RjznZtgSI/AAAAAAAAAEM/sZo42DpmC3U/s640/Sosro.jpg");
    }

    @BindingAdapter({"setBackground"})
    public static void setBackground(SliderLayout background, HashMap<String, String> url) {

        for (String link : url.keySet()) {
            TextSliderView textSliderView = new TextSliderView(ctx);

            textSliderView
                    .description(link)
                    .image(url.get(link))
                    .setScaleType(BaseSliderView.ScaleType.CenterCrop);

            background.addSlider(textSliderView);
        }
    }
}