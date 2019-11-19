package com.education.android.geophysics.feature.calculate.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/data/repository/DataRepositoryImpl;", "Lcom/education/android/geophysics/feature/calculate/data/repository/DataRepository;", "cacheDataSource", "Lcom/education/android/geophysics/feature/calculate/data/datasource/db/DataCacheDataSource;", "apiDataSource", "Lcom/education/android/geophysics/feature/calculate/data/datasource/api/DataApiDataSource;", "(Lcom/education/android/geophysics/feature/calculate/data/datasource/db/DataCacheDataSource;Lcom/education/android/geophysics/feature/calculate/data/datasource/api/DataApiDataSource;)V", "getData", "Lio/reactivex/Single;", "Lcom/education/android/geophysics/feature/calculate/domain/model/DataModel;", "app_debug"})
public final class DataRepositoryImpl implements com.education.android.geophysics.feature.calculate.data.repository.DataRepository {
    private final com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource cacheDataSource = null;
    private final com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource apiDataSource = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.education.android.geophysics.feature.calculate.domain.model.DataModel> getData() {
        return null;
    }
    
    @javax.inject.Inject()
    public DataRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource cacheDataSource, @org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.data.datasource.api.DataApiDataSource apiDataSource) {
        super();
    }
}