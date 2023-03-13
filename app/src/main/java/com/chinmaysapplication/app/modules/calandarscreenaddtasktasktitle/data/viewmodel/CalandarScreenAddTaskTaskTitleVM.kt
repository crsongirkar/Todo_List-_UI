package com.chinmaysapplication.app.modules.calandarscreenaddtasktasktitle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreenaddtasktasktitle.`data`.model.CalandarScreenAddTaskTaskTitleModel
import org.koin.core.KoinComponent

class CalandarScreenAddTaskTaskTitleVM : ViewModel(), KoinComponent {
  val calandarScreenAddTaskTaskTitleModel: MutableLiveData<CalandarScreenAddTaskTaskTitleModel> =
      MutableLiveData(CalandarScreenAddTaskTaskTitleModel())

  var navArguments: Bundle? = null
}
