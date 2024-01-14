package com.adammcneilly.wom.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WOMSkillDTO(
    @Json(name = "ehp")
    val ehp: Double? = null,
    @Json(name = "experience")
    val experience: Int? = null,
    @Json(name = "level")
    val level: Int? = null,
    @Json(name = "metric")
    val metric: String? = null,
    @Json(name = "rank")
    val rank: Int? = null
)
