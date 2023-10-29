package com.example.hiltmoshikapt

import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface AppModule {

    companion object {

        @Provides
        fun provideMoshi(): Moshi = Moshi.Builder().build()
    }
}