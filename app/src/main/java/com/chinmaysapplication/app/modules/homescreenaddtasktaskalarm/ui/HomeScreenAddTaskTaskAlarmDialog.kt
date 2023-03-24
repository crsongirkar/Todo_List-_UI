package com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogHomeScreenAddTaskTaskAlarmBinding
import com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.`data`.model.ListsunRowModel
import com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.`data`.viewmodel.HomeScreenAddTaskTaskAlarmVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeScreenAddTaskTaskAlarmDialog :
    BaseDialogFragment<DialogHomeScreenAddTaskTaskAlarmBinding>(R.layout.dialog_home_screen_add_task_task_alarm)
    {
  private val viewModel: HomeScreenAddTaskTaskAlarmVM by viewModels<HomeScreenAddTaskTaskAlarmVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsunAdapter = ListsunAdapter(viewModel.listsunList.value?:mutableListOf())
    binding.recyclerListsun.adapter = listsunAdapter
    listsunAdapter.setOnItemClickListener(
    object : ListsunAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsunRowModel) {
        onClickRecyclerListsun(view, position, item)
      }
    }
    )
    viewModel.listsunList.observe(requireActivity()) {
      listsunAdapter.updateData(it)
    }
    binding.homeScreenAddTaskTaskAlarmVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsun(
    view: View,
    position: Int,
    item: ListsunRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_SCREEN_ADD_TASK_TASK_ALARM_DIALOG"

  }
}
