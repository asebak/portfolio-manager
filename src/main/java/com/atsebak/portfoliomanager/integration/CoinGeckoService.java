package com.atsebak.portfoliomanager.integration;

import com.atsebak.portfoliomanager.domain.crypto.CoinData;
import com.atsebak.portfoliomanager.domain.crypto.CoinList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface CoinGeckoService {
    @GET("coins/list")
    Call<List<CoinList>> getCoinList();

    @GET("coins/{id}")
    Call<CoinData> getCoinById(@Path("id") String id, @Query("localization") boolean localization, @Query("tickers") boolean tickers,
                               @Query("market_data") boolean marketData, @Query("community_data") boolean communityData,
                               @Query("developer_data") boolean developerData, @Query("sparkline") boolean sparkline);
}
