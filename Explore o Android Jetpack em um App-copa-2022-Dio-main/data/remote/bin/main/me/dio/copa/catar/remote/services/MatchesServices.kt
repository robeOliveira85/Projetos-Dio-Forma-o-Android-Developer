package me.dio.copa.catar.remote.services

import me.dio.copa.catar.remote.model.MatchRemote
import retrofit2.http.GET

interface MatchesServices {
    @GET("api.json")
    //@GET("https:github.com/robeOliveira85/dio-copa-2022-api/api.json")
    suspend fun getMatches(): List<MatchRemote>
}
