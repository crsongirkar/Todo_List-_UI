package com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.`data`.model.HomeScreenAddTaskTaskAlarmModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.`data`.model.ListsunRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeScreenAddTaskTaskAlarmVM : ViewModel(), KoinComponent {
  val homeScreenAddTaskTaskAlarmModel: MutableLiveData<HomeScreenAddTaskTaskAlarmModel> =
      MutableLiveData(HomeScreenAddTaskTaskAlarmModel())

  var navArguments: Bundle? = null

  val listsunList: MutableLiveData<MutableList<ListsunRowModel>> = MutableLiveData(mutableListOf())
}
