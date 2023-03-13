package com.chinmaysapplication.app.modules.calandarscreenaddtasktaskdescription.ui

import android.view.View
import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityCalandarScreenAddTaskTaskDescriptionBinding
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskdescription.`data`.model.Listellipsefifteen1RowModel
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskdescription.`data`.viewmodel.CalandarScreenAddTaskTaskDescriptionVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalandarScreenAddTaskTaskDescriptionActivity :
    BaseActivity<ActivityCalandarScreenAddTaskTaskDescriptionBinding>(R.layout.activity_calandar_screen_add_task_task_description)
    {
  private val viewModel: CalandarScreenAddTaskTaskDescriptionVM by
      viewModels<CalandarScreenAddTaskTaskDescriptionVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipsefifteen1RowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(this) {
      listellipsefifteenAdapter.updateData(it)
    }
    binding.calandarScreenAddTaskTaskDescriptionVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: Listellipsefifteen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_ADD_TASK_TASK_DESCRIPTION_ACTIVITY"

  }
}
