package com.uaialternativa.personalnotes.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uaialternativa.personalnotes.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("app start main activity ___")
    }
}
