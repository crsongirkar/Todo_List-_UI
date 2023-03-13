package com.chinmaysapplication.app.modules.onboading.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboadingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkip: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrgonaizeyour: String? =
      MyApp.getInstance().resources.getString(R.string.msg_orgonaize_your)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYoucanorganiz: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_organiz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBack: String? = MyApp.getInstance().resources.getString(R.string.lbl_back)

)
