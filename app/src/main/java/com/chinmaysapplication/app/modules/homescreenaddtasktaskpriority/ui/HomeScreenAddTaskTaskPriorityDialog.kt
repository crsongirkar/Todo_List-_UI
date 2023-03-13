package com.chinmaysapplication.app.modules.homescreenaddtasktaskpriority.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogHomeScreenAddTaskTaskPriorityBinding
import com.chinmaysapplication.app.modules.homescreenaddtasktaskpriority.`data`.model.GridcomputerRowModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskpriority.`data`.viewmodel.HomeScreenAddTaskTaskPriorityVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeScreenAddTaskTaskPriorityDialog :
    BaseDialogFragment<DialogHomeScreenAddTaskTaskPriorityBinding>(R.layout.dialog_home_screen_add_task_task_priority)
    {
  private val viewModel: HomeScreenAddTaskTaskPriorityVM by
      viewModels<HomeScreenAddTaskTaskPriorityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val gridcomputerAdapter =
    GridcomputerAdapter(viewModel.gridcomputerList.value?:mutableListOf())
    binding.recyclerGridcomputer.adapter = gridcomputerAdapter
    gridcomputerAdapter.setOnItemClickListener(
    object : GridcomputerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridcomputerRowModel) {
        onClickRecyclerGridcomputer(view, position, item)
      }
    }
    )
    viewModel.gridcomputerList.observe(requireActivity()) {
      gridcomputerAdapter.updateData(it)
    }
    binding.homeScreenAddTaskTaskPriorityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridcomputer(
    view: View,
    position: Int,
    item: GridcomputerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ADD_TASK_TASK_PRIORITY_DIALOG"

  }
}
