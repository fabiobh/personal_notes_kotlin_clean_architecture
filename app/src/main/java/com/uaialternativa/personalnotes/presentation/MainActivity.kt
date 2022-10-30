package com.uaialternativa.personalnotes.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
//import com.sanojpunchihewa.updatemanager.UpdateManager
//import com.sanojpunchihewa.updatemanager.UpdateManagerConstant
import com.uaialternativa.personalnotes.R


class MainActivity : AppCompatActivity() {

    //third-party library - https://github.com/SanojPunchihewa/InAppUpdater
    //lateinit var mUpdateManager: UpdateManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("app start main activity ___")

        // Initialize the Update Manager with the Activity and the Update Mode
        //mUpdateManager = UpdateManager.Builder(this).mode(UpdateManagerConstant.IMMEDIATE);
        //mUpdateManager.start();

    }


}
