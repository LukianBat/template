package com.education.android.geophysics.feature.calculate.data.datasource.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/data/datasource/db/DataCacheDataSource;", "", "addData", "Lio/reactivex/Completable;", "dataModel", "Lcom/education/android/geophysics/feature/calculate/domain/model/DataModel;", "getData", "Lio/reactivex/Single;", "app_debug"})
public abstract interface DataCacheDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.education.android.geophysics.feature.calculate.domain.model.DataModel> getData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Completable addData(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.domain.model.DataModel dataModel);
}