package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.`data`.model.CalandarScreenAddTaskChooseDateModel
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.`data`.model.Listsun2RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CalandarScreenAddTaskChooseDateVM : ViewModel(), KoinComponent {
  val calandarScreenAddTaskChooseDateModel: MutableLiveData<CalandarScreenAddTaskChooseDateModel> =
      MutableLiveData(CalandarScreenAddTaskChooseDateModel())

  var navArguments: Bundle? = null

  val listsunList: MutableLiveData<MutableList<Listsun2RowModel>> = MutableLiveData(mutableListOf())
}
