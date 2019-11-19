package com.education.android.geophysics.feature.calculate.data.repository

import com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource
import com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource
import com.education.android.geophysics.feature.calculate.domain.model.DataModel
import io.reactivex.Single
import javax.inject.Inject

interface DataRepository {
    fun getData(): Single<DataModel>
}

class DataRepositoryImpl @Inject constructor(
    private val cacheDataSource: DataCacheDataSource,
    private val apiDataSource: DataApiDataSource
) :
    DataRepository {

    override fun getData(): Single<DataModel> = apiDataSource.getData()

}