package com.adammcneilly.wom.models

data class Skill(
    val skillType: SkillType,
    val level: Int,
    val experience: Int,
    val experienceToNext: Int,
    val rank: Int,
    val efficientHoursPlayed: Double,
)
