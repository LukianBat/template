package com.education.android.geophysics.сore.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.education.android.geophysics.feature.calculate.data.datasource.db.CacheDataDao
import com.education.android.geophysics.feature.calculate.domain.model.DataModel

@Database(entities = [DataModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cashDataDao(): CacheDataDao

}