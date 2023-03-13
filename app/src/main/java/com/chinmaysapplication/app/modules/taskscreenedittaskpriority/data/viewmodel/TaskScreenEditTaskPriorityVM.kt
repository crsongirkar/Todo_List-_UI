package com.chinmaysapplication.app.modules.taskscreenedittaskpriority.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreenedittaskpriority.`data`.model.Gridcomputer1RowModel
import com.chinmaysapplication.app.modules.taskscreenedittaskpriority.`data`.model.TaskScreenEditTaskPriorityModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TaskScreenEditTaskPriorityVM : ViewModel(), KoinComponent {
  val taskScreenEditTaskPriorityModel: MutableLiveData<TaskScreenEditTaskPriorityModel> =
      MutableLiveData(TaskScreenEditTaskPriorityModel())

  var navArguments: Bundle? = null

  val gridcomputerList: MutableLiveData<MutableList<Gridcomputer1RowModel>> =
      MutableLiveData(mutableListOf())
}
