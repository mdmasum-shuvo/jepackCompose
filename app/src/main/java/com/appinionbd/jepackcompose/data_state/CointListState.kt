package com.appinionbd.jepackcompose.data_state

import com.appinionbd.jepackcompose.model.domain.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)