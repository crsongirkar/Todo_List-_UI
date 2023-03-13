package com.chinmaysapplication.app.modules.onboading.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityOnboadingBinding
import com.chinmaysapplication.app.modules.onboading.`data`.viewmodel.OnboadingVM
import kotlin.String
import kotlin.Unit

class OnboadingActivity : BaseActivity<ActivityOnboadingBinding>(R.layout.activity_onboading) {
  private val viewModel: OnboadingVM by viewModels<OnboadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboadingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOADING_ACTIVITY"

  }
}
