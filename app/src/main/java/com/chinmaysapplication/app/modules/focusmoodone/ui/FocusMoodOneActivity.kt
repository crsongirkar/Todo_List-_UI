package com.chinmaysapplication.app.modules.focusmoodone.ui

import android.view.View
import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityFocusMoodOneBinding
import com.chinmaysapplication.app.modules.focusmoodone.`data`.model.FocusMoodOneRowModel
import com.chinmaysapplication.app.modules.focusmoodone.`data`.viewmodel.FocusMoodOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FocusMoodOneActivity :
    BaseActivity<ActivityFocusMoodOneBinding>(R.layout.activity_focus_mood_one) {
  private val viewModel: FocusMoodOneVM by viewModels<FocusMoodOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val focusMoodOneAdapter =
    FocusMoodOneAdapter(viewModel.focusMoodOneList.value?:mutableListOf())
    binding.recyclerFocusMoodOne.adapter = focusMoodOneAdapter
    focusMoodOneAdapter.setOnItemClickListener(
    object : FocusMoodOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FocusMoodOneRowModel) {
        onClickRecyclerFocusMoodOne(view, position, item)
      }
    }
    )
    viewModel.focusMoodOneList.observe(this) {
      focusMoodOneAdapter.updateData(it)
    }
    binding.focusMoodOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerFocusMoodOne(
    view: View,
    position: Int,
    item: FocusMoodOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOCUS_MOOD_ONE_ACTIVITY"

  }
}
