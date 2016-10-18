package com.pkl.gits.jajan.Network.api.Response;

import java.util.List;

/**
 * Created by root on 18/10/16.
 */

public class SubCategory {
    String nama_sub_category;
    List<DetailCategory> categories;

    public SubCategory(String nama_sub_category, List<DetailCategory> categories) {
        this.nama_sub_category = nama_sub_category;
        this.categories = categories;
    }

    public String getNama_sub_category() {
        return nama_sub_category;
    }

    public void setNama_sub_category(String nama_sub_category) {
        this.nama_sub_category = nama_sub_category;
    }

    public List<DetailCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<DetailCategory> categories) {
        this.categories = categories;
    }
}
