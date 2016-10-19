package com.pkl.gits.jajan.DetailBarang.ObserverDao;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by Varokah on 10/19/2016.
 */

public class DetailContentObserverDao extends BaseObservable {
    private String DetailBarangNama;
    private String DetailBarangRating;
    private String DetailBarangTotalRating;
    private String DetailBarangTotalHarga;
    private String DetailBarangDiscHarga;
    private String DetailBarangDiscount;
    private String DetailCategoryUp;
    private String DetailCategoryDown;
    private String DetailBarangStok;
    private String DetailBarangJumlah;
    private String DetailBarangCicilan;

    public DetailContentObserverDao(String detailBarangNama, String detailBarangRating, String detailBarangTotalRating, String detailBarangTotalHarga, String detailBarangDiscHarga, String detailBarangDiscount, String detailCategoryUp, String detailCategoryDown, String detailBarangStok, String detailBarangJumlah, String detailBarangCicilan) {
        DetailBarangNama = detailBarangNama;
        DetailBarangRating = detailBarangRating;
        DetailBarangTotalRating = detailBarangTotalRating;
        DetailBarangTotalHarga = detailBarangTotalHarga;
        DetailBarangDiscHarga = detailBarangDiscHarga;
        DetailBarangDiscount = detailBarangDiscount;
        DetailCategoryUp = detailCategoryUp;
        DetailCategoryDown = detailCategoryDown;
        DetailBarangStok = detailBarangStok;
        DetailBarangJumlah = detailBarangJumlah;
        DetailBarangCicilan = detailBarangCicilan;
    }

    @Bindable
    public String getDetailBarangNama() {
        return DetailBarangNama;
    }

    @Bindable
    public String getDetailBarangRating() {
        return DetailBarangRating;
    }

    @Bindable
    public String getDetailBarangTotalRating() {
        return DetailBarangTotalRating;
    }

    @Bindable
    public String getDetailBarangTotalHarga() {
        return DetailBarangTotalHarga;
    }

    @Bindable
    public String getDetailBarangDiscHarga() {
        return DetailBarangDiscHarga;
    }

    @Bindable
    public String getDetailBarangDiscount() {
        return DetailBarangDiscount;
    }

    @Bindable
    public String getDetailCategoryUp() {
        return DetailCategoryUp;
    }

    @Bindable
    public String getDetailCategoryDown() {
        return DetailCategoryDown;
    }

    @Bindable
    public String getDetailBarangStok() {
        return DetailBarangStok;
    }

    @Bindable
    public String getDetailBarangJumlah() {
        return DetailBarangJumlah;
    }

    @Bindable
    public String getDetailBarangCicilan() {
        return DetailBarangCicilan;
    }



    public void setDetailBarangNama(String detailBarangNama) {
        DetailBarangNama = detailBarangNama;
        notifyPropertyChanged(BR.detailBarangNama);
    }

    public void setDetailBarangRating(String detailBarangRating) {
        DetailBarangRating = detailBarangRating;
        notifyPropertyChanged(BR.detailBarangRating);
    }

    public void setDetailBarangTotalRating(String detailBarangTotalRating) {
        DetailBarangTotalRating = detailBarangTotalRating;
        notifyPropertyChanged(BR.detailBarangTotalRating);
    }

    public void setDetailBarangTotalHarga(String detailBarangTotalHarga) {
        DetailBarangTotalHarga = detailBarangTotalHarga;
        notifyPropertyChanged(BR.detailBarangTotalHarga);
    }

    public void setDetailBarangDiscHarga(String detailBarangDiscHarga) {
        DetailBarangDiscHarga = detailBarangDiscHarga;
        notifyPropertyChanged(BR.detailBarangDiscHarga);
    }

    public void setDetailBarangDiscount(String detailBarangDiscount) {
        DetailBarangDiscount = detailBarangDiscount;
        notifyPropertyChanged(BR.detailBarangDiscount);
    }

    public void setDetailCategoryUp(String detailCategoryUp) {
        DetailCategoryUp = detailCategoryUp;
        notifyPropertyChanged(BR.detailCategoryUp);
    }

    public void setDetailCategoryDown(String detailCategoryDown) {
        DetailCategoryDown = detailCategoryDown;
        notifyPropertyChanged(BR.detailCategoryDown);
    }

    public void setDetailBarangStok(String detailBarangStok) {
        DetailBarangStok = detailBarangStok;
        notifyPropertyChanged(BR.detailBarangStok);
    }

    public void setDetailBarangJumlah(String detailBarangJumlah) {
        DetailBarangJumlah = detailBarangJumlah;
        notifyPropertyChanged(BR.detailBarangJumlah);
    }

    public void setDetailBarangCicilan(String detailBarangCicilan) {
        DetailBarangCicilan = detailBarangCicilan;
        notifyPropertyChanged(BR.detailBarangCicilan);
    }
}
