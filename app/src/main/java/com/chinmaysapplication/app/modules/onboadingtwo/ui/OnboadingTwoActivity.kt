package com.chinmaysapplication.app.modules.onboadingtwo.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityOnboadingTwoBinding
import com.chinmaysapplication.app.modules.onboadingtwo.`data`.viewmodel.OnboadingTwoVM
import kotlin.String
import kotlin.Unit

class OnboadingTwoActivity :
    BaseActivity<ActivityOnboadingTwoBinding>(R.layout.activity_onboading_two) {
  private val viewModel: OnboadingTwoVM by viewModels<OnboadingTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboadingTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOADING_TWO_ACTIVITY"

  }
}
