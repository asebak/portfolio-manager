package com.atsebak.portfoliomanager.controllers;

import com.atsebak.portfoliomanager.domain.crypto.CoinData;
import com.atsebak.portfoliomanager.domain.crypto.CoinList;
import com.atsebak.portfoliomanager.integration.CoinApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/crypto")
public class CryptoController {

    private final CoinApi coinApi;

    @Autowired
    public CryptoController(CoinApi coinApi) {
        this.coinApi = coinApi;
    }

    @GetMapping("/coins")
    List<CoinList> all() {
        return coinApi.getCoinList();
    }

    @GetMapping("/coins/{coinId}")
    CoinData coinById(@PathVariable String coinId) {
        return coinApi.getCoinById(coinId, false, true, true, true, true, true);
    }

}
