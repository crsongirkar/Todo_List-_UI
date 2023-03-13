package com.chinmaysapplication.app.modules.calandarscreentoday.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreentoday.`data`.model.CalandarScreenTodayModel
import com.chinmaysapplication.app.modules.calandarscreentoday.`data`.model.ListellipsefifteenRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalandarScreenTodayVM : ViewModel(), KoinComponent {
  val calandarScreenTodayModel: MutableLiveData<CalandarScreenTodayModel> =
      MutableLiveData(CalandarScreenTodayModel())

  var navArguments: Bundle? = null

  val listellipsefifteenList: MutableLiveData<MutableList<ListellipsefifteenRowModel>> =
      MutableLiveData(mutableListOf())
}
