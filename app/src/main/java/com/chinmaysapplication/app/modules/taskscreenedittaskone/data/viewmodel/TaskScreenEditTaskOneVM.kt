package com.chinmaysapplication.app.modules.taskscreenedittaskone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreenedittaskone.`data`.model.Listlocation1RowModel
import com.chinmaysapplication.app.modules.taskscreenedittaskone.`data`.model.TaskScreenEditTaskOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TaskScreenEditTaskOneVM : ViewModel(), KoinComponent {
  val taskScreenEditTaskOneModel: MutableLiveData<TaskScreenEditTaskOneModel> =
      MutableLiveData(TaskScreenEditTaskOneModel())

  var navArguments: Bundle? = null

  val listlocationList: MutableLiveData<MutableList<Listlocation1RowModel>> =
      MutableLiveData(mutableListOf())
}
