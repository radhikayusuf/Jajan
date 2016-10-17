package com.pkl.gits.jajan;

import com.pkl.gits.jajan.Response.BarangResponse;

import retrofit2.http.GET;
import rx.Observable;

interface ApiInterface {
    @GET("exampleLink")
    Observable<BarangResponse> responBarang();
}
