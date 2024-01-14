package com.adammcneilly.wom.ui.displaymodels

import com.adammcneilly.wom.R
import com.adammcneilly.wom.models.Skill
import com.adammcneilly.wom.models.SkillType

data class SkillDisplayModel(
    val iconRes: Int,
    val level: String,
    val experience: String,
    val experienceToNext: String?,
    val rank: String,
    val efficientHoursPlayed: String,
    val skillName: String,
)

fun Skill.toDisplayModel(): SkillDisplayModel {
    return SkillDisplayModel(
        iconRes = this.skillType.getIconRes(),
        level = this.level.toString(),
        experience = this.experience.toString(),
        experienceToNext = this.experienceToNext?.toString(),
        rank = this.rank.toString(),
        efficientHoursPlayed = this.efficientHoursPlayed.toString(),
        skillName = this.skillType.getName(),
    )
}

private fun SkillType.getIconRes(): Int {
    return when (this) {
        SkillType.ATTACK -> R.drawable.ic_attack
        SkillType.HITPOINTS -> R.drawable.ic_hitpoints
        SkillType.MINING -> R.drawable.ic_mining
        SkillType.STRENGTH -> R.drawable.ic_strength
        SkillType.AGILITY -> R.drawable.ic_agility
        SkillType.SMITHING -> R.drawable.ic_smithing
        SkillType.DEFENCE -> R.drawable.ic_defence
        SkillType.HERBLORE -> R.drawable.ic_herblore
        SkillType.FISHING -> R.drawable.ic_fishing
        SkillType.RANGED -> R.drawable.ic_ranged
        SkillType.THIEVING -> R.drawable.ic_thieving
        SkillType.COOKING -> R.drawable.ic_cooking
        SkillType.PRAYER -> R.drawable.ic_prayer
        SkillType.CRAFTING -> R.drawable.ic_crafting
        SkillType.FIREMAKING -> R.drawable.ic_firemaking
        SkillType.MAGIC -> R.drawable.ic_magic
        SkillType.FLETCHING -> R.drawable.ic_fletching
        SkillType.WOODCUTTING -> R.drawable.ic_woodcutting
        SkillType.RUNECRAFTING -> R.drawable.ic_runecrafting
        SkillType.SLAYER -> R.drawable.ic_slayer
        SkillType.FARMING -> R.drawable.ic_farming
        SkillType.CONSTRUCTION -> R.drawable.ic_construction
        SkillType.HUNTER -> R.drawable.ic_hunter
    }
}

private fun SkillType.getName(): String {
    return when (this) {
        SkillType.ATTACK -> "Attack"
        SkillType.HITPOINTS -> "Hitpoints"
        SkillType.MINING -> "Mining"
        SkillType.STRENGTH -> "Strength"
        SkillType.AGILITY -> "Agility"
        SkillType.SMITHING -> "Smithing"
        SkillType.DEFENCE -> "Defence"
        SkillType.HERBLORE -> "Herblore"
        SkillType.FISHING -> "Fishing"
        SkillType.RANGED -> "Ranged"
        SkillType.THIEVING -> "Thieving"
        SkillType.COOKING -> "Cooking"
        SkillType.PRAYER -> "Prayer"
        SkillType.CRAFTING -> "Crafting"
        SkillType.FIREMAKING -> "Firemaking"
        SkillType.MAGIC -> "Magic"
        SkillType.FLETCHING -> "Fletching"
        SkillType.WOODCUTTING -> "Woodcutting"
        SkillType.RUNECRAFTING -> "Runecrafting"
        SkillType.SLAYER -> "Slayer"
        SkillType.FARMING -> "Farming"
        SkillType.CONSTRUCTION -> "Construction"
        SkillType.HUNTER -> "Hunter"
    }
}
