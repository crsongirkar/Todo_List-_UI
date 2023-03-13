package com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.`data`.model.CalandarScreenAddTaskTaskPriorityModel
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.`data`.model.Gridcomputer2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalandarScreenAddTaskTaskPriorityVM : ViewModel(), KoinComponent {
  val calandarScreenAddTaskTaskPriorityModel:
      MutableLiveData<CalandarScreenAddTaskTaskPriorityModel> =
      MutableLiveData(CalandarScreenAddTaskTaskPriorityModel())

  var navArguments: Bundle? = null

  val gridcomputerList: MutableLiveData<MutableList<Gridcomputer2RowModel>> =
      MutableLiveData(mutableListOf())
}
