package com.adammcneilly.wom.debug

import com.adammcneilly.wom.models.Skill
import com.adammcneilly.wom.models.SkillType

fun debugSkillList(): List<Skill> {
    return SkillType.entries.map(SkillType::debugSkill)
}

/**
 * Returns a [Skill] instance for a given [SkillType]. Random numbers match Adam's snapshot
 * at the time of setting up this debug instance.
 */
fun SkillType.debugSkill(): Skill {
    val level = when (this) {
        SkillType.ATTACK -> 83
        SkillType.HITPOINTS -> 85
        SkillType.MINING -> 99
        SkillType.STRENGTH -> 85
        SkillType.AGILITY -> 76
        SkillType.SMITHING -> 90
        SkillType.DEFENCE -> 80
        SkillType.HERBLORE -> 75
        SkillType.FISHING -> 99
        SkillType.RANGED -> 82
        SkillType.THIEVING -> 63
        SkillType.COOKING -> 99
        SkillType.PRAYER -> 70
        SkillType.CRAFTING -> 83
        SkillType.FIREMAKING -> 99
        SkillType.MAGIC -> 83
        SkillType.FLETCHING -> 78
        SkillType.WOODCUTTING -> 77
        SkillType.RUNECRAFTING -> 73
        SkillType.SLAYER -> 79
        SkillType.FARMING -> 88
        SkillType.CONSTRUCTION -> 72
        SkillType.HUNTER -> 72
    }

    return this.toSkill(level)
}
