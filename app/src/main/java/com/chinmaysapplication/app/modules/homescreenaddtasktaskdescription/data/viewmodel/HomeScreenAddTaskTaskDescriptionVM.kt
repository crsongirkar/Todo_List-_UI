package com.chinmaysapplication.app.modules.homescreenaddtasktaskdescription.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskdescription.`data`.model.HomeScreenAddTaskTaskDescriptionModel
import org.koin.core.KoinComponent

class HomeScreenAddTaskTaskDescriptionVM : ViewModel(), KoinComponent {
  val homeScreenAddTaskTaskDescriptionModel: MutableLiveData<HomeScreenAddTaskTaskDescriptionModel>
      = MutableLiveData(HomeScreenAddTaskTaskDescriptionModel())

  var navArguments: Bundle? = null
}
