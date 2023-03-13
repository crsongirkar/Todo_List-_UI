package com.chinmaysapplication.app.modules.categoriesscreencreatecategorytwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.categoriesscreencreatecategorytwo.`data`.model.CategoriesScreenCreateCategoryTwoModel
import org.koin.core.KoinComponent

class CategoriesScreenCreateCategoryTwoVM : ViewModel(), KoinComponent {
  val categoriesScreenCreateCategoryTwoModel:
      MutableLiveData<CategoriesScreenCreateCategoryTwoModel> =
      MutableLiveData(CategoriesScreenCreateCategoryTwoModel())

  var navArguments: Bundle? = null
}
