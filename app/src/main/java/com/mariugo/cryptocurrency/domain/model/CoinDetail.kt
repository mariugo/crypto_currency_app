package com.mariugo.cryptocurrency.domain.model

import com.mariugo.cryptocurrency.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val is_Active: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
