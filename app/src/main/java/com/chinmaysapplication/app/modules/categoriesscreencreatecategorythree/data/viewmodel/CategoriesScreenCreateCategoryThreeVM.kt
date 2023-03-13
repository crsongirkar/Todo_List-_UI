package com.chinmaysapplication.app.modules.categoriesscreencreatecategorythree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.categoriesscreencreatecategorythree.`data`.model.CategoriesScreenCreateCategoryThreeModel
import org.koin.core.KoinComponent

class CategoriesScreenCreateCategoryThreeVM : ViewModel(), KoinComponent {
  val categoriesScreenCreateCategoryThreeModel:
      MutableLiveData<CategoriesScreenCreateCategoryThreeModel> =
      MutableLiveData(CategoriesScreenCreateCategoryThreeModel())

  var navArguments: Bundle? = null
}
