package com.adammcneilly.wom.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Defines the users [rank] and [kills] for a particular boss [metric].
 *
 * @see[WOMBossesDTO]
 */
@JsonClass(generateAdapter = true)
data class WOMBossDTO(
    @Json(name = "ehb")
    val efficientHoursBossed: Double? = null,
    @Json(name = "kills")
    val kills: Int? = null,
    @Json(name = "metric")
    val metric: String? = null,
    @Json(name = "rank")
    val rank: Int? = null
)
