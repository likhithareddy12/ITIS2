package com.example.itis

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_questionnarie.*

class QuestionnarieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnarie)

        questionariebutton.setOnClickListener {

            val intent = Intent(this@QuestionnarieActivity, ResponseActivity::class.java)
            if(radio41.isChecked())
            {
                intent.putExtra("Select","radio41")
            }
            else if(radio46.isChecked())
            {
                intent.putExtra("Select","radio46")
            }
            startActivity(intent)

        }
    }
}
