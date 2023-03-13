package com.chinmaysapplication.app.modules.homescreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreen.`data`.model.HomeScreenModel
import com.chinmaysapplication.app.modules.homescreen.`data`.model.HomeScreenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeScreenVM : ViewModel(), KoinComponent {
  val homeScreenModel: MutableLiveData<HomeScreenModel> = MutableLiveData(HomeScreenModel())

  var navArguments: Bundle? = null

  val homeScreenList: MutableLiveData<MutableList<HomeScreenRowModel>> =
      MutableLiveData(mutableListOf())
}
