package com.adammcneilly.wom.models

data class Skill(
    val skillType: SkillType,
    val level: Int,
    val experience: Int?,
    val experienceToNext: Int?,
    val rank: Int?,
    val efficientHoursPlayed: Double?,
) {
    constructor(
        skillType: SkillType,
        level: Int,
    ) : this(
        skillType = skillType,
        level = level,
        experience = 0,
        experienceToNext = null,
        rank = null,
        efficientHoursPlayed = null,
    )
}
