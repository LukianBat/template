package com.education.android.geophysics.сore.dagger

import android.content.Context
import com.education.android.geophysics.сore.App
import com.education.android.geophysics.сore.dagger.module.ApplicationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>() {

        @BindsInstance
        abstract fun context(context: Context): Builder
    }
}
