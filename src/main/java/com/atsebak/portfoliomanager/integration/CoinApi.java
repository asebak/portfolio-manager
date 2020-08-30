package com.atsebak.portfoliomanager.integration;

import com.atsebak.portfoliomanager.domain.Coin;

import java.util.List;

public interface CoinApi {
    List<Coin> getAll();
}
