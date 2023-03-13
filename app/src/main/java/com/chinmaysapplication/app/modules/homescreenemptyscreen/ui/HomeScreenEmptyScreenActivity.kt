package com.chinmaysapplication.app.modules.homescreenemptyscreen.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityHomeScreenEmptyScreenBinding
import com.chinmaysapplication.app.modules.homescreenemptyscreen.`data`.viewmodel.HomeScreenEmptyScreenVM
import kotlin.String
import kotlin.Unit

class HomeScreenEmptyScreenActivity :
    BaseActivity<ActivityHomeScreenEmptyScreenBinding>(R.layout.activity_home_screen_empty_screen) {
  private val viewModel: HomeScreenEmptyScreenVM by viewModels<HomeScreenEmptyScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenEmptyScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_EMPTY_SCREEN_ACTIVITY"

  }
}
