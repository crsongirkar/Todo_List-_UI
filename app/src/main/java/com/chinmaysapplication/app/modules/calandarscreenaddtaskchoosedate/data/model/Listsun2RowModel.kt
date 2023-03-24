package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listsun2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSUN: String? = MyApp.getInstance().resources.getString(R.string.lbl_sun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentySeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_27)

)
