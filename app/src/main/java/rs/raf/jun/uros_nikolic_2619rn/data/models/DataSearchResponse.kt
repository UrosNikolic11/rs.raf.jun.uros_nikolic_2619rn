package rs.raf.jun.uros_nikolic_2619rn.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DataSearchResponse(
    val data: Search
)
