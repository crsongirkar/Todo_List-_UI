package com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogCalandarScreenAddTaskTaskPriorityBinding
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.`data`.model.Gridcomputer2RowModel
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.`data`.viewmodel.CalandarScreenAddTaskTaskPriorityVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalandarScreenAddTaskTaskPriorityDialog :
    BaseDialogFragment<DialogCalandarScreenAddTaskTaskPriorityBinding>(R.layout.dialog_calandar_screen_add_task_task_priority)
    {
  private val viewModel: CalandarScreenAddTaskTaskPriorityVM by
      viewModels<CalandarScreenAddTaskTaskPriorityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val gridcomputerAdapter =
    GridcomputerAdapter(viewModel.gridcomputerList.value?:mutableListOf())
    binding.recyclerGridcomputer.adapter = gridcomputerAdapter
    gridcomputerAdapter.setOnItemClickListener(
    object : GridcomputerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Gridcomputer2RowModel) {
        onClickRecyclerGridcomputer(view, position, item)
      }
    }
    )
    viewModel.gridcomputerList.observe(requireActivity()) {
      gridcomputerAdapter.updateData(it)
    }
    binding.calandarScreenAddTaskTaskPriorityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridcomputer(
    view: View,
    position: Int,
    item: Gridcomputer2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_ADD_TASK_TASK_PRIORITY_DIALOG"

  }
}
