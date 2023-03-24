package com.chinmaysapplication.app.modules.categoriesscreencreatecategoryone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.categoriesscreencreatecategoryone.`data`.model.CategoriesScreenCreateCategoryOneModel
import org.koin.core.KoinComponent

class CategoriesScreenCreateCategoryOneVM : ViewModel(), KoinComponent {
  val categoriesScreenCreateCategoryOneModel:
      MutableLiveData<CategoriesScreenCreateCategoryOneModel> =
      MutableLiveData(CategoriesScreenCreateCategoryOneModel())

  var navArguments: Bundle? = null
}
