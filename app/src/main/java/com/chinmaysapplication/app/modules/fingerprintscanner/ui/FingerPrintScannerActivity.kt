package com.chinmaysapplication.app.modules.fingerprintscanner.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityFingerPrintScannerBinding
import com.chinmaysapplication.app.modules.fingerprintscanner.`data`.viewmodel.FingerPrintScannerVM
import kotlin.String
import kotlin.Unit

class FingerPrintScannerActivity :
    BaseActivity<ActivityFingerPrintScannerBinding>(R.layout.activity_finger_print_scanner) {
  private val viewModel: FingerPrintScannerVM by viewModels<FingerPrintScannerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fingerPrintScannerVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FINGER_PRINT_SCANNER_ACTIVITY"

  }
}
