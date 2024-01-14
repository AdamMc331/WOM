package com.adammcneilly.wom.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WOMPlayerDTO(
    @Json(name = "archive")
    val archive: String? = null,
    @Json(name = "build")
    val build: String? = null,
    @Json(name = "combatLevel")
    val combatLevel: Int? = null,
    @Json(name = "country")
    val country: String? = null,
    @Json(name = "displayName")
    val displayName: String? = null,
    @Json(name = "ehb")
    val efficientHoursBossed: Double? = null,
    @Json(name = "ehp")
    val efficientHoursPlayed: Double? = null,
    @Json(name = "exp")
    val exp: Int? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "lastChangedAt")
    val lastChangedAt: String? = null,
    @Json(name = "lastImportedAt")
    val lastImportedAt: String? = null,
    @Json(name = "latestSnapshot")
    val latestSnapshot: WOMSnapshotDTO? = null,
    @Json(name = "patron")
    val patron: Boolean? = null,
    @Json(name = "registeredAt")
    val registeredAt: String? = null,
    @Json(name = "status")
    val status: String? = null,
    @Json(name = "tt200m")
    val tt200m: Double? = null,
    @Json(name = "ttm")
    val ttm: Double? = null,
    @Json(name = "type")
    val type: String? = null,
    @Json(name = "updatedAt")
    val updatedAt: String? = null,
    @Json(name = "username")
    val username: String? = null
)
