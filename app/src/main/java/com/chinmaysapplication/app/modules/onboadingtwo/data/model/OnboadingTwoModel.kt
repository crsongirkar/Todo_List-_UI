package com.chinmaysapplication.app.modules.onboadingtwo.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboadingTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtManageyourtas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_manage_your_tas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucaneasily: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_easily)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)

)
