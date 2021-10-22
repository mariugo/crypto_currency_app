package com.mariugo.cryptocurrency.presentation.coin_list

import com.mariugo.cryptocurrency.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = "",

    )
