package com.education.android.geophysics.сore.dagger.module.feature;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'\u00a8\u0006\u0004"}, d2 = {"Lcom/education/android/geophysics/\u0441ore/dagger/module/feature/PlacesListModule;", "", "PlacesListActivityInjector", "Lcom/education/android/geophysics/feature/calculate/presentation/CalculateActivity;", "app_debug"})
@dagger.Module(includes = {com.education.android.geophysics.feature.calculate.domain.usecases.dagger.DataUseCaseModule.class})
public abstract interface PlacesListModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.education.android.geophysics.feature.calculate.presentation.dagger.CalculateActivityModule.class})
    @com.education.android.geophysics.сore.dagger.scope.ActivityScope()
    public abstract com.education.android.geophysics.feature.calculate.presentation.CalculateActivity PlacesListActivityInjector();
}