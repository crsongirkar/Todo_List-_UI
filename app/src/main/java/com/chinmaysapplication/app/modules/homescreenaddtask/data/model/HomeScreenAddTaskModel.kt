package com.chinmaysapplication.app.modules.homescreenaddtask.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenAddTaskModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIndex: String? = MyApp.getInstance().resources.getString(R.string.lbl_index)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDomathhomewor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_math_homewor2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame164Value: String? = null
)
