package com.chinmaysapplication.app.modules.profilechangeprofileimage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.profilechangeprofileimage.`data`.model.ProfileChangeProfileImageModel
import org.koin.core.KoinComponent

class ProfileChangeProfileImageVM : ViewModel(), KoinComponent {
  val profileChangeProfileImageModel: MutableLiveData<ProfileChangeProfileImageModel> =
      MutableLiveData(ProfileChangeProfileImageModel())

  var navArguments: Bundle? = null
}
