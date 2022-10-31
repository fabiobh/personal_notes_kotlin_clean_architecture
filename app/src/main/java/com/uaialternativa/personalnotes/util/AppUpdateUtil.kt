package com.uaialternativa.personalnotes.util

import android.app.Activity
import android.content.IntentSender
import com.google.android.play.core.appupdate.AppUpdateManagerFactory
import com.google.android.play.core.install.model.AppUpdateType
import com.google.android.play.core.install.model.UpdateAvailability

object AppUpdateUtil {
    @JvmStatic
    fun forceAppUpdate(act: Activity) {
        appUpdateUsingGooglePlayApiLibrary(act)
    }
}

// static method, can be declared outside the class
fun appUpdateUsingGooglePlayApiLibrary(act: Activity) {

    var RC_APP_UPDATE = 999
    var mAppUpdateManager = AppUpdateManagerFactory.create(act)
    mAppUpdateManager.appUpdateInfo.addOnSuccessListener { result ->
        println("___ result: $result")
        if (result.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
            && result.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)
        ) {
            try {
                println("___ try app update inside if")
                mAppUpdateManager.startUpdateFlowForResult(
                    result,
                    AppUpdateType.IMMEDIATE,
                    act,
                    RC_APP_UPDATE
                )
            } catch (e: IntentSender.SendIntentException) {
                println("__ error catch app update: ${e.toString()}")
                e.printStackTrace()
            }
        }
    }

}