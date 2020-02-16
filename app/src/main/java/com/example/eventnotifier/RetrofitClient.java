package com.example.eventnotifier;

import com.example.eventnotifier.ui.Register;

import java.nio.file.ReadOnlyFileSystemException;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitClient {

    private static Register apiService;

    public RetrofitClient(String baseUrl) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(Register.class);
    }

    public Register getServies(){
        return apiService;
    }
}
