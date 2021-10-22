package com.mariugo.cryptocurrency.domain.use_case.get_coins

import com.mariugo.cryptocurrency.common.Resource
import com.mariugo.cryptocurrency.data.remote.dto.toCoin
import com.mariugo.cryptocurrency.data.remote.dto.toCoinDetail
import com.mariugo.cryptocurrency.domain.model.Coin
import com.mariugo.cryptocurrency.domain.model.CoinDetail
import com.mariugo.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success(coin))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(e.localizedMessage ?: "Check your internet connection"))
        }
    }
}