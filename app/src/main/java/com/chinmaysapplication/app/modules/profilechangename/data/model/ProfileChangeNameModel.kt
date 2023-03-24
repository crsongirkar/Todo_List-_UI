package com.chinmaysapplication.app.modules.profilechangename.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileChangeNameModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMarthaHays: String? = MyApp.getInstance().resources.getString(R.string.lbl_martha_hays)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt10Taskleft: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_task_left)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt5Taskdone: String? = MyApp.getInstance().resources.getString(R.string.lbl_5_task_done)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_app_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccount: String? = MyApp.getInstance().resources.getString(R.string.lbl_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeaccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeaccountOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_account2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeaccountTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_account3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUptodo: String? = MyApp.getInstance().resources.getString(R.string.lbl_uptodo2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAboutUS: String? = MyApp.getInstance().resources.getString(R.string.lbl_about_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFAQ: String? = MyApp.getInstance().resources.getString(R.string.lbl_faq)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelpFeedback: String? = MyApp.getInstance().resources.getString(R.string.lbl_help_feedback)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeaccountThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIndex: String? = MyApp.getInstance().resources.getString(R.string.lbl_index)
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
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrame163Value: String? = null
)
