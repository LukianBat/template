package com.education.android.geophysics.feature.calculate.data.datasource.api

import com.education.android.geophysics.feature.calculate.domain.model.DataModel
import io.reactivex.Single
import javax.inject.Inject

interface DataApiDataSource {
    fun getData(): Single<DataModel>
}

class DataApiDataSourceImpl @Inject constructor(private val api: DataApi) :
    DataApiDataSource {
    override fun getData(): Single<DataModel> = api.getPlaces()

}