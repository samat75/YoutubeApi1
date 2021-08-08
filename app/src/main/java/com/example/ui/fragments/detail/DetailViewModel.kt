package com.example.ui.fragments.detail
import androidx.lifecycle.LiveData
import com.example.YouTubeApp
import com.example.loco.network.result.Resource
import com.example.loco.ui.base.BaseViewModel
import com.example.model.playlistItems.PlayListItems
import com.example.repository.Repository

class DetailViewModel(private val repository: Repository): BaseViewModel() {

    fun fetchPlayListItems(id: String): LiveData<Resource<PlayListItems>> {
        return repository.fetchYoutubeApiPlaylistItems(id)
    }
}