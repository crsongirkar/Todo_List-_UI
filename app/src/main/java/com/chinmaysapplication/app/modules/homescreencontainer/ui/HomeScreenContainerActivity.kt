package com.chinmaysapplication.app.modules.homescreencontainer.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityHomeScreenContainerBinding
import com.chinmaysapplication.app.extensions.loadFragment
import com.chinmaysapplication.app.modules.calandarscreentoday.ui.CalandarScreenTodayFragment
import com.chinmaysapplication.app.modules.homescreen.ui.HomeScreenFragment
import com.chinmaysapplication.app.modules.homescreencontainer.`data`.viewmodel.HomeScreenContainerVM
import kotlin.String
import kotlin.Unit

class HomeScreenContainerActivity :
    BaseActivity<ActivityHomeScreenContainerBinding>(R.layout.activity_home_screen_container) {
  private val viewModel: HomeScreenContainerVM by viewModels<HomeScreenContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenContainerVM = viewModel
    val destFragment = HomeScreenFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = HomeScreenFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnvectorTwo.setOnClickListener {
      val destFragment = CalandarScreenTodayFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = CalandarScreenTodayFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
    binding.linearColumnsignal.setOnClickListener {
      val destFragment = HomeScreenFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = HomeScreenFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_CONTAINER_ACTIVITY"

  }
}
