package com.chinmaysapplication.app.modules.registerscreenthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.registerscreenthree.`data`.model.RegisterScreenThreeModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class RegisterScreenThreeVM : ViewModel(), KoinComponent {
  val registerScreenThreeModel: MutableLiveData<RegisterScreenThreeModel> =
      MutableLiveData(RegisterScreenThreeModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
