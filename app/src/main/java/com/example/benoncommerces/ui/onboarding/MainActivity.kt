package com.example.benoncommerces.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.benoncommerces.R

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_bar)

        Handler().postDelayed(Runnable
        { // This method will be executed once the timer is over
            val i = Intent(this, Slider::class.java)
            startActivity(i)
            finish()
        }, 2000
        )

    }
}