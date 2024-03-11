package com.example.data.models

import com.google.gson.annotations.SerializedName

data class MovieResponseCloudModel(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val movies: List<MovieCloudModel>,
    @SerializedName("total_pages")
    val totalPage: Int,
    @SerializedName("total_results")
    val totalResults: Int,
)