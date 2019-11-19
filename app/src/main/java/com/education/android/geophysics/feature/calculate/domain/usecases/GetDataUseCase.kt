package com.education.android.geophysics.feature.calculate.domain.usecases

import com.education.android.geophysics.feature.calculate.data.repository.DataRepository
import com.education.android.geophysics.feature.calculate.domain.model.DataModel
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

interface GetDataUseCase {
    fun getData(): Single<DataModel>
}

class GetDataUseCaseImpl @Inject constructor(private val repository: DataRepository) :
    GetDataUseCase {

    override fun getData(): Single<DataModel> =
        repository.getData()
            .subscribeOn(AndroidSchedulers.mainThread())

}