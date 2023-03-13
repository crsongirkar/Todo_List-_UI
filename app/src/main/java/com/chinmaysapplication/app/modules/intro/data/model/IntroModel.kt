package com.chinmaysapplication.app.modules.intro.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class IntroModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUpTodo: String? = MyApp.getInstance().resources.getString(R.string.lbl_uptodo)

)
