package com.chinmaysapplication.app.modules.homescreenaddtasktaskalarmone.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogHomeScreenAddTaskTaskAlarmOneBinding
import com.chinmaysapplication.app.modules.homescreenaddtasktaskalarmone.`data`.viewmodel.HomeScreenAddTaskTaskAlarmOneVM
import kotlin.String
import kotlin.Unit

class HomeScreenAddTaskTaskAlarmOneDialog :
    BaseDialogFragment<DialogHomeScreenAddTaskTaskAlarmOneBinding>(R.layout.dialog_home_screen_add_task_task_alarm_one)
    {
  private val viewModel: HomeScreenAddTaskTaskAlarmOneVM by
      viewModels<HomeScreenAddTaskTaskAlarmOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.homeScreenAddTaskTaskAlarmOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ADD_TASK_TASK_ALARM_ONE_DIALOG"

  }
}
