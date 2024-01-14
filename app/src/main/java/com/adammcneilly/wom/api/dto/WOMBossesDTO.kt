package com.adammcneilly.wom.api.dto


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A collection of bosses in OSRS and how the user stacks up in the rankings against
 * these bosses.
 */
@JsonClass(generateAdapter = true)
data class WOMBossesDTO(
    @Json(name = "abyssal_sire")
    val abyssalSire: WOMBossDTO? = null,
    @Json(name = "alchemical_hydra")
    val alchemicalHydra: WOMBossDTO? = null,
    @Json(name = "artio")
    val artio: WOMBossDTO? = null,
    @Json(name = "barrows_chests")
    val barrowsChests: WOMBossDTO? = null,
    @Json(name = "bryophyta")
    val bryophyta: WOMBossDTO? = null,
    @Json(name = "callisto")
    val callisto: WOMBossDTO? = null,
    @Json(name = "calvarion")
    val calvarion: WOMBossDTO? = null,
    @Json(name = "cerberus")
    val cerberus: WOMBossDTO? = null,
    @Json(name = "chambers_of_xeric")
    val chambersOfXeric: WOMBossDTO? = null,
    @Json(name = "chambers_of_xeric_challenge_mode")
    val chambersOfXericChallengeMode: WOMBossDTO? = null,
    @Json(name = "chaos_elemental")
    val chaosElemental: WOMBossDTO? = null,
    @Json(name = "chaos_fanatic")
    val chaosFanatic: WOMBossDTO? = null,
    @Json(name = "commander_zilyana")
    val commanderZilyana: WOMBossDTO? = null,
    @Json(name = "corporeal_beast")
    val corporealBeast: WOMBossDTO? = null,
    @Json(name = "crazy_archaeologist")
    val crazyArchaeologist: WOMBossDTO? = null,
    @Json(name = "dagannoth_prime")
    val dagannothPrime: WOMBossDTO? = null,
    @Json(name = "dagannoth_rex")
    val dagannothRex: WOMBossDTO? = null,
    @Json(name = "dagannoth_supreme")
    val dagannothSupreme: WOMBossDTO? = null,
    @Json(name = "deranged_archaeologist")
    val derangedArchaeologist: WOMBossDTO? = null,
    @Json(name = "duke_sucellus")
    val dukeSucellus: WOMBossDTO? = null,
    @Json(name = "general_graardor")
    val generalGraardor: WOMBossDTO? = null,
    @Json(name = "giant_mole")
    val giantMole: WOMBossDTO? = null,
    @Json(name = "grotesque_guardians")
    val grotesqueGuardians: WOMBossDTO? = null,
    @Json(name = "hespori")
    val hespori: WOMBossDTO? = null,
    @Json(name = "kalphite_queen")
    val kalphiteQueen: WOMBossDTO? = null,
    @Json(name = "king_black_dragon")
    val kingBlackDragon: WOMBossDTO? = null,
    @Json(name = "kraken")
    val kraken: WOMBossDTO? = null,
    @Json(name = "kreearra")
    val kreearra: WOMBossDTO? = null,
    @Json(name = "kril_tsutsaroth")
    val krilTsutsaroth: WOMBossDTO? = null,
    @Json(name = "mimic")
    val mimic: WOMBossDTO? = null,
    @Json(name = "nex")
    val nex: WOMBossDTO? = null,
    @Json(name = "nightmare")
    val nightmare: WOMBossDTO? = null,
    @Json(name = "obor")
    val obor: WOMBossDTO? = null,
    @Json(name = "phantom_muspah")
    val phantomMuspah: WOMBossDTO? = null,
    @Json(name = "phosanis_nightmare")
    val phosanisNightmare: WOMBossDTO? = null,
    @Json(name = "sarachnis")
    val sarachnis: WOMBossDTO? = null,
    @Json(name = "scorpia")
    val scorpia: WOMBossDTO? = null,
    @Json(name = "skotizo")
    val skotizo: WOMBossDTO? = null,
    @Json(name = "spindel")
    val spindel: WOMBossDTO? = null,
    @Json(name = "tempoross")
    val tempoross: WOMBossDTO? = null,
    @Json(name = "the_corrupted_gauntlet")
    val theCorruptedGauntlet: WOMBossDTO? = null,
    @Json(name = "the_gauntlet")
    val theGauntlet: WOMBossDTO? = null,
    @Json(name = "the_leviathan")
    val theLeviathan: WOMBossDTO? = null,
    @Json(name = "the_whisperer")
    val theWhisperer: WOMBossDTO? = null,
    @Json(name = "theatre_of_blood")
    val theatreOfBlood: WOMBossDTO? = null,
    @Json(name = "theatre_of_blood_hard_mode")
    val theatreOfBloodHardMode: WOMBossDTO? = null,
    @Json(name = "thermonuclear_smoke_devil")
    val thermonuclearSmokeDevil: WOMBossDTO? = null,
    @Json(name = "tombs_of_amascut")
    val tombsOfAmascut: WOMBossDTO? = null,
    @Json(name = "tombs_of_amascut_expert")
    val tombsOfAmascutExpert: WOMBossDTO? = null,
    @Json(name = "tzkal_zuk")
    val tzkalZuk: WOMBossDTO? = null,
    @Json(name = "tztok_jad")
    val tztokJad: WOMBossDTO? = null,
    @Json(name = "vardorvis")
    val vardorvis: WOMBossDTO? = null,
    @Json(name = "venenatis")
    val venenatis: WOMBossDTO? = null,
    @Json(name = "vetion")
    val vetion: WOMBossDTO? = null,
    @Json(name = "vorkath")
    val vorkath: WOMBossDTO? = null,
    @Json(name = "wintertodt")
    val wintertodt: WOMBossDTO? = null,
    @Json(name = "zalcano")
    val zalcano: WOMBossDTO? = null,
    @Json(name = "zulrah")
    val zulrah: WOMBossDTO? = null
)
