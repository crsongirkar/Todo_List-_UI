package com.chinmaysapplication.app.modules.onboadingone.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityOnboadingOneBinding
import com.chinmaysapplication.app.modules.onboadingone.`data`.viewmodel.OnboadingOneVM
import kotlin.String
import kotlin.Unit

class OnboadingOneActivity :
    BaseActivity<ActivityOnboadingOneBinding>(R.layout.activity_onboading_one) {
  private val viewModel: OnboadingOneVM by viewModels<OnboadingOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboadingOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOADING_ONE_ACTIVITY"

  }
}
