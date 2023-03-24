package com.chinmaysapplication.app.modules.taskscreenedittaskdate.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreenedittaskdate.`data`.model.Listsun1RowModel
import com.chinmaysapplication.app.modules.taskscreenedittaskdate.`data`.model.TaskScreenEditTaskDateModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TaskScreenEditTaskDateVM : ViewModel(), KoinComponent {
  val taskScreenEditTaskDateModel: MutableLiveData<TaskScreenEditTaskDateModel> =
      MutableLiveData(TaskScreenEditTaskDateModel())

  var navArguments: Bundle? = null

  val listsunList: MutableLiveData<MutableList<Listsun1RowModel>> = MutableLiveData(mutableListOf())
}
