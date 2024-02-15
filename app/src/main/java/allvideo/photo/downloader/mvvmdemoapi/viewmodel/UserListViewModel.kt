package allvideo.photo.downloader.mvvmdemoapi.viewmodel

import allvideo.photo.downloader.mvvmdemoapi.model.User
import allvideo.photo.downloader.mvvmdemoapi.repos.RewardsListRepository
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.puredermatology.utils.resource.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@ExperimentalCoroutinesApi
@HiltViewModel
class UserListViewModel @Inject constructor(private val repository: RewardsListRepository) : ViewModel() {

    private val userListLiveData: MutableLiveData<Resource<User>> = MutableLiveData()
    fun userListLNetworkState(): LiveData<Resource<User>> {
        return userListLiveData
    }

    fun userList() {
        viewModelScope.launch {
            repository.userList().onEach { state ->
                userListLiveData.value = state
            }.launchIn(viewModelScope)
        }
    }
}