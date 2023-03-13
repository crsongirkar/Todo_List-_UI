package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.`data`.model.CalandarScreenAddTaskChooseCategoryModel
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.`data`.model.Listvector2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalandarScreenAddTaskChooseCategoryVM : ViewModel(), KoinComponent {
  val calandarScreenAddTaskChooseCategoryModel:
      MutableLiveData<CalandarScreenAddTaskChooseCategoryModel> =
      MutableLiveData(CalandarScreenAddTaskChooseCategoryModel())

  var navArguments: Bundle? = null

  val listvectorList: MutableLiveData<MutableList<Listvector2RowModel>> =
      MutableLiveData(mutableListOf())
}
