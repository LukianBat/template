package com.education.android.geophysics.feature.calculate.data.repository.dagger;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/data/repository/dagger/DataRepositoryModule;", "", "()V", "provideDataRepository", "Lcom/education/android/geophysics/feature/calculate/data/repository/DataRepository;", "apiDataSource", "Lcom/education/android/geophysics/feature/calculate/data/datasource/api/DataApiDataSource;", "cacheDataSource", "Lcom/education/android/geophysics/feature/calculate/data/datasource/db/DataCacheDataSource;", "app_debug"})
@dagger.Module(includes = {com.education.android.geophysics.feature.calculate.data.datasource.api.dagger.DataApiModule.class, com.education.android.geophysics.feature.calculate.data.datasource.db.dagger.DataCacheModule.class})
public final class DataRepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.education.android.geophysics.feature.calculate.data.repository.DataRepository provideDataRepository(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource apiDataSource, @org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource cacheDataSource) {
        return null;
    }
    
    public DataRepositoryModule() {
        super();
    }
}