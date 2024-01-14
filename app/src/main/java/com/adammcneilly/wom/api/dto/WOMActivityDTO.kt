package com.adammcneilly.wom.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Represents the [rank] and [score] for a user in some activity.
 *
 * @see[WOMActivitiesDTO]
 */
@JsonClass(generateAdapter = true)
data class WOMActivityDTO(
    @Json(name = "metric")
    val metric: String? = null,
    @Json(name = "rank")
    val rank: Int? = null,
    @Json(name = "score")
    val score: Int? = null,
)
