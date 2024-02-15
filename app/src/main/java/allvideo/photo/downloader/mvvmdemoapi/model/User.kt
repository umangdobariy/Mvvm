package allvideo.photo.downloader.mvvmdemoapi.model


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class User(
    @SerializedName("data")
    var data: ArrayList<Data?>? = null,
    @SerializedName("page")
    var page: Int? = null,
    @SerializedName("per_page")
    var perPage: Int? = null,
    @SerializedName("support")
    var support: Support? = null,
    @SerializedName("total")
    var total: Int? = null,
    @SerializedName("total_pages")
    var totalPages: Int? = null
) : Parcelable {
    @Parcelize
    data class Data(
        @SerializedName("avatar")
        var avatar: String? = null,
        @SerializedName("email")
        var email: String? = null,
        @SerializedName("first_name")
        var firstName: String? = null,
        @SerializedName("id")
        var id: Int? = null,
        @SerializedName("last_name")
        var lastName: String? = null
    ) : Parcelable

    @Parcelize
    data class Support(
        @SerializedName("text")
        var text: String? = null,
        @SerializedName("url")
        var url: String? = null
    ) : Parcelable
}