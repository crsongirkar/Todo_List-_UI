package com.chinmaysapplication.app.modules.registerscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.registerscreen.`data`.model.RegisterScreenModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class RegisterScreenVM : ViewModel(), KoinComponent {
  val registerScreenModel: MutableLiveData<RegisterScreenModel> =
      MutableLiveData(RegisterScreenModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
