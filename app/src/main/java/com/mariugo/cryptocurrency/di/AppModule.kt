package com.mariugo.cryptocurrency.di

import com.mariugo.cryptocurrency.common.Constants
import com.mariugo.cryptocurrency.data.remote.CoinPaprikaApi
import com.mariugo.cryptocurrency.data.repository.CoinRepositoryImpl
import com.mariugo.cryptocurrency.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(CoinPaprikaApi :: class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: CoinPaprikaApi): CoinRepository{
        return CoinRepositoryImpl(api)
    }
}