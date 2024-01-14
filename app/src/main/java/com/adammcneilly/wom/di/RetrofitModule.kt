package com.adammcneilly.wom.di

import com.adammcneilly.wom.api.WiseOldManAPI
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    @Provides
    fun provideMoshi(): Moshi {
        return Moshi
            .Builder()
            .build()
    }

    @Provides
    fun provideHttpClient(): OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient
            .Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    @Provides
    fun provideWiseOldManAPI(
        moshi: Moshi,
        client: OkHttpClient,
    ): WiseOldManAPI {
        return Retrofit
            .Builder()
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .baseUrl(WiseOldManAPI.BASE_URL)
            .build()
            .create(WiseOldManAPI::class.java)
    }
}
