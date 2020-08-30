package com.atsebak.portfoliomanager.integration;

import com.atsebak.portfoliomanager.domain.crypto.CoinData;
import com.atsebak.portfoliomanager.domain.crypto.CoinList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinGeckoApiImpl implements CoinApi {

    private CoinGeckoApi coinGeckoApi;
    private  CoinGeckoService service;
    @Autowired
    public CoinGeckoApiImpl() {
        this.coinGeckoApi = new CoinGeckoApi();
        this.service = coinGeckoApi.createService(CoinGeckoService.class);
    }
    @Override
    public List<CoinList> getCoinList() {
        return coinGeckoApi.executeSync(service.getCoinList());
    }
    @Override
    public CoinData getCoinById(String id, boolean localization, boolean tickers, boolean marketData, boolean communityData, boolean developerData, boolean sparkline) {
        return coinGeckoApi.executeSync(service.getCoinById(id,localization,tickers,marketData,communityData,developerData,sparkline));
    }
}
