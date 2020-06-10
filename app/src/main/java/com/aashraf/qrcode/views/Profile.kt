package com.aashraf.qrcode.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aashraf.qrcode.R
import kotlinx.android.synthetic.main.activity_profile.*

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        btn_logout.setOnClickListener {
            this.finishAffinity()
        }
    }
}
