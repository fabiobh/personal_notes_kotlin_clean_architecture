package com.uaialternativa.personalnotes.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.uaialternativa.personalnotes.R
import com.uaialternativa.personalnotes.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("app start main activity ___")

    }

    override fun onResume() {
        super.onResume()

        println("app onresume main activity ___")
        //appUpdateUsingGooglePlayApiLibrary(this) // it is the same as the code below
        AppUpdateUtil.forceAppUpdate(this)
    }

}
