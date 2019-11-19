package com.education.android.geophysics.сore.dagger.module.feature

import com.education.android.geophysics.feature.calculate.domain.usecases.dagger.DataUseCaseModule
import com.education.android.geophysics.feature.calculate.presentation.CalculateActivity
import com.education.android.geophysics.feature.calculate.presentation.dagger.CalculateActivityModule
import com.education.android.geophysics.сore.dagger.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [DataUseCaseModule::class])
interface PlacesListModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [CalculateActivityModule::class])
    fun PlacesListActivityInjector(): CalculateActivity

}