package com.atsebak.portfoliomanager.services;

import com.atsebak.portfoliomanager.domain.Coin;
import com.atsebak.portfoliomanager.integration.CoinApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CryptoController {

    private final CoinApi coinApi;

    @Autowired
    public CryptoController(CoinApi coinApi) {
        this.coinApi = coinApi;
    }

    @GetMapping("/coins")
    List<Coin> all() {
        return coinApi.getAll();
    }

}
