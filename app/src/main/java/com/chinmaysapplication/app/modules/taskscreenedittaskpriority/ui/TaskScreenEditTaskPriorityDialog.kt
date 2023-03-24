package com.chinmaysapplication.app.modules.taskscreenedittaskpriority.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogTaskScreenEditTaskPriorityBinding
import com.chinmaysapplication.app.modules.taskscreenedittaskpriority.`data`.model.Gridcomputer1RowModel
import com.chinmaysapplication.app.modules.taskscreenedittaskpriority.`data`.viewmodel.TaskScreenEditTaskPriorityVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TaskScreenEditTaskPriorityDialog :
    BaseDialogFragment<DialogTaskScreenEditTaskPriorityBinding>(R.layout.dialog_task_screen_edit_task_priority)
    {
  private val viewModel: TaskScreenEditTaskPriorityVM by viewModels<TaskScreenEditTaskPriorityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val gridcomputerAdapter =
    GridcomputerAdapter(viewModel.gridcomputerList.value?:mutableListOf())
    binding.recyclerGridcomputer.adapter = gridcomputerAdapter
    gridcomputerAdapter.setOnItemClickListener(
    object : GridcomputerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridcomputer1RowModel) {
        onClickRecyclerGridcomputer(view, position, item)
      }
    }
    )
    viewModel.gridcomputerList.observe(requireActivity()) {
      gridcomputerAdapter.updateData(it)
    }
    binding.taskScreenEditTaskPriorityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridcomputer(
    view: View,
    position: Int,
    item: Gridcomputer1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_EDIT_TASK_PRIORITY_DIALOG"

  }
}
