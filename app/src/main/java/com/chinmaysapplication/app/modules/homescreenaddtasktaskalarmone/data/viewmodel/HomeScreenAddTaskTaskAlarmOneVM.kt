package com.chinmaysapplication.app.modules.homescreenaddtasktaskalarmone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskalarmone.`data`.model.HomeScreenAddTaskTaskAlarmOneModel
import org.koin.core.KoinComponent

class HomeScreenAddTaskTaskAlarmOneVM : ViewModel(), KoinComponent {
  val homeScreenAddTaskTaskAlarmOneModel: MutableLiveData<HomeScreenAddTaskTaskAlarmOneModel> =
      MutableLiveData(HomeScreenAddTaskTaskAlarmOneModel())

  var navArguments: Bundle? = null
}
