package com.chinmaysapplication.app.modules.homescreen.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIndex: String? = MyApp.getInstance().resources.getString(R.string.lbl_index)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtToday: String? = MyApp.getInstance().resources.getString(R.string.lbl_today)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCompleted: String? = MyApp.getInstance().resources.getString(R.string.lbl_completed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBuygrocery: String? = MyApp.getInstance().resources.getString(R.string.lbl_buy_grocery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodayAt1645One: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_today_at_16_45)

)
