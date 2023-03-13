package com.chinmaysapplication.app.modules.calandarscreenconpleted.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreenconpleted.`data`.model.CalandarScreenConpletedModel
import org.koin.core.KoinComponent

class CalandarScreenConpletedVM : ViewModel(), KoinComponent {
  val calandarScreenConpletedModel: MutableLiveData<CalandarScreenConpletedModel> =
      MutableLiveData(CalandarScreenConpletedModel())

  var navArguments: Bundle? = null
}
