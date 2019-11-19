package com.education.android.geophysics.feature.calculate.data.datasource.api.dagger

import com.education.android.geophysics.feature.calculate.data.datasource.api.DataApi
import com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource
import com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSourceImpl
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class DataApiModule {

    @Provides
    fun provideListApi(retrofit: Retrofit): DataApi = retrofit.create(
        DataApi::class.java
    )

    @Provides
    fun provideListApiDataSource(api: DataApi): DataApiDataSource =
        DataApiDataSourceImpl(api)
}