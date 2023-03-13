package com.chinmaysapplication.app.modules.taskscreenedittaskpriority.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TaskScreenEditTaskPriorityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditTaskPrior: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_task_prior)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)

)
