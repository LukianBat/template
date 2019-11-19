package com.education.android.geophysics.feature.calculate.data.datasource.db

import com.education.android.geophysics.feature.calculate.domain.model.DataModel
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject

interface DataCacheDataSource {
    fun getData(): Single<DataModel>
    fun addData(dataModel: DataModel): Completable
}

class DataCacheDataSourceImpl @Inject constructor(private val dao: CacheDataDao) :
    DataCacheDataSource {

    override fun getData(): Single<DataModel> = dao.getDataById(1)

    override fun addData(dataModel: DataModel): Completable = dao.addData(dataModel)

}