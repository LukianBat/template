package com.education.android.geophysics.feature.calculate.domain.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize


@Entity
@Parcelize
class DataModel : Parcelable {
    @PrimaryKey
    var id: Long = 1
}