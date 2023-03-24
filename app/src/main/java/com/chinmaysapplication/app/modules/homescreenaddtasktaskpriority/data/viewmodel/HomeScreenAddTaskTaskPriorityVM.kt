package com.chinmaysapplication.app.modules.homescreenaddtasktaskpriority.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskpriority.`data`.model.GridcomputerRowModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskpriority.`data`.model.HomeScreenAddTaskTaskPriorityModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeScreenAddTaskTaskPriorityVM : ViewModel(), KoinComponent {
  val homeScreenAddTaskTaskPriorityModel: MutableLiveData<HomeScreenAddTaskTaskPriorityModel> =
      MutableLiveData(HomeScreenAddTaskTaskPriorityModel())

  var navArguments: Bundle? = null

  val gridcomputerList: MutableLiveData<MutableList<GridcomputerRowModel>> =
      MutableLiveData(mutableListOf())
}
