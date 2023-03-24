package com.chinmaysapplication.app.modules.categoriesscreenchoosecategory.ui

import android.content.Context
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseDialogFragment
import com.chinmaysapplication.app.databinding.DialogCategoriesScreenChooseCategoryBinding
import com.chinmaysapplication.app.modules.categoriesscreenchoosecategory.`data`.model.ListvectorRowModel
import com.chinmaysapplication.app.modules.categoriesscreenchoosecategory.`data`.viewmodel.CategoriesScreenChooseCategoryVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CategoriesScreenChooseCategoryDialog :
    BaseDialogFragment<DialogCategoriesScreenChooseCategoryBinding>(R.layout.dialog_categories_screen_choose_category)
    {
  private val viewModel: CategoriesScreenChooseCategoryVM by
      viewModels<CategoriesScreenChooseCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listvectorAdapter = ListvectorAdapter(viewModel.listvectorList.value?:mutableListOf())
    binding.recyclerListvector.adapter = listvectorAdapter
    listvectorAdapter.setOnItemClickListener(
    object : ListvectorAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListvectorRowModel) {
        onClickRecyclerListvector(view, position, item)
      }
    }
    )
    viewModel.listvectorList.observe(requireActivity()) {
      listvectorAdapter.updateData(it)
    }
    binding.categoriesScreenChooseCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListvector(
    view: View,
    position: Int,
    item: ListvectorRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CATEGORIES_SCREEN_CHOOSE_CATEGORY_DIALOG"

  }
}
