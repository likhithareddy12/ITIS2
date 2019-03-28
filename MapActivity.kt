package com.example.itis

import android.location.Geocoder

import android.support.v7.app.AppCompatActivity

import android.os.Bundle

import android.util.Log

import com.google.android.gms.maps.CameraUpdateFactory

import com.google.android.gms.maps.GoogleMap

import com.google.android.gms.maps.OnMapReadyCallback

import com.google.android.gms.maps.SupportMapFragment

import com.google.android.gms.maps.model.LatLng

import com.google.android.gms.maps.model.MarkerOptions



class MapActivity : AppCompatActivity() {

    lateinit var mapFragment : SupportMapFragment

    lateinit var googleMap: GoogleMap



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_map)

        var streetName = intent.extras.getString("streetName")

        var cityName = intent.extras.getString("cityName")

        var stateName = intent.extras.getString("stateName")

        var locationame1 = "$streetName $cityName $stateName" as String



        var locationame = "Gachibowli Hyderabad"

        var gc = Geocoder(applicationContext)

        var adresses = gc.getFromLocationName(locationame1,3)

        var lat3 = adresses[0].latitude

        var long3 = adresses[0].longitude

        Log.i("plocation", locationame1)

        mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment

        mapFragment.getMapAsync(OnMapReadyCallback {

            googleMap = it

            //     googleMap.isMyLocationEnabled = true

            //         val location1 = LatLng(13.03,77.60)

            val location1 = LatLng(lat3,long3)

            googleMap.addMarker(MarkerOptions().position(location1).title("My Location"))

            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(location1,15f))

            //       val dist = distance(13.03,77.60,9.89,78.11)

            //     val dist2 = distance(13.03,77.60,9.89,78.11)

//

//            if(dist>dist2)

//                Log.i("dist","a is closer")

//            else Log.i("dist","B is closer")



//            val location2 = LatLng(lat3,long3)

//            googleMap.addMarker(MarkerOptions().position(location2).title("Madurai"))



            val location3 = LatLng(13.00,77.00)

            //     googleMap.addMarker(MarkerOptions().position(location3).title("Bangalore"))



        })

    }



}
