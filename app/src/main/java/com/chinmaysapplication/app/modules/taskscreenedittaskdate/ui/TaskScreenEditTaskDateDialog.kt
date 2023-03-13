package com.chinmaysapplication.app.modules.taskscreenedittaskdate.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogTaskScreenEditTaskDateBinding
import com.chinmaysapplication.app.modules.taskscreenedittaskdate.`data`.model.Listsun1RowModel
import com.chinmaysapplication.app.modules.taskscreenedittaskdate.`data`.viewmodel.TaskScreenEditTaskDateVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TaskScreenEditTaskDateDialog :
    BaseDialogFragment<DialogTaskScreenEditTaskDateBinding>(R.layout.dialog_task_screen_edit_task_date)
    {
  private val viewModel: TaskScreenEditTaskDateVM by viewModels<TaskScreenEditTaskDateVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsunAdapter = ListsunAdapter(viewModel.listsunList.value?:mutableListOf())
    binding.recyclerListsun.adapter = listsunAdapter
    listsunAdapter.setOnItemClickListener(
    object : ListsunAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsun1RowModel) {
        onClickRecyclerListsun(view, position, item)
      }
    }
    )
    viewModel.listsunList.observe(requireActivity()) {
      listsunAdapter.updateData(it)
    }
    binding.taskScreenEditTaskDateVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsun(
    view: View,
    position: Int,
    item: Listsun1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_EDIT_TASK_DATE_DIALOG"

  }
}
