package com.androweed.muslimsimple.videokajian.home_recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ModelVideoKajian (
        var titleVideoKajian : String? = null,
        var channelVideoKajian : String? = null,
        var thumbnailVideoKajian : Int = 0
        ) : Parcelable