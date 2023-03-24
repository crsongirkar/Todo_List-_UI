package com.chinmaysapplication.app.modules.registerscreentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.registerscreentwo.`data`.model.RegisterScreenTwoModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class RegisterScreenTwoVM : ViewModel(), KoinComponent {
  val registerScreenTwoModel: MutableLiveData<RegisterScreenTwoModel> =
      MutableLiveData(RegisterScreenTwoModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
