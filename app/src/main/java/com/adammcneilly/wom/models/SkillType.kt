package com.adammcneilly.wom.models

enum class SkillType {
    ATTACK,
    HITPOINTS,
    MINING,
    STRENGTH,
    AGILITY,
    SMITHING,
    DEFENCE,
    HERBLORE,
    FISHING,
    RANGED,
    THIEVING,
    COOKING,
    PRAYER,
    CRAFTING,
    FIREMAKING,
    MAGIC,
    FLETCHING,
    WOODCUTTING,
    RUNECRAFTING,
    SLAYER,
    FARMING,
    CONSTRUCTION,
    HUNTER,
    ;

    fun toSkill(level: Int): Skill {
        return Skill(
            skillType = this,
            level = level,
        )
    }
}
