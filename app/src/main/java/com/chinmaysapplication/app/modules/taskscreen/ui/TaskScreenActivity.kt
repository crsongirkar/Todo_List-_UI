package com.chinmaysapplication.app.modules.taskscreen.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.views.TimePickerFragment
import com.chinmaysapplication.app.databinding.ActivityTaskScreenBinding
import com.chinmaysapplication.app.modules.taskscreen.`data`.viewmodel.TaskScreenVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class TaskScreenActivity : BaseActivity<ActivityTaskScreenBinding>(R.layout.activity_task_screen) {
  private val viewModel: TaskScreenVM by viewModels<TaskScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.taskScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      finish()
    }
    binding.linearRowclock.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowclock(selectedTime)
      }
    }
  }

  private fun onTimeSelectedLinearRowclock(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_ACTIVITY"

  }
}
