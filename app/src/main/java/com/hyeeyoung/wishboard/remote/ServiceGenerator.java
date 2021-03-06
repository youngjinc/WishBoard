package com.hyeeyoung.wishboard.remote;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public interface ServiceGenerator {
    /**
     * @brief : 원격 호출을 정의한 인터페이스 메소드를 호출할 수 있는 서비스 생성
     */
    public static <S> S createService(Class<S> serviceClass){

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .build();

        // @brief : 여기서 레트로핏의 핵심 생성
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(IRemoteService.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(serviceClass);
    }
}
