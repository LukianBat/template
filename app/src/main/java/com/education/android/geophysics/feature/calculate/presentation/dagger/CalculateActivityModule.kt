package com.education.android.geophysics.feature.calculate.presentation.dagger

import androidx.lifecycle.ViewModelProvider
import com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCase
import com.education.android.geophysics.feature.calculate.presentation.CalculateActivity
import com.education.android.geophysics.feature.calculate.presentation.CalculateViewModel
import com.education.android.geophysics.сore.presentation.viewmodel.ViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class CalculateActivityModule {

    @Provides
    fun provideViewModel(
        context: CalculateActivity,
        getDataUseCase: GetDataUseCase
    ): CalculateViewModel = ViewModelFactory {
        CalculateViewModel(
            getDataUseCase
        )
    }.let { viewModelFactory ->
        ViewModelProvider(context, viewModelFactory)[CalculateViewModel::class.java]
    }
}