package com.chinmaysapplication.app.modules.fingerprintscannererror.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FingerPrintScannerErrorModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourfingerprin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_fingerprin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)

)
