package com.chinmaysapplication.app.modules.taskscreendeletetask.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TaskScreenDeleteTaskModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_yo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)

)
