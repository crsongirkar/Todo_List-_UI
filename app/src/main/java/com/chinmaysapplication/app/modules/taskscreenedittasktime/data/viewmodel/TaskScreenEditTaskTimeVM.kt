package com.chinmaysapplication.app.modules.taskscreenedittasktime.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreenedittasktime.`data`.model.TaskScreenEditTaskTimeModel
import org.koin.core.KoinComponent

class TaskScreenEditTaskTimeVM : ViewModel(), KoinComponent {
  val taskScreenEditTaskTimeModel: MutableLiveData<TaskScreenEditTaskTimeModel> =
      MutableLiveData(TaskScreenEditTaskTimeModel())

  var navArguments: Bundle? = null
}
