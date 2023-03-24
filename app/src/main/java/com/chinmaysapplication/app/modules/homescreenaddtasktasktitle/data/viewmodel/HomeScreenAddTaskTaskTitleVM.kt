package com.chinmaysapplication.app.modules.homescreenaddtasktasktitle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreenaddtasktasktitle.`data`.model.HomeScreenAddTaskTaskTitleModel
import org.koin.core.KoinComponent

class HomeScreenAddTaskTaskTitleVM : ViewModel(), KoinComponent {
  val homeScreenAddTaskTaskTitleModel: MutableLiveData<HomeScreenAddTaskTaskTitleModel> =
      MutableLiveData(HomeScreenAddTaskTaskTitleModel())

  var navArguments: Bundle? = null
}
