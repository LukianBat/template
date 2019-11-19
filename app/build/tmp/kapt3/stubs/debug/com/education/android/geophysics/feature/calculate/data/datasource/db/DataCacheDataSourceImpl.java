package com.education.android.geophysics.feature.calculate.data.datasource.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/data/datasource/db/DataCacheDataSourceImpl;", "Lcom/education/android/geophysics/feature/calculate/data/datasource/db/DataCacheDataSource;", "dao", "Lcom/education/android/geophysics/feature/calculate/data/datasource/db/CacheDataDao;", "(Lcom/education/android/geophysics/feature/calculate/data/datasource/db/CacheDataDao;)V", "addData", "Lio/reactivex/Completable;", "dataModel", "Lcom/education/android/geophysics/feature/calculate/domain/model/DataModel;", "getData", "Lio/reactivex/Single;", "app_debug"})
public final class DataCacheDataSourceImpl implements com.education.android.geophysics.feature.calculate.data.datasource.db.DataCacheDataSource {
    private final com.education.android.geophysics.feature.calculate.data.datasource.db.CacheDataDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.education.android.geophysics.feature.calculate.domain.model.DataModel> getData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Completable addData(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.domain.model.DataModel dataModel) {
        return null;
    }
    
    @javax.inject.Inject()
    public DataCacheDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.data.datasource.db.CacheDataDao dao) {
        super();
    }
}