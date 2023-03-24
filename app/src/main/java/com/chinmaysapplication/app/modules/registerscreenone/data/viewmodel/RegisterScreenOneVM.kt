package com.chinmaysapplication.app.modules.registerscreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.registerscreenone.`data`.model.RegisterScreenOneModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class RegisterScreenOneVM : ViewModel(), KoinComponent {
  val registerScreenOneModel: MutableLiveData<RegisterScreenOneModel> =
      MutableLiveData(RegisterScreenOneModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
