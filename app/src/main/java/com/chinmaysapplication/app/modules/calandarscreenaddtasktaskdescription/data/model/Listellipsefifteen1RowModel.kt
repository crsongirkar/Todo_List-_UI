package com.chinmaysapplication.app.modules.calandarscreenaddtasktaskdescription.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listellipsefifteen1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDoMathHomewor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_do_math_homewor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTodayAt1645: String? = MyApp.getInstance().resources.getString(R.string.lbl_today_at_16_45)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUniversity: String? = MyApp.getInstance().resources.getString(R.string.lbl_university)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
