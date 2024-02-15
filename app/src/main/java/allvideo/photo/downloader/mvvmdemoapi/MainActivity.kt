package allvideo.photo.downloader.mvvmdemoapi

import allvideo.photo.downloader.mvvmdemoapi.adapter.RecycleUserAdapter
import allvideo.photo.downloader.mvvmdemoapi.databinding.ActivityMainBinding
import allvideo.photo.downloader.mvvmdemoapi.model.User
import allvideo.photo.downloader.mvvmdemoapi.resource.Status
import allvideo.photo.downloader.mvvmdemoapi.viewmodel.UserListViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.ExperimentalCoroutinesApi
@ExperimentalCoroutinesApi
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var madapter: RecycleUserAdapter
    private val userViewModel: UserListViewModel by viewModels()
    private var userList = ArrayList<User.Data>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        madapter = RecycleUserAdapter(this)
        binding.recyclerviewItem.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.recyclerviewItem.adapter = madapter
        userViewModel.userList()
        userObserver()


    }


    private fun userObserver() {
        userViewModel.userListLNetworkState().observe(this) { state ->
            when (state.status) {
                Status.SUCCESS -> {
                    madapter.setItems(userList)
                }
                Status.ERROR -> {
                }
                Status.EXCEPTION -> {
                }
                Status.LOADING -> {
                }
            }
        }
    }


}