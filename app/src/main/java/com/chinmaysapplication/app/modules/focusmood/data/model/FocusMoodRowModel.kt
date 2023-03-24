package com.chinmaysapplication.app.modules.focusmood.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FocusMoodRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInstagramOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_instagram)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYouspent4hon: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_spent_4h_on)

)
