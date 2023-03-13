package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogCalandarScreenAddTaskChooseCategoryBinding
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.`data`.model.Listvector2RowModel
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.`data`.viewmodel.CalandarScreenAddTaskChooseCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalandarScreenAddTaskChooseCategoryDialog :
    BaseDialogFragment<DialogCalandarScreenAddTaskChooseCategoryBinding>(R.layout.dialog_calandar_screen_add_task_choose_category)
    {
  private val viewModel: CalandarScreenAddTaskChooseCategoryVM by
      viewModels<CalandarScreenAddTaskChooseCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listvectorAdapter = ListvectorAdapter(viewModel.listvectorList.value?:mutableListOf())
    binding.recyclerListvector.adapter = listvectorAdapter
    listvectorAdapter.setOnItemClickListener(
    object : ListvectorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listvector2RowModel) {
        onClickRecyclerListvector(view, position, item)
      }
    }
    )
    viewModel.listvectorList.observe(requireActivity()) {
      listvectorAdapter.updateData(it)
    }
    binding.calandarScreenAddTaskChooseCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListvector(
    view: View,
    position: Int,
    item: Listvector2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_ADD_TASK_CHOOSE_CATEGORY_DIALOG"

  }
}
