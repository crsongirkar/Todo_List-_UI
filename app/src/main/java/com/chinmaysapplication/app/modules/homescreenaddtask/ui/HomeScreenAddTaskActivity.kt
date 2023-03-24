package com.chinmaysapplication.app.modules.homescreenaddtask.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityHomeScreenAddTaskBinding
import com.chinmaysapplication.app.modules.homescreenaddtask.`data`.viewmodel.HomeScreenAddTaskVM
import kotlin.String
import kotlin.Unit

class HomeScreenAddTaskActivity :
    BaseActivity<ActivityHomeScreenAddTaskBinding>(R.layout.activity_home_screen_add_task) {
  private val viewModel: HomeScreenAddTaskVM by viewModels<HomeScreenAddTaskVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenAddTaskVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ADD_TASK_ACTIVITY"

  }
}
