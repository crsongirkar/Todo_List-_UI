package com.chinmaysapplication.app.modules.fingerprintscannererror.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityFingerPrintScannerErrorBinding
import com.chinmaysapplication.app.modules.fingerprintscannererror.`data`.viewmodel.FingerPrintScannerErrorVM
import kotlin.String
import kotlin.Unit

class FingerPrintScannerErrorActivity :
    BaseActivity<ActivityFingerPrintScannerErrorBinding>(R.layout.activity_finger_print_scanner_error)
    {
  private val viewModel: FingerPrintScannerErrorVM by viewModels<FingerPrintScannerErrorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.fingerPrintScannerErrorVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FINGER_PRINT_SCANNER_ERROR_ACTIVITY"

  }
}
