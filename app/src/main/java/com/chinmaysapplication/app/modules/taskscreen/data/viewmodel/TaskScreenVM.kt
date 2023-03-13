package com.chinmaysapplication.app.modules.taskscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreen.`data`.model.TaskScreenModel
import org.koin.core.KoinComponent

class TaskScreenVM : ViewModel(), KoinComponent {
  val taskScreenModel: MutableLiveData<TaskScreenModel> = MutableLiveData(TaskScreenModel())

  var navArguments: Bundle? = null
}
