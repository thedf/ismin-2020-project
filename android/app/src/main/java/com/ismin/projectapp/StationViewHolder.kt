package com.ismin.projectapp

import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class StationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    var txvName = itemView.findViewById<TextView>(R.id.r_station_txv_name)
    var txvEbike: TextView = itemView.findViewById(R.id.r_station_txv_ebike)
    var txvMechanical: TextView = itemView.findViewById(R.id.r_station_txv_mechanical)

    fun initFavListener(item: Station, action: OnStationListener){
        var favBtn: Button = itemView.findViewById(R.id.favBtn)
        favBtn.setOnClickListener { View ->
            action.likeClick(item, favBtn)
        }

    }


    fun initializeListener(item: Station, action: OnStationListener){

            itemView.setOnClickListener { View ->
                action.onStationClick(item, adapterPosition)
            }
    }


}