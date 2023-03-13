package com.chinmaysapplication.app.modules.homescreenaddtasktaskpriority.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenAddTaskTaskPriorityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskPriority: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_priority)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)

)
