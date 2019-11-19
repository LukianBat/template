package com.education.android.geophysics.feature.calculate.data.datasource.db.dagger

import com.education.android.geophysics.feature.calculate.data.datasource.db.CacheDataDao
import com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource
import com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSourceImpl
import com.education.android.geophysics.сore.data.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class DataCacheModule {

    @Provides
    fun provideCachePlacesDao(appDatabase: AppDatabase): CacheDataDao =
        appDatabase.cashDataDao()

    @Provides
    fun provideCacheDataSource(dao: CacheDataDao): DataCacheDataSource =
        DataCacheDataSourceImpl(dao)
}