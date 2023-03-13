package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogCalandarScreenAddTaskChooseDateBinding
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.`data`.model.Listsun2RowModel
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.`data`.viewmodel.CalandarScreenAddTaskChooseDateVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalandarScreenAddTaskChooseDateDialog :
    BaseDialogFragment<DialogCalandarScreenAddTaskChooseDateBinding>(R.layout.dialog_calandar_screen_add_task_choose_date)
    {
  private val viewModel: CalandarScreenAddTaskChooseDateVM by
      viewModels<CalandarScreenAddTaskChooseDateVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsunAdapter = ListsunAdapter(viewModel.listsunList.value?:mutableListOf())
    binding.recyclerListsun.adapter = listsunAdapter
    listsunAdapter.setOnItemClickListener(
    object : ListsunAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listsun2RowModel) {
        onClickRecyclerListsun(view, position, item)
      }
    }
    )
    viewModel.listsunList.observe(requireActivity()) {
      listsunAdapter.updateData(it)
    }
    binding.calandarScreenAddTaskChooseDateVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListsun(
    view: View,
    position: Int,
    item: Listsun2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_ADD_TASK_CHOOSE_DATE_DIALOG"

  }
}
