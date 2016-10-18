package com.pkl.gits.jajan.Network.api.Response;

import java.io.Serializable;

/**
 * Created by root on 18/10/16.
 */

public class DetailCategory implements Serializable{
    String nama_detail_category;

    public DetailCategory(String nama_detail_category) {
        this.nama_detail_category = nama_detail_category;
    }

    public String getNama_detail_category() {
        return nama_detail_category;
    }

    public void setNama_detail_category(String nama_detail_category) {
        this.nama_detail_category = nama_detail_category;
    }
}
