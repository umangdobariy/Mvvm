package allvideo.photo.downloader.mvvmdemoapi

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Mvvm : Application() {

    companion object {
        lateinit var instance: Mvvm

        fun getAppInstance(): Mvvm {
            return instance
        }
    }

//    fun createGooglePayChargeClient(activity: Activity): GooglePayChargeClient? {
//        return GooglePayChargeClient(chargeCallFactory)
//    }

    override fun onCreate() {
        super.onCreate()
        instance = this



    }


    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }




}