package com.education.android.geophysics.сore.dagger.module

import android.content.Context
import androidx.room.Room
import com.education.android.geophysics.сore.data.AppDatabase
import dagger.Module
import dagger.Provides

@Module
class RoomModule {

    @Provides
    fun provideAppDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, "database").build()
    }
}