package com.chinmaysapplication.app.modules.homescreenaddtasktasktitle.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityHomeScreenAddTaskTaskTitleBinding
import com.chinmaysapplication.app.modules.homescreenaddtasktasktitle.`data`.viewmodel.HomeScreenAddTaskTaskTitleVM
import kotlin.String
import kotlin.Unit

class HomeScreenAddTaskTaskTitleActivity :
    BaseActivity<ActivityHomeScreenAddTaskTaskTitleBinding>(R.layout.activity_home_screen_add_task_task_title)
    {
  private val viewModel: HomeScreenAddTaskTaskTitleVM by viewModels<HomeScreenAddTaskTaskTitleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenAddTaskTaskTitleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ADD_TASK_TASK_TITLE_ACTIVITY"

  }
}
