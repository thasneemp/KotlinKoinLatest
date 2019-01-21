package org.koin.sampleapp.di

import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module.applicationContext
import org.koin.dsl.module.module
import org.koin.sampleapp.repository.WeatherDatasource
import org.koin.sampleapp.repository.local.AndroidJsonReader
import org.koin.sampleapp.repository.local.JsonReader
import org.koin.sampleapp.repository.local.LocalDataSource


val localAndroidDatasourceModule = module {
    single( definition = { AndroidJsonReader(androidApplication()) as JsonReader })
    single( definition = { LocalDataSource(get()) as WeatherDatasource })
}