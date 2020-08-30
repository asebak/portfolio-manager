package com.atsebak.portfoliomanager.integration;

import com.atsebak.portfoliomanager.domain.crypto.CoinData;
import com.atsebak.portfoliomanager.domain.crypto.CoinList;

import java.util.List;

public interface CoinApi {
    List<CoinList> getCoinList();
    CoinData getCoinById(String id, boolean localization, boolean tickers, boolean marketData, boolean communityData, boolean developerData, boolean sparkline);

}
