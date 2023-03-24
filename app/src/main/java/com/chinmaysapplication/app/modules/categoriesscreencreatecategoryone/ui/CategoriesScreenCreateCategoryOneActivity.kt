package com.chinmaysapplication.app.modules.categoriesscreencreatecategoryone.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityCategoriesScreenCreateCategoryOneBinding
import com.chinmaysapplication.app.modules.categoriesscreencreatecategoryone.`data`.viewmodel.CategoriesScreenCreateCategoryOneVM
import kotlin.String
import kotlin.Unit

class CategoriesScreenCreateCategoryOneActivity :
    BaseActivity<ActivityCategoriesScreenCreateCategoryOneBinding>(R.layout.activity_categories_screen_create_category_one)
    {
  private val viewModel: CategoriesScreenCreateCategoryOneVM by
      viewModels<CategoriesScreenCreateCategoryOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoriesScreenCreateCategoryOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CATEGORIES_SCREEN_CREATE_CATEGORY_ONE_ACTIVITY"

  }
}
