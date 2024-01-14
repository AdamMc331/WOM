package com.adammcneilly.wom.api

import com.adammcneilly.wom.api.dto.WOMPlayerDTO
import com.squareup.moshi.Moshi
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path


interface WiseOldManAPI {

    @GET("v2/players/{username}")
    suspend fun getPlayer(
        @Path("username") username: String,
    ): WOMPlayerDTO

    companion object {

        const val BASE_URL = "https://api.wiseoldman.net/"
    }
}
