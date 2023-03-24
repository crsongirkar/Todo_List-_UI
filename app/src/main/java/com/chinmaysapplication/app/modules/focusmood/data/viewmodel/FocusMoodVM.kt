package com.chinmaysapplication.app.modules.focusmood.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.focusmood.`data`.model.FocusMoodModel
import com.chinmaysapplication.app.modules.focusmood.`data`.model.FocusMoodRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FocusMoodVM : ViewModel(), KoinComponent {
  val focusMoodModel: MutableLiveData<FocusMoodModel> = MutableLiveData(FocusMoodModel())

  var navArguments: Bundle? = null

  val focusMoodList: MutableLiveData<MutableList<FocusMoodRowModel>> =
      MutableLiveData(mutableListOf())
}
