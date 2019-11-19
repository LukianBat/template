package com.education.android.geophysics.feature.calculate.data.datasource.db

import androidx.room.*
import com.education.android.geophysics.feature.calculate.domain.model.DataModel
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface CacheDataDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addData(dataModel: DataModel): Completable

    @Query("SELECT * FROM datamodel WHERE id = :id")
    fun getDataById(id: Long): Single<DataModel>

}
