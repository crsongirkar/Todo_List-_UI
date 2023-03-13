package com.chinmaysapplication.app.modules.taskscreenedittaskone.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TaskScreenEditTaskOneModel(
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
  var txtTodayAt1645: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_at_16_45)
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
  var txtEditTasktitle: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_edit_task_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDomathhomeworOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_math_homewor2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame164Value: String? = null
)
