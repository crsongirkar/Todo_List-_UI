package com.chinmaysapplication.app.modules.taskscreenedittask.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlocationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUniversity: String? = MyApp.getInstance().resources.getString(R.string.lbl_university)

)
