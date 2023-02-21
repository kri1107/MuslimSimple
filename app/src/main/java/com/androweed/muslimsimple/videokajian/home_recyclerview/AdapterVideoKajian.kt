package com.androweed.muslimsimple.videokajian.home_recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.androweed.muslimsimple.R

class AdapterVideoKajian (var data : ArrayList<ModelVideoKajian>, var context: Activity?) : RecyclerView.Adapter<AdapterVideoKajian.MyViewHolder>() {
    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val titleVideoKajian = view.findViewById<TextView>(R.id.tv_title_videokajian)
        val channelVideoKajian = view.findViewById<TextView>(R.id.tv_channel_video_kajian)
        val thumbnailVideoKajian = view.findViewById<ImageView>(R.id.iv_thumbnail_video_kajian)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.home_rv_videokajian, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.titleVideoKajian.text = data[position].titleVideoKajian
        holder.channelVideoKajian.text = data[position].channelVideoKajian
        holder.thumbnailVideoKajian.setImageResource(data[position].thumbnailVideoKajian)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}

