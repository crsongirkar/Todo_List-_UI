package com.chinmaysapplication.app.modules.taskscreendeletetask.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogTaskScreenDeleteTaskBinding
import com.chinmaysapplication.app.modules.taskscreendeletetask.`data`.viewmodel.TaskScreenDeleteTaskVM
import kotlin.String
import kotlin.Unit

class TaskScreenDeleteTaskDialog :
    BaseDialogFragment<DialogTaskScreenDeleteTaskBinding>(R.layout.dialog_task_screen_delete_task) {
  private val viewModel: TaskScreenDeleteTaskVM by viewModels<TaskScreenDeleteTaskVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.taskScreenDeleteTaskVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_DELETE_TASK_DIALOG"

  }
}
