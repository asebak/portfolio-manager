package com.atsebak.portfoliomanager.integration;

import com.atsebak.portfoliomanager.domain.Coin;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinGeckoApiImpl implements CoinApi {
    @Override
    public List<Coin> getAll() {
        return null;
    }
}
