package com.chinmaysapplication.app.modules.calandarscreenaddtasktaskdescription.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskdescription.`data`.model.CalandarScreenAddTaskTaskDescriptionModel
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskdescription.`data`.model.Listellipsefifteen1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalandarScreenAddTaskTaskDescriptionVM : ViewModel(), KoinComponent {
  val calandarScreenAddTaskTaskDescriptionModel:
      MutableLiveData<CalandarScreenAddTaskTaskDescriptionModel> =
      MutableLiveData(CalandarScreenAddTaskTaskDescriptionModel())

  var navArguments: Bundle? = null

  val listellipsefifteenList: MutableLiveData<MutableList<Listellipsefifteen1RowModel>> =
      MutableLiveData(mutableListOf())
}
