package com.chinmaysapplication.app.modules.categoriesscreencreatecategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.categoriesscreencreatecategory.`data`.model.CategoriesScreenCreateCategoryModel
import org.koin.core.KoinComponent

class CategoriesScreenCreateCategoryVM : ViewModel(), KoinComponent {
  val categoriesScreenCreateCategoryModel: MutableLiveData<CategoriesScreenCreateCategoryModel> =
      MutableLiveData(CategoriesScreenCreateCategoryModel())

  var navArguments: Bundle? = null
}
