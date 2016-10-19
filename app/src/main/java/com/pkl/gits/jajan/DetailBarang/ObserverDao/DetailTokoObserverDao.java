package com.pkl.gits.jajan.DetailBarang.ObserverDao;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by Varokah on 10/19/2016.
 */

public class DetailTokoObserverDao extends BaseObservable{
    private String DetailTokoNama;
    private String DetailTokoRating;
    private String DetailTokoLastLogin;
    private String DetailTokoKota;

    public DetailTokoObserverDao(String detailTokoNama, String detailTokoRating, String detailTokoLastLogin, String detailTokoKota) {
        DetailTokoNama = detailTokoNama;
        DetailTokoRating = detailTokoRating;
        DetailTokoLastLogin = detailTokoLastLogin;
        DetailTokoKota = detailTokoKota;
    }

    @Bindable
    public String getDetailTokoNama() {
        return DetailTokoNama;
    }

    @Bindable
    public String getDetailTokoRating() {
        return DetailTokoRating;
    }

    @Bindable
    public String getDetailTokoLastLogin() {
        return DetailTokoLastLogin;
    }

    @Bindable
    public String getDetailTokoKota() {
        return DetailTokoKota;
    }

    public void setDetailTokoNama(String detailTokoNama) {
        DetailTokoNama = detailTokoNama;
        notifyPropertyChanged(BR.detailTokoNama);
    }

    public void setDetailTokoRating(String detailTokoRating) {
        DetailTokoRating = detailTokoRating;
        notifyPropertyChanged(BR.detailTokoRating);
    }

    public void setDetailTokoLastLogin(String detailTokoLastLogin) {
        DetailTokoLastLogin = detailTokoLastLogin;
        notifyPropertyChanged(BR.detailTokoLastLogin);
    }

    public void setDetailTokoKota(String detailTokoKota) {
        DetailTokoKota = detailTokoKota;
        notifyPropertyChanged(BR.detailTokoKota);
    }
}
