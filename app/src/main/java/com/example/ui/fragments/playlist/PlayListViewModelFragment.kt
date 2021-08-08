package com.example.ui.fragments.playlist
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.YouTubeApp
import com.example.loco.network.result.Resource
import com.example.loco.ui.base.BaseViewModel
import com.example.model.playlist.PlayList
import com.example.repository.Repository

class PlayListViewModelFragment(private val repository: Repository): BaseViewModel() {

    var loading = MutableLiveData<Boolean>()

    fun fetchPlayList(): LiveData<Resource<PlayList>> {
        return repository.fetchYoutubeApiPlayList()
    }
}