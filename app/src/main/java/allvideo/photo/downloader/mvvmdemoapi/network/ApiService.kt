package allvideo.photo.downloader.mvvmdemoapi.network


import allvideo.photo.downloader.mvvmdemoapi.model.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users?page=2")
    suspend fun getUserList(): Response<User>

}