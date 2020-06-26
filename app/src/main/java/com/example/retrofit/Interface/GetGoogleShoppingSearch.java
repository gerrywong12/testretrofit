package com.example.retrofit.Interface;

import com.example.retrofit.Response.GoogleShopping;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetGoogleShoppingSearch {
    @GET("/search")
    Call<List<GoogleShopping>> getItem(@Query("language") String language,
                                       @Query("keywords") String keywords,
                                       @Query("country") String country,
                                       @Header("x-rapidapi-host") String hostheader,
                                       @Header("x-rapidapi-key") String keyheader);
}
