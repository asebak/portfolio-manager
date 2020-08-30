package com.atsebak.portfoliomanager.integration;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import java.io.IOException;
import java.util.Optional;

public class CoinGeckoApi {
    private final String API_BASE_URL = "https://api.coingecko.com/api/v3/";

    private final Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(API_BASE_URL)
            .addConverterFactory(JacksonConverterFactory.create());

    private final Retrofit retrofit = builder.build();

    public <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

    @SneakyThrows
    public <T> T executeSync(Call<T> call) {
        Response<T> response = null;
        try {
            response = call.execute();
            if (response.isSuccessful()) {
                return response.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
