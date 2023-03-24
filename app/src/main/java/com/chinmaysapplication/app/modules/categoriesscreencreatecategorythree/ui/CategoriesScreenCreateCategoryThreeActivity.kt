package com.chinmaysapplication.app.modules.categoriesscreencreatecategorythree.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityCategoriesScreenCreateCategoryThreeBinding
import com.chinmaysapplication.app.modules.categoriesscreencreatecategorythree.`data`.viewmodel.CategoriesScreenCreateCategoryThreeVM
import kotlin.String
import kotlin.Unit

class CategoriesScreenCreateCategoryThreeActivity :
    BaseActivity<ActivityCategoriesScreenCreateCategoryThreeBinding>(R.layout.activity_categories_screen_create_category_three)
    {
  private val viewModel: CategoriesScreenCreateCategoryThreeVM by
      viewModels<CategoriesScreenCreateCategoryThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoriesScreenCreateCategoryThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CATEGORIES_SCREEN_CREATE_CATEGORY_THREE_ACTIVITY"

  }
}
