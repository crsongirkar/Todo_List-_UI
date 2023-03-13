package com.chinmaysapplication.app.modules.taskscreeneditcategory.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.taskscreeneditcategory.`data`.model.Listvector1RowModel
import com.chinmaysapplication.app.modules.taskscreeneditcategory.`data`.model.TaskScreenEditCategoryModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TaskScreenEditCategoryVM : ViewModel(), KoinComponent {
  val taskScreenEditCategoryModel: MutableLiveData<TaskScreenEditCategoryModel> =
      MutableLiveData(TaskScreenEditCategoryModel())

  var navArguments: Bundle? = null

  val listvectorList: MutableLiveData<MutableList<Listvector1RowModel>> =
      MutableLiveData(mutableListOf())
}
