package com.chinmaysapplication.app.modules.onboading.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.onboading.`data`.model.OnboadingModel
import org.koin.core.KoinComponent

class OnboadingVM : ViewModel(), KoinComponent {
  val onboadingModel: MutableLiveData<OnboadingModel> = MutableLiveData(OnboadingModel())

  var navArguments: Bundle? = null
}
