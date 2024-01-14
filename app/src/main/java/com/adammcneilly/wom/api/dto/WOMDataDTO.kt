package com.adammcneilly.wom.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WOMDataDTO(
    @Json(name = "activities")
    val activities: WOMActivitiesDTO? = null,
    @Json(name = "bosses")
    val bosses: WOMBossesDTO? = null,
    @Json(name = "computed")
    val computed: WOMComputedDTO? = null,
    @Json(name = "skills")
    val skills: WOMSkillsDTO? = null,
)
