package com.adammcneilly.wom.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WOMSnapshotDTO(
    @Json(name = "createdAt")
    val createdAt: String? = null,
    @Json(name = "data")
    val `data`: WOMDataDTO? = null,
    @Json(name = "id")
    val id: Int? = null,
    @Json(name = "importedAt")
    val importedAt: String? = null,
    @Json(name = "playerId")
    val playerId: Int? = null,
)
