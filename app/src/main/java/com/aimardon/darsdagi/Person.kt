package com.aimardon.darsdagi

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val ism:String,
    val familiya:String,
    val about:String
):Parcelable
