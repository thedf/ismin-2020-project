package com.ismin.projectapp

import java.io.Serializable

data class Station(val station_id: Int, val stationCode: String, val name: String, val lon: Int, val lat: Int, val mechanical: Int, val ebike: Int, val numDocksAvailable: Int, val last_reported: Int, val lastUpdatedOther: Int ) : Serializable