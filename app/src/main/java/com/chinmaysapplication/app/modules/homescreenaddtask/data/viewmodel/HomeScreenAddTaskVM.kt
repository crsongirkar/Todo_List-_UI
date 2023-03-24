package com.chinmaysapplication.app.modules.homescreenaddtask.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreenaddtask.`data`.model.HomeScreenAddTaskModel
import org.koin.core.KoinComponent

class HomeScreenAddTaskVM : ViewModel(), KoinComponent {
  val homeScreenAddTaskModel: MutableLiveData<HomeScreenAddTaskModel> =
      MutableLiveData(HomeScreenAddTaskModel())

  var navArguments: Bundle? = null
}
