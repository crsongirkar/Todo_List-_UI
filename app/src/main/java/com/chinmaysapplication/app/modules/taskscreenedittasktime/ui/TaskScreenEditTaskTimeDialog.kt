package com.chinmaysapplication.app.modules.taskscreenedittasktime.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogTaskScreenEditTaskTimeBinding
import com.chinmaysapplication.app.modules.taskscreenedittasktime.`data`.viewmodel.TaskScreenEditTaskTimeVM
import kotlin.String
import kotlin.Unit

class TaskScreenEditTaskTimeDialog :
    BaseDialogFragment<DialogTaskScreenEditTaskTimeBinding>(R.layout.dialog_task_screen_edit_task_time)
    {
  private val viewModel: TaskScreenEditTaskTimeVM by viewModels<TaskScreenEditTaskTimeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.taskScreenEditTaskTimeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_EDIT_TASK_TIME_DIALOG"

  }
}
