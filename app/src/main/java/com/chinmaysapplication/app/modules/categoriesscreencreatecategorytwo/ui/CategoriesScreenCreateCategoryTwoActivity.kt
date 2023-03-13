package com.chinmaysapplication.app.modules.categoriesscreencreatecategorytwo.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityCategoriesScreenCreateCategoryTwoBinding
import com.chinmaysapplication.app.modules.categoriesscreencreatecategorytwo.`data`.viewmodel.CategoriesScreenCreateCategoryTwoVM
import kotlin.String
import kotlin.Unit

class CategoriesScreenCreateCategoryTwoActivity :
    BaseActivity<ActivityCategoriesScreenCreateCategoryTwoBinding>(R.layout.activity_categories_screen_create_category_two)
    {
  private val viewModel: CategoriesScreenCreateCategoryTwoVM by
      viewModels<CategoriesScreenCreateCategoryTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoriesScreenCreateCategoryTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CATEGORIES_SCREEN_CREATE_CATEGORY_TWO_ACTIVITY"

  }
}
