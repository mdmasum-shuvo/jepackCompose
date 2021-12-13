package com.appinionbd.jepackcompose.repository

import com.appinionbd.jepackcompose.model.remot.CoinApi
import com.appinionbd.jepackcompose.model.remot.CoinDetailDto
import com.appinionbd.jepackcompose.model.remot.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinApi) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}