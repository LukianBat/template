package com.education.android.geophysics.feature.calculate.data.repository.dagger


import com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource
import com.education.android.geophysics.feature.calculate.data.datasource.api.dagger.DataApiModule
import com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource
import com.education.android.geophysics.feature.calculate.data.datasource.db.dagger.DataCacheModule
import com.education.android.geophysics.feature.calculate.data.repository.DataRepository
import com.education.android.geophysics.feature.calculate.data.repository.DataRepositoryImpl
import dagger.Module
import dagger.Provides

@Module(includes = [DataApiModule::class, DataCacheModule::class])
class DataRepositoryModule {

    @Provides
    fun provideDataRepository(
        apiDataSource: DataApiDataSource,
        cacheDataSource: DataCacheDataSource
    ): DataRepository =
        DataRepositoryImpl(cacheDataSource, apiDataSource)

}