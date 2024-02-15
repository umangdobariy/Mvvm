package allvideo.photo.downloader.mvvmdemoapi.di

import allvideo.photo.downloader.mvvmdemoapi.network.ApiService
import allvideo.photo.downloader.mvvmdemoapi.repos.RewardsListRepository
import com.app.puredermatology.utils.resource.ResponseHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {


//    @Singleton
//    @Provides
//    fun provideLoginRepository(api: PureDermatologyApi, responseHandler: ResponseHandler, prefsUtils: PrefUtils): LoginRepository {
//        return LoginRepository(api, responseHandler, prefsUtils)
//    }

    @Singleton
    @Provides
    fun provideRegisterRepository(api: ApiService, responseHandler: ResponseHandler):RewardsListRepository  {
        return RewardsListRepository(api, responseHandler)
    }



}