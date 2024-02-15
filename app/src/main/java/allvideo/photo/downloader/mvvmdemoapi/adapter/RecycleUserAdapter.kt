package allvideo.photo.downloader.mvvmdemoapi.adapter

import allvideo.photo.downloader.mvvmdemoapi.R
import allvideo.photo.downloader.mvvmdemoapi.databinding.ItemUserLayoutBinding
import allvideo.photo.downloader.mvvmdemoapi.model.User
import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class RecycleUserAdapter(var activity: Activity) :
    RecyclerView.Adapter<RecycleUserAdapter.MyViewHolder>() {

    lateinit var binding: ItemUserLayoutBinding
    var userList : ArrayList<User.Data> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ItemUserLayoutBinding.inflate(LayoutInflater.from(activity), parent, false)
        return MyViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var user = userList[position]
        holder.bind.tvName.text = "${user.firstName} ${user.lastName}"
        holder.bind.tvEmail.text = "${user.email}"


        Glide.with(activity).load(user.avatar).centerCrop()
            .placeholder(R.drawable.ic_baseline_hourglass_full_24).into(holder.bind.ivThumbnail)

    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class MyViewHolder(itemView: ItemUserLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
        var bind = itemView
    }

    fun setItems(userList: ArrayList<User.Data>) {
        this.userList = userList
        notifyDataSetChanged()
    }

}