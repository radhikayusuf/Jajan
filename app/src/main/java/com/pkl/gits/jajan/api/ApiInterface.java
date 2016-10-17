package com.pkl.gits.jajan.api;

import com.pkl.gits.jajan.api.Response.BarangResponse;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by Varokah on 10/17/2016.
 */

public interface ApiInterface {
        @GET("exampleLink")
        Observable<BarangResponse> responBarang();
}
