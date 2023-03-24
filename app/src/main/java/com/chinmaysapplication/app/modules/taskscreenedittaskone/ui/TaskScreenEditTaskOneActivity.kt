package com.chinmaysapplication.app.modules.taskscreenedittaskone.ui

import android.view.View
import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.views.TimePickerFragment
import com.chinmaysapplication.app.databinding.ActivityTaskScreenEditTaskOneBinding
import com.chinmaysapplication.app.modules.taskscreenedittaskone.`data`.model.Listlocation1RowModel
import com.chinmaysapplication.app.modules.taskscreenedittaskone.`data`.viewmodel.TaskScreenEditTaskOneVM
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TaskScreenEditTaskOneActivity :
    BaseActivity<ActivityTaskScreenEditTaskOneBinding>(R.layout.activity_task_screen_edit_task_one)
    {
  private val viewModel: TaskScreenEditTaskOneVM by viewModels<TaskScreenEditTaskOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listlocationAdapter =
    ListlocationAdapter(viewModel.listlocationList.value?:mutableListOf())
    binding.recyclerListlocation.adapter = listlocationAdapter
    listlocationAdapter.setOnItemClickListener(
    object : ListlocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listlocation1RowModel) {
        onClickRecyclerListlocation(view, position, item)
      }
    }
    )
    viewModel.listlocationList.observe(this) {
      listlocationAdapter.updateData(it)
    }
    binding.taskScreenEditTaskOneVM = viewModel
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

  fun onClickRecyclerListlocation(
    view: View,
    position: Int,
    item: Listlocation1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onTimeSelectedLinearRowclock(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_EDIT_TASK_ONE_ACTIVITY"

  }
}
