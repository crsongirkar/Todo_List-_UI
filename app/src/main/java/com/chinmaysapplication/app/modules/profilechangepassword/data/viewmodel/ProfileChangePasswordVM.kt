package com.chinmaysapplication.app.modules.profilechangepassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.profilechangepassword.`data`.model.ProfileChangePasswordModel
import org.koin.core.KoinComponent

class ProfileChangePasswordVM : ViewModel(), KoinComponent {
  val profileChangePasswordModel: MutableLiveData<ProfileChangePasswordModel> =
      MutableLiveData(ProfileChangePasswordModel())

  var navArguments: Bundle? = null
}
