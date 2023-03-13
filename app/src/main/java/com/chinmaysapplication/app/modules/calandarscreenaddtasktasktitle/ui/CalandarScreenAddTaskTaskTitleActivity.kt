package com.chinmaysapplication.app.modules.calandarscreenaddtasktasktitle.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityCalandarScreenAddTaskTaskTitleBinding
import com.chinmaysapplication.app.modules.calandarscreenaddtasktasktitle.`data`.viewmodel.CalandarScreenAddTaskTaskTitleVM
import kotlin.String
import kotlin.Unit

class CalandarScreenAddTaskTaskTitleActivity :
    BaseActivity<ActivityCalandarScreenAddTaskTaskTitleBinding>(R.layout.activity_calandar_screen_add_task_task_title)
    {
  private val viewModel: CalandarScreenAddTaskTaskTitleVM by
      viewModels<CalandarScreenAddTaskTaskTitleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.calandarScreenAddTaskTaskTitleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_ADD_TASK_TASK_TITLE_ACTIVITY"

  }
}
