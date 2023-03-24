package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosetime.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogCalandarScreenAddTaskChooseTimeBinding
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosetime.`data`.viewmodel.CalandarScreenAddTaskChooseTimeVM
import kotlin.String
import kotlin.Unit

class CalandarScreenAddTaskChooseTimeDialog :
    BaseDialogFragment<DialogCalandarScreenAddTaskChooseTimeBinding>(R.layout.dialog_calandar_screen_add_task_choose_time)
    {
  private val viewModel: CalandarScreenAddTaskChooseTimeVM by
      viewModels<CalandarScreenAddTaskChooseTimeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.calandarScreenAddTaskChooseTimeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_ADD_TASK_CHOOSE_TIME_DIALOG"

  }
}
