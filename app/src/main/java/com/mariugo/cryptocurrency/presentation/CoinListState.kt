package com.mariugo.cryptocurrency.presentation


import com.mariugo.cryptocurrency.domain.model.Coin


class CoinListState (
    val is_loading: Boolean = false,
    val coin: List<Coin>? = emptyList(),
    val error: String = "",
        )
