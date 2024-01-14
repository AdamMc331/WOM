package com.adammcneilly.wom.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class WOMSkillsDTO(
    @Json(name = "agility")
    val agility: WOMSkillDTO? = null,
    @Json(name = "attack")
    val attack: WOMSkillDTO? = null,
    @Json(name = "construction")
    val construction: WOMSkillDTO? = null,
    @Json(name = "cooking")
    val cooking: WOMSkillDTO? = null,
    @Json(name = "crafting")
    val crafting: WOMSkillDTO? = null,
    @Json(name = "defence")
    val defence: WOMSkillDTO? = null,
    @Json(name = "farming")
    val farming: WOMSkillDTO? = null,
    @Json(name = "firemaking")
    val firemaking: WOMSkillDTO? = null,
    @Json(name = "fishing")
    val fishing: WOMSkillDTO? = null,
    @Json(name = "fletching")
    val fletching: WOMSkillDTO? = null,
    @Json(name = "herblore")
    val herblore: WOMSkillDTO? = null,
    @Json(name = "hitpoints")
    val hitpoints: WOMSkillDTO? = null,
    @Json(name = "hunter")
    val hunter: WOMSkillDTO? = null,
    @Json(name = "magic")
    val magic: WOMSkillDTO? = null,
    @Json(name = "mining")
    val mining: WOMSkillDTO? = null,
    @Json(name = "overall")
    val overall: WOMSkillDTO? = null,
    @Json(name = "prayer")
    val prayer: WOMSkillDTO? = null,
    @Json(name = "ranged")
    val ranged: WOMSkillDTO? = null,
    @Json(name = "runecrafting")
    val runecrafting: WOMSkillDTO? = null,
    @Json(name = "slayer")
    val slayer: WOMSkillDTO? = null,
    @Json(name = "smithing")
    val smithing: WOMSkillDTO? = null,
    @Json(name = "strength")
    val strength: WOMSkillDTO? = null,
    @Json(name = "thieving")
    val thieving: WOMSkillDTO? = null,
    @Json(name = "woodcutting")
    val woodcutting: WOMSkillDTO? = null,
)
