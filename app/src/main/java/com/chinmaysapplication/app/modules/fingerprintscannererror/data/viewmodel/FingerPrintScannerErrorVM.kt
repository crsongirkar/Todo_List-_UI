package com.chinmaysapplication.app.modules.fingerprintscannererror.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.fingerprintscannererror.`data`.model.FingerPrintScannerErrorModel
import org.koin.core.KoinComponent

class FingerPrintScannerErrorVM : ViewModel(), KoinComponent {
  val fingerPrintScannerErrorModel: MutableLiveData<FingerPrintScannerErrorModel> =
      MutableLiveData(FingerPrintScannerErrorModel())

  var navArguments: Bundle? = null
}
