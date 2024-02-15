package allvideo.photo.downloader.mvvmdemoapi.repos

import allvideo.photo.downloader.mvvmdemoapi.model.CommonErrorBean
import allvideo.photo.downloader.mvvmdemoapi.model.User
import allvideo.photo.downloader.mvvmdemoapi.network.ApiService
import com.app.puredermatology.utils.resource.Resource
import com.app.puredermatology.utils.resource.ResponseHandler
import allvideo.photo.downloader.mvvmdemoapi.resource.Status
import com.google.gson.Gson
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

import javax.inject.Inject

@ExperimentalCoroutinesApi
class RewardsListRepository @Inject constructor(
    private val api: ApiService,
    private val responseHandler: ResponseHandler,
) {
    suspend fun userList(): Flow<Resource<User>> = flow {
        emit(Resource.loading())
        try {
            val response = responseHandler.handleResponse(api.getUserList())
            when (response.status) {
                Status.SUCCESS -> {
                    val responseBody = response.data
                    emit(Resource.success(responseBody))
                    print(Gson().toJson(responseBody))
                }
                Status.ERROR -> {
                    emit(Resource.error(Gson().fromJson(response.error.toString(), CommonErrorBean::class.java)))
                }
                Status.EXCEPTION -> {
                    emit(Resource.exception(response.error as Throwable))
                }
                else -> {}
            }
        } catch (e: Exception) {
            emit(Resource.exception(e))
        }
    }


}