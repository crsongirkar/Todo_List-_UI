package com.chinmaysapplication.app.modules.intro.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityIntroBinding
import com.chinmaysapplication.app.modules.intro.`data`.viewmodel.IntroVM
import kotlin.String
import kotlin.Unit

class IntroActivity : BaseActivity<ActivityIntroBinding>(R.layout.activity_intro) {
  private val viewModel: IntroVM by viewModels<IntroVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "INTRO_ACTIVITY"

  }
}
