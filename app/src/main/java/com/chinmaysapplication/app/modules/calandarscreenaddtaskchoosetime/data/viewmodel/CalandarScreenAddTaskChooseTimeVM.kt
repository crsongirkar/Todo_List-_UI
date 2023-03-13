package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosetime.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosetime.`data`.model.CalandarScreenAddTaskChooseTimeModel
import org.koin.core.KoinComponent

class CalandarScreenAddTaskChooseTimeVM : ViewModel(), KoinComponent {
  val calandarScreenAddTaskChooseTimeModel: MutableLiveData<CalandarScreenAddTaskChooseTimeModel> =
      MutableLiveData(CalandarScreenAddTaskChooseTimeModel())

  var navArguments: Bundle? = null
}
