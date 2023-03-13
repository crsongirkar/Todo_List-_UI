package com.chinmaysapplication.app.modules.taskscreen.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TaskScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDochapter2to: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_chapter_2_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_task_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaskPriority: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_task_priority2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_sub_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeleteTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_delete_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame162Value: String? = null
)
