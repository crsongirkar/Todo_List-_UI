package com.chinmaysapplication.app.modules.taskscreenedittask.ui

import android.view.View
import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.views.TimePickerFragment
import com.chinmaysapplication.app.databinding.ActivityTaskScreenEditTaskBinding
import com.chinmaysapplication.app.modules.taskscreenedittask.`data`.model.ListlocationRowModel
import com.chinmaysapplication.app.modules.taskscreenedittask.`data`.viewmodel.TaskScreenEditTaskVM
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TaskScreenEditTaskActivity :
    BaseActivity<ActivityTaskScreenEditTaskBinding>(R.layout.activity_task_screen_edit_task) {
  private val viewModel: TaskScreenEditTaskVM by viewModels<TaskScreenEditTaskVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlocationAdapter =
    ListlocationAdapter(viewModel.listlocationList.value?:mutableListOf())
    binding.recyclerListlocation.adapter = listlocationAdapter
    listlocationAdapter.setOnItemClickListener(
    object : ListlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlocationRowModel) {
        onClickRecyclerListlocation(view, position, item)
      }
    }
    )
    viewModel.listlocationList.observe(this) {
      listlocationAdapter.updateData(it)
    }
    binding.taskScreenEditTaskVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowclock.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowclock(selectedTime)
      }
    }
    binding.btnClose.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListlocation(
    view: View,
    position: Int,
    item: ListlocationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onTimeSelectedLinearRowclock(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_EDIT_TASK_ACTIVITY"

  }
}
