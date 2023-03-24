package com.chinmaysapplication.app.modules.homescreenemptyscreen.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenEmptyScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIndex: String? = MyApp.getInstance().resources.getString(R.string.lbl_index)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatdoyouwan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_do_you_wan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTaptoaddyo: String? = MyApp.getInstance().resources.getString(R.string.msg_tap_to_add_yo)
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

)
