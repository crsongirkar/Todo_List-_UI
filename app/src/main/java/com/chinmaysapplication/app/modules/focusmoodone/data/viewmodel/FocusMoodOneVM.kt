package com.chinmaysapplication.app.modules.focusmoodone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.focusmoodone.`data`.model.FocusMoodOneModel
import com.chinmaysapplication.app.modules.focusmoodone.`data`.model.FocusMoodOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FocusMoodOneVM : ViewModel(), KoinComponent {
  val focusMoodOneModel: MutableLiveData<FocusMoodOneModel> = MutableLiveData(FocusMoodOneModel())

  var navArguments: Bundle? = null

  val focusMoodOneList: MutableLiveData<MutableList<FocusMoodOneRowModel>> =
      MutableLiveData(mutableListOf())
}
