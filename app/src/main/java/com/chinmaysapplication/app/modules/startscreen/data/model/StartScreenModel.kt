package com.chinmaysapplication.app.modules.startscreen.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class StartScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoUpTo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_upto)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseloginto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_login_to)

)
