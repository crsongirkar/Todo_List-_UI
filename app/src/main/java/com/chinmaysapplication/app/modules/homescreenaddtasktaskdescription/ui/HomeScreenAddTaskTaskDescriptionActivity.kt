package com.chinmaysapplication.app.modules.homescreenaddtasktaskdescription.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityHomeScreenAddTaskTaskDescriptionBinding
import com.chinmaysapplication.app.modules.homescreenaddtasktaskdescription.`data`.viewmodel.HomeScreenAddTaskTaskDescriptionVM
import kotlin.String
import kotlin.Unit

class HomeScreenAddTaskTaskDescriptionActivity :
    BaseActivity<ActivityHomeScreenAddTaskTaskDescriptionBinding>(R.layout.activity_home_screen_add_task_task_description)
    {
  private val viewModel: HomeScreenAddTaskTaskDescriptionVM by
      viewModels<HomeScreenAddTaskTaskDescriptionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeScreenAddTaskTaskDescriptionVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ADD_TASK_TASK_DESCRIPTION_ACTIVITY"

  }
}
