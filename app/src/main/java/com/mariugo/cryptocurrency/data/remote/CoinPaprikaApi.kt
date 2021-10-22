package com.mariugo.cryptocurrency.data.remote

import com.mariugo.cryptocurrency.data.remote.dto.CoinDetailDto
import com.mariugo.cryptocurrency.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins() : List<CoinDto>

    @GET("v1/coin/{coinId}")
    suspend fun getCoinById(@Path("coinId")coinId : String) : CoinDetailDto
}