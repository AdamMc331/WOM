package com.adammcneilly.wom.api.dto

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Collection of activities a user can participate in such as bounty hunter,
 * clue scrolls, and LMS.
 */
@JsonClass(generateAdapter = true)
data class WOMActivitiesDTO(
    @Json(name = "bounty_hunter_hunter")
    val bountyHunterHunter: WOMActivityDTO? = null,
    @Json(name = "bounty_hunter_rogue")
    val bountyHunterRogue: WOMActivityDTO? = null,
    @Json(name = "clue_scrolls_all")
    val clueScrollsAll: WOMActivityDTO? = null,
    @Json(name = "clue_scrolls_beginner")
    val clueScrollsBeginner: WOMActivityDTO? = null,
    @Json(name = "clue_scrolls_easy")
    val clueScrollsEasy: WOMActivityDTO? = null,
    @Json(name = "clue_scrolls_elite")
    val clueScrollsElite: WOMActivityDTO? = null,
    @Json(name = "clue_scrolls_hard")
    val clueScrollsHard: WOMActivityDTO? = null,
    @Json(name = "clue_scrolls_master")
    val clueScrollsMaster: WOMActivityDTO? = null,
    @Json(name = "clue_scrolls_medium")
    val clueScrollsMedium: WOMActivityDTO? = null,
    @Json(name = "guardians_of_the_rift")
    val guardiansOfTheRift: WOMActivityDTO? = null,
    @Json(name = "last_man_standing")
    val lastManStanding: WOMActivityDTO? = null,
    @Json(name = "league_points")
    val leaguePoints: WOMActivityDTO? = null,
    @Json(name = "pvp_arena")
    val pvpArena: WOMActivityDTO? = null,
    @Json(name = "soul_wars_zeal")
    val soulWarsZeal: WOMActivityDTO? = null,
)
