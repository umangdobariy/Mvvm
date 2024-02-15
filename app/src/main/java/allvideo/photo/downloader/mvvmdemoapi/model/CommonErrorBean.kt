package allvideo.photo.downloader.mvvmdemoapi.model

import com.google.gson.annotations.SerializedName

data class CommonErrorBean(
    @SerializedName("message")
    val message: ArrayList<String>,
    @SerializedName("error")
    var error: ArrayList<String>? = null,
    @SerializedName("success")
    val success: Boolean?=null,
    @SerializedName("email")
    var email: ArrayList<String>? = null
)