package com.chinmaysapplication.app.modules.fingerprintscanner.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.fingerprintscanner.`data`.model.FingerPrintScannerModel
import org.koin.core.KoinComponent

class FingerPrintScannerVM : ViewModel(), KoinComponent {
  val fingerPrintScannerModel: MutableLiveData<FingerPrintScannerModel> =
      MutableLiveData(FingerPrintScannerModel())

  var navArguments: Bundle? = null
}
