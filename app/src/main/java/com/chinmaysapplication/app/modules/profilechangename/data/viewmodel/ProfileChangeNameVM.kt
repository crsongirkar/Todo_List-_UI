package com.chinmaysapplication.app.modules.profilechangename.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.profilechangename.`data`.model.ProfileChangeNameModel
import org.koin.core.KoinComponent

class ProfileChangeNameVM : ViewModel(), KoinComponent {
  val profileChangeNameModel: MutableLiveData<ProfileChangeNameModel> =
      MutableLiveData(ProfileChangeNameModel())

  var navArguments: Bundle? = null
}
