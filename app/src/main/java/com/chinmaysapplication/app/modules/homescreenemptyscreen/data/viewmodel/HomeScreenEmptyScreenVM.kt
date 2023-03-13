package com.chinmaysapplication.app.modules.homescreenemptyscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreenemptyscreen.`data`.model.HomeScreenEmptyScreenModel
import org.koin.core.KoinComponent

class HomeScreenEmptyScreenVM : ViewModel(), KoinComponent {
  val homeScreenEmptyScreenModel: MutableLiveData<HomeScreenEmptyScreenModel> =
      MutableLiveData(HomeScreenEmptyScreenModel())

  var navArguments: Bundle? = null
}
