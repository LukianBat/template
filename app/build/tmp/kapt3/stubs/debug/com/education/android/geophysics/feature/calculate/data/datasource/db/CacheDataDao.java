package com.education.android.geophysics.feature.calculate.data.datasource.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/education/android/geophysics/feature/calculate/data/datasource/db/CacheDataDao;", "", "addData", "Lio/reactivex/Completable;", "dataModel", "Lcom/education/android/geophysics/feature/calculate/domain/model/DataModel;", "getDataById", "Lio/reactivex/Single;", "id", "", "app_debug"})
public abstract interface CacheDataDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable addData(@org.jetbrains.annotations.NotNull()
    com.education.android.geophysics.feature.calculate.domain.model.DataModel dataModel);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM datamodel WHERE id = :id")
    public abstract io.reactivex.Single<com.education.android.geophysics.feature.calculate.domain.model.DataModel> getDataById(long id);
}