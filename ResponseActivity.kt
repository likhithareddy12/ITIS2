package com.example.itis

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ResponseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ss:String = intent.getStringExtra("Select")
        if(ss=="radio41")
        {
            setContentView(R.layout.activity_response)
        }
        if(ss=="radio46")
        {
            setContentView(R.layout.hotels)
        }
        if(ss=="radio42")
        {
            setContentView(R.layout.parks)
        }
        if(ss=="radio43")
        {
            setContentView(R.layout.historicmonuments)
        }
        if(ss=="radio44")
        {
            setContentView(R.layout.malls)
        }
        if(ss=="radio45")
        {
            setContentView(R.layout.others)
        }
    }
}
