package com.education.android.geophysics.feature.calculate.domain.usecases.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/domain/usecases/dagger/DataUseCaseModule;", "", "bindGetDataUseCase", "Lcom/education/android/geophysics/feature/calculate/domain/usecases/GetDataUseCase;", "impl", "Lcom/education/android/geophysics/feature/calculate/domain/usecases/GetDataUseCaseImpl;", "app_debug"})
@dagger.Module(includes = {com.education.android.geophysics.feature.calculate.data.repository.dagger.DataRepositoryModule.class})
public abstract interface DataUseCaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCase bindGetDataUseCase(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.domain.usecases.GetDataUseCaseImpl impl);
}