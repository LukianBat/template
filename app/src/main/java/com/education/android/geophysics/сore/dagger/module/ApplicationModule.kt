package com.education.android.geophysics.сore.dagger.module

import com.education.android.geophysics.сore.dagger.module.feature.PlacesListModule
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        RetrofitModule::class,
        PreferenceModule::class,
        RoomModule::class,
        PlacesListModule::class]
)
interface ApplicationModule