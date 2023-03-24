package com.chinmaysapplication.app.modules.startscreen.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityStartScreenBinding
import com.chinmaysapplication.app.modules.startscreen.`data`.viewmodel.StartScreenVM
import kotlin.String
import kotlin.Unit

class StartScreenActivity : BaseActivity<ActivityStartScreenBinding>(R.layout.activity_start_screen)
    {
  private val viewModel: StartScreenVM by viewModels<StartScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.startScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "START_SCREEN_ACTIVITY"

  }
}
