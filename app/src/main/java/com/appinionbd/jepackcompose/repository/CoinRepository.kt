package com.appinionbd.jepackcompose.repository

import com.appinionbd.jepackcompose.model.remot.CoinDetailDto
import com.appinionbd.jepackcompose.model.remot.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}