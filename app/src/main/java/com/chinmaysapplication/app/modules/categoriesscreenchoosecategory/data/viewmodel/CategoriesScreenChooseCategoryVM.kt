package com.chinmaysapplication.app.modules.categoriesscreenchoosecategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.categoriesscreenchoosecategory.`data`.model.CategoriesScreenChooseCategoryModel
import com.chinmaysapplication.app.modules.categoriesscreenchoosecategory.`data`.model.ListvectorRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CategoriesScreenChooseCategoryVM : ViewModel(), KoinComponent {
  val categoriesScreenChooseCategoryModel: MutableLiveData<CategoriesScreenChooseCategoryModel> =
      MutableLiveData(CategoriesScreenChooseCategoryModel())

  var navArguments: Bundle? = null

  val listvectorList: MutableLiveData<MutableList<ListvectorRowModel>> =
      MutableLiveData(mutableListOf())
}
