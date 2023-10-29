package com.example.hiltmoshikapt.ui.theme

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MoshiTest(
    @Json(name = "test")
    val test: String,
)