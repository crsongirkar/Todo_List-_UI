package com.chinmaysapplication.app.modules.taskscreeneditcategory.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogTaskScreenEditCategoryBinding
import com.chinmaysapplication.app.modules.taskscreeneditcategory.`data`.model.Listvector1RowModel
import com.chinmaysapplication.app.modules.taskscreeneditcategory.`data`.viewmodel.TaskScreenEditCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TaskScreenEditCategoryDialog :
    BaseDialogFragment<DialogTaskScreenEditCategoryBinding>(R.layout.dialog_task_screen_edit_category)
    {
  private val viewModel: TaskScreenEditCategoryVM by viewModels<TaskScreenEditCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listvectorAdapter = ListvectorAdapter(viewModel.listvectorList.value?:mutableListOf())
    binding.recyclerListvector.adapter = listvectorAdapter
    listvectorAdapter.setOnItemClickListener(
    object : ListvectorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listvector1RowModel) {
        onClickRecyclerListvector(view, position, item)
      }
    }
    )
    viewModel.listvectorList.observe(requireActivity()) {
      listvectorAdapter.updateData(it)
    }
    binding.taskScreenEditCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListvector(
    view: View,
    position: Int,
    item: Listvector1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TASK_SCREEN_EDIT_CATEGORY_DIALOG"

  }
}
