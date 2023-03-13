package com.chinmaysapplication.app.modules.homescreenaddtasktasktitle.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenAddTaskTaskTitleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddTask: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_task)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.lbl_description)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndex: String? = MyApp.getInstance().resources.getString(R.string.lbl_index)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndexOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_index)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalendarOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_calendar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFocuse: String? = MyApp.getInstance().resources.getString(R.string.lbl_focuse)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame163Value: String? = null
)
