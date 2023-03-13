package com.chinmaysapplication.app.modules.loginscreentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.loginscreentwo.`data`.model.LoginScreenTwoModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class LoginScreenTwoVM : ViewModel(), KoinComponent {
  val loginScreenTwoModel: MutableLiveData<LoginScreenTwoModel> =
      MutableLiveData(LoginScreenTwoModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
