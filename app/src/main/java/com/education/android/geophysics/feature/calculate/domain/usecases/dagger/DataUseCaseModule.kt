package com.education.android.geophysics.feature.calculate.domain.usecases.dagger

import com.education.android.geophysics.feature.calculate.data.repository.dagger.DataRepositoryModule
import com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCase
import com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCaseImpl
import dagger.Binds
import dagger.Module

@Module(includes = [DataRepositoryModule::class])
interface DataUseCaseModule {

    @Binds
    fun bindGetDataUseCase(impl: GetDataUseCaseImpl): GetDataUseCase
}