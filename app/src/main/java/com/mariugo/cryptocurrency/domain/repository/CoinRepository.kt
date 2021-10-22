package com.mariugo.cryptocurrency.domain.repository

import com.mariugo.cryptocurrency.data.remote.dto.CoinDetailDto
import com.mariugo.cryptocurrency.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}