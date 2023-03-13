package com.chinmaysapplication.app.modules.focusmood.ui

import android.view.View
import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.databinding.ActivityFocusMoodBinding
import com.chinmaysapplication.app.modules.focusmood.`data`.model.FocusMoodRowModel
import com.chinmaysapplication.app.modules.focusmood.`data`.viewmodel.FocusMoodVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FocusMoodActivity : BaseActivity<ActivityFocusMoodBinding>(R.layout.activity_focus_mood) {
  private val viewModel: FocusMoodVM by viewModels<FocusMoodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val focusMoodAdapter = FocusMoodAdapter(viewModel.focusMoodList.value?:mutableListOf())
    binding.recyclerFocusMood.adapter = focusMoodAdapter
    focusMoodAdapter.setOnItemClickListener(
    object : FocusMoodAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FocusMoodRowModel) {
        onClickRecyclerFocusMood(view, position, item)
      }
    }
    )
    viewModel.focusMoodList.observe(this) {
      focusMoodAdapter.updateData(it)
    }
    binding.focusMoodVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerFocusMood(
    view: View,
    position: Int,
    item: FocusMoodRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOCUS_MOOD_ACTIVITY"

  }
}
