package com.pkl.gits.jajan.DetailBarang.ViewModel;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.pkl.gits.jajan.DetailBarang.ObserverDao.DetailContentObserverDao;
import com.pkl.gits.jajan.DetailBarang.ObserverDao.DetailPengirimanObserverDao;
import com.pkl.gits.jajan.DetailBarang.ObserverDao.DetailTokoObserverDao;
import com.pkl.gits.jajan.DetailBarang.RecycleView.Dao.RowDao;
import com.pkl.gits.jajan.DetailBarang.RecycleView.RecycleViewDown.DetailDownAdapter;
import com.pkl.gits.jajan.DetailBarang.RecycleView.RecycleViewUp.DetailUpAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by Varokah on 10/18/2016.
 */

public class DetailVM extends GitsVM {
    public HashMap<String, String> url_img = new HashMap<>();
    private static Context ctx;
    public DetailDownAdapter detailDownAdapter;
    public DetailUpAdapter detailUpAdapter;
    public LinearLayoutManager layoutManager;
    public LinearLayoutManager layoutManagerDown;
    public DetailContentObserverDao detailContentObserverDao = new DetailContentObserverDao("","","","","","","","","","","");
    public DetailPengirimanObserverDao detailPengirimanObserverDao = new DetailPengirimanObserverDao("","","","","");
    public DetailTokoObserverDao detailTokoObserverDao = new DetailTokoObserverDao("","","","");


    public List<RowDao> dataup = new ArrayList<>();
    public List<RowDao> datadown = new ArrayList<>();

    public DetailVM(Context context) {
        super(context);
        ctx = context;

        layoutManager = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        layoutManagerDown = new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false);
        detailUpAdapter = new DetailUpAdapter(dataup);
        detailDownAdapter = new DetailDownAdapter(datadown);

        //dummy data//
        url_img.put("Teh Botol", "http://1.bp.blogspot.com/-j918TfttqlU/T7RjznZtgSI/AAAAAAAAAEM/sZo42DpmC3U/s640/Sosro.jpg");
        url_img.put("Teh Botol Lagi", "http://1.bp.blogspot.com/-j918TfttqlU/T7RjznZtgSI/AAAAAAAAAEM/sZo42DpmC3U/s640/Sosro.jpg");
        dataup.add(new RowDao("Merah","1"));
        dataup.add(new RowDao("Kuning","0"));
        dataup.add(new RowDao("Hijau","0"));

        datadown.add(new RowDao("L","0"));
        datadown.add(new RowDao("M","0"));
        datadown.add(new RowDao("XL","0"));
        datadown.add(new RowDao("S","0"));


        detailContentObserverDao.setDetailBarangNama("AQUDES");
        detailContentObserverDao.setDetailBarangJumlah("1");
        detailContentObserverDao.setDetailBarangCicilan("");
        detailContentObserverDao.setDetailBarangDiscHarga("100.000.000");
        detailContentObserverDao.setDetailBarangRating("4");
        detailContentObserverDao.setDetailBarangStok("90");
        detailContentObserverDao.setDetailBarangTotalHarga("110.000.000");
        detailContentObserverDao.setDetailBarangTotalRating("200");
        detailContentObserverDao.setDetailCategoryDown("");
        detailContentObserverDao.setDetailCategoryUp("");
        detailContentObserverDao.setDetailBarangDiscount("0");

        detailPengirimanObserverDao.setDetailPengirimanKecamatan("paparapat");
        detailPengirimanObserverDao.setDetailPengirimanKota("BalikBatu");
        detailPengirimanObserverDao.setDetailPengirimanProvinsi("Kalimantan Utara");
        detailPengirimanObserverDao.setDetailPengirimanBiaya("0");
        detailPengirimanObserverDao.setDetailPengirimanWaktu("90");

        detailTokoObserverDao.setDetailTokoNama("Anti-Mainstream");
        detailTokoObserverDao.setDetailTokoKota("Kota Baru");
        detailTokoObserverDao.setDetailTokoLastLogin("1920");
        detailTokoObserverDao.setDetailTokoRating("1");

        detailDownAdapter.notifyDataSetChanged();
        detailUpAdapter.notifyDataSetChanged();
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

    public void onClickPlus(){
        int before = Integer.parseInt(detailContentObserverDao.getDetailBarangJumlah());
        before++;
        String after = String.valueOf(before);
        detailContentObserverDao.setDetailBarangJumlah(after);
    }

    public void onClickMins(){
        int before = Integer.parseInt(detailContentObserverDao.getDetailBarangJumlah());
        String after;
        if(before > 1){
            before--;
            after = String.valueOf(before);
        }else{
            after = String.valueOf(1);
        }
        detailContentObserverDao.setDetailBarangJumlah(after);
    }
}
