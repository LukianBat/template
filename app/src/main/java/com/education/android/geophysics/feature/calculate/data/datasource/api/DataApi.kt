package com.education.android.geophysics.feature.calculate.data.datasource.api

import com.education.android.geophysics.feature.calculate.domain.model.DataModel
import io.reactivex.Single
import retrofit2.http.GET

interface DataApi {

    @GET("/example")
    fun getPlaces(): Single<DataModel>

}