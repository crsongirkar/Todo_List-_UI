package com.chinmaysapplication.app.modules.loginscreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.loginscreenone.`data`.model.LoginScreenOneModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class LoginScreenOneVM : ViewModel(), KoinComponent {
  val loginScreenOneModel: MutableLiveData<LoginScreenOneModel> =
      MutableLiveData(LoginScreenOneModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
