package com.dumper.android.dumper.process

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ProcessData(val processName: String, val appName: String): Parcelable {
    fun getDisplayName() = if (processName.contains(":")) "$appName (${processName.substringAfter(":")})" else appName
}