package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofit.Interface.GetGoogleShoppingSearch;
import com.example.retrofit.Response.GoogleShopping;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testSearch();
    }
    private void testSearch(){
        GetGoogleShoppingSearch retrofitInterface = RetrofitInstance.getRetrofitInstance().create(GetGoogleShoppingSearch.class);
        Call<List<GoogleShopping>> listCall = retrofitInterface.getItem("US", "laptop", "MY", "google-shopping.p.rapidapi.com", "e78433c235msh9dfc4488c52c5d4p1f766fjsna05e45f26b8c");
        listCall.enqueue(new Callback<List<GoogleShopping>>() {
            @Override
            public void onResponse(Call<List<GoogleShopping>> call, Response<List<GoogleShopping>> response) {
                System.out.println("PRINTTTT");
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<List<GoogleShopping>> call, Throwable t) {
                System.out.println("FAILED");
                System.out.println(call);
            }
        });
    }
}
