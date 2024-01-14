package com.adammcneilly.wom.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WOMEfficiencyDTO(
    @Json(name = "metric")
    val metric: String? = null,
    @Json(name = "rank")
    val rank: Int? = null,
    @Json(name = "value")
    val value: Double? = null,
)
