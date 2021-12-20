package com.appinionbd.jepackcompose.di

import com.appinionbd.jepackcompose.common.Constant
import com.appinionbd.jepackcompose.model.remot.CoinApi
import com.appinionbd.jepackcompose.repository.CoinRepository
import com.appinionbd.jepackcompose.repository.CoinRepositoryImpl
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
    fun provideCoinApi(): CoinApi {
        return Retrofit.Builder()
            .baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api:CoinApi) :CoinRepository {
        return CoinRepositoryImpl(api)
    }
}