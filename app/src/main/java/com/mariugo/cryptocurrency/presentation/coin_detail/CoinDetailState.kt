package com.mariugo.cryptocurrency.presentation.coin_detail

import com.mariugo.cryptocurrency.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = "",

    )
