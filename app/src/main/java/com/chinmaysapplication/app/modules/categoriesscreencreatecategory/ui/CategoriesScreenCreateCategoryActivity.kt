package com.chinmaysapplication.app.modules.categoriesscreencreatecategory.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityCategoriesScreenCreateCategoryBinding
import com.chinmaysapplication.app.modules.categoriesscreencreatecategory.`data`.viewmodel.CategoriesScreenCreateCategoryVM
import kotlin.String
import kotlin.Unit

class CategoriesScreenCreateCategoryActivity :
    BaseActivity<ActivityCategoriesScreenCreateCategoryBinding>(R.layout.activity_categories_screen_create_category)
    {
  private val viewModel: CategoriesScreenCreateCategoryVM by
      viewModels<CategoriesScreenCreateCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoriesScreenCreateCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CATEGORIES_SCREEN_CREATE_CATEGORY_ACTIVITY"

  }
}
