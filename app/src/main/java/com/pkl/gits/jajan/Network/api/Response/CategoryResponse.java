package com.pkl.gits.jajan.Network.api.Response;

import java.util.List;

/**
 * Created by root on 18/10/16.
 */

public class CategoryResponse {
    String nama_category;
    List<SubCategory> subCategory;

    public CategoryResponse(String nama_category, List<SubCategory> subCategory) {
        this.nama_category = nama_category;
        this.subCategory = subCategory;
    }

    public String getNama_category() {
        return nama_category;
    }

    public void setNama_category(String nama_category) {
        this.nama_category = nama_category;
    }

    public List<SubCategory> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<SubCategory> subCategory) {
        this.subCategory = subCategory;
    }
}
