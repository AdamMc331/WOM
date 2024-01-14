package com.adammcneilly.wom.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Computed information about a user's efficiency.
 */
@JsonClass(generateAdapter = true)
data class WOMComputedDTO(
    @Json(name = "ehb")
    val efficientHoursBossed: WOMEfficiencyDTO? = null,
    @Json(name = "ehp")
    val efficientHoursPlayed: WOMEfficiencyDTO? = null,
)
