package com.chinmaysapplication.app.modules.onboadingtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.onboadingtwo.`data`.model.OnboadingTwoModel
import org.koin.core.KoinComponent

class OnboadingTwoVM : ViewModel(), KoinComponent {
  val onboadingTwoModel: MutableLiveData<OnboadingTwoModel> = MutableLiveData(OnboadingTwoModel())

  var navArguments: Bundle? = null
}
