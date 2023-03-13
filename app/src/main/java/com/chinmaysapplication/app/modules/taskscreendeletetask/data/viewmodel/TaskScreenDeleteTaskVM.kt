package com.chinmaysapplication.app.modules.taskscreendeletetask.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreendeletetask.`data`.model.TaskScreenDeleteTaskModel
import org.koin.core.KoinComponent

class TaskScreenDeleteTaskVM : ViewModel(), KoinComponent {
  val taskScreenDeleteTaskModel: MutableLiveData<TaskScreenDeleteTaskModel> =
      MutableLiveData(TaskScreenDeleteTaskModel())

  var navArguments: Bundle? = null
}
