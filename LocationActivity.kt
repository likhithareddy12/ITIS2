package com.example.itis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_location.*
import kotlinx.android.synthetic.main.activity_main.*

class LocationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)

        showmap.setOnClickListener {

            val intent1 = Intent(this@LocationActivity, MapActivity::class.java)

            var streetName = streetName.text.toString()

            var cityName = cityName.text.toString()

            var stateName = stateName.text.toString()

            intent1.putExtra("streetName", streetName)

            intent1.putExtra("cityName", cityName)

            intent1.putExtra("stateName", stateName)

            Log.i("entanattu", "chudali mari")

            startActivity(intent1)


        }
    }
}