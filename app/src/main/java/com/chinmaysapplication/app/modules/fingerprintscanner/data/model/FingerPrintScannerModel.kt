package com.chinmaysapplication.app.modules.fingerprintscanner.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FingerPrintScannerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseholdyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_hold_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)

)
