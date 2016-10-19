package com.pkl.gits.jajan.DetailBarang.ObserverDao;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by Varokah on 10/19/2016.
 */

public class DetailPengirimanObserverDao extends BaseObservable {
    private String DetailPengirimanKecamatan;
    private String DetailPengirimanKota;
    private String DetailPengirimanProvinsi;
    private String DetailPengirimanBiaya;
    private String DetailPengirimanWaktu;

    public DetailPengirimanObserverDao(String detailPengirimanKecamatan, String detailPengirimanKota, String detailPengirimanProvinsi, String detailPengirimanBiaya, String detailPengirimanWaktu) {
        DetailPengirimanKecamatan = detailPengirimanKecamatan;
        DetailPengirimanKota = detailPengirimanKota;
        DetailPengirimanProvinsi = detailPengirimanProvinsi;
        DetailPengirimanBiaya = detailPengirimanBiaya;
        DetailPengirimanWaktu = detailPengirimanWaktu;
    }

    @Bindable
    public String getDetailPengirimanKecamatan() {
        return DetailPengirimanKecamatan;
    }

    @Bindable
    public String getDetailPengirimanKota() {
        return DetailPengirimanKota;
    }

    @Bindable
    public String getDetailPengirimanProvinsi() {
        return DetailPengirimanProvinsi;
    }

    @Bindable
    public String getDetailPengirimanBiaya() {
        return DetailPengirimanBiaya;
    }

    @Bindable
    public String getDetailPengirimanWaktu() {
        return DetailPengirimanWaktu;
    }

    public void setDetailPengirimanKecamatan(String detailPengirimanKecamatan) {
        DetailPengirimanKecamatan = detailPengirimanKecamatan;
        notifyPropertyChanged(BR.detailPengirimanKecamatan);
    }

    public void setDetailPengirimanKota(String detailPengirimanKota) {
        DetailPengirimanKota = detailPengirimanKota;
        notifyPropertyChanged(BR.detailPengirimanKota);
    }

    public void setDetailPengirimanProvinsi(String detailPengirimanProvinsi) {
        DetailPengirimanProvinsi = detailPengirimanProvinsi;
        notifyPropertyChanged(BR.detailPengirimanProvinsi);
    }

    public void setDetailPengirimanBiaya(String detailPengirimanBiaya) {
        DetailPengirimanBiaya = detailPengirimanBiaya;
        notifyPropertyChanged(BR.detailPengirimanBiaya);
    }

    public void setDetailPengirimanWaktu(String detailPengirimanWaktu) {
        DetailPengirimanWaktu = detailPengirimanWaktu;
        notifyPropertyChanged(BR.detailPengirimanWaktu);
    }
}
