package com.chinmaysapplication.app.modules.taskscreenedittask.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreenedittask.`data`.model.ListlocationRowModel
import com.chinmaysapplication.app.modules.taskscreenedittask.`data`.model.TaskScreenEditTaskModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TaskScreenEditTaskVM : ViewModel(), KoinComponent {
  val taskScreenEditTaskModel: MutableLiveData<TaskScreenEditTaskModel> =
      MutableLiveData(TaskScreenEditTaskModel())

  var navArguments: Bundle? = null

  val listlocationList: MutableLiveData<MutableList<ListlocationRowModel>> =
      MutableLiveData(mutableListOf())
}
