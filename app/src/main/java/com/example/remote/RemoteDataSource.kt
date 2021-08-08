package com.example.remote

import com.example.`object`.Constant
import com.example.loco.network.BaseDataSource

class RemoteDataSource(private var apiService: YoutubeApi ): BaseDataSource() {


    suspend fun fetchAllPlaylist() = getResult {
        apiService.fetchAllPlayList(
            Constant.PART,
            Constant.CHANNEL_ID,
            Constant.MAX_RESULT,
            Constant.API_KEY)
    }

    suspend fun fetchPlaylistItems(id: String) = getResult {
        apiService.fetchPlaylistItems(
            Constant.PART,
            id,
            Constant.API_KEY)
    }
}