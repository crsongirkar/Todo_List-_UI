package com.chinmaysapplication.app.modules.onboadingone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.onboadingone.`data`.model.OnboadingOneModel
import org.koin.core.KoinComponent

class OnboadingOneVM : ViewModel(), KoinComponent {
  val onboadingOneModel: MutableLiveData<OnboadingOneModel> = MutableLiveData(OnboadingOneModel())

  var navArguments: Bundle? = null
}
