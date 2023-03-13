package com.chinmaysapplication.app.modules.calandarscreenconpleted.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityCalandarScreenConpletedBinding
import com.chinmaysapplication.app.modules.calandarscreenconpleted.`data`.viewmodel.CalandarScreenConpletedVM
import kotlin.String
import kotlin.Unit

class CalandarScreenConpletedActivity :
    BaseActivity<ActivityCalandarScreenConpletedBinding>(R.layout.activity_calandar_screen_conpleted)
    {
  private val viewModel: CalandarScreenConpletedVM by viewModels<CalandarScreenConpletedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.calandarScreenConpletedVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_CONPLETED_ACTIVITY"

  }
}
