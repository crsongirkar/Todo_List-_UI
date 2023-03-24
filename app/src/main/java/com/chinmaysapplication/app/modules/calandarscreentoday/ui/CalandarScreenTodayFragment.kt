package com.chinmaysapplication.app.modules.calandarscreentoday.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseFragment
import com.chinmaysapplication.app.databinding.FragmentCalandarScreenTodayBinding
import com.chinmaysapplication.app.modules.calandarscreentoday.`data`.model.ListellipsefifteenRowModel
import com.chinmaysapplication.app.modules.calandarscreentoday.`data`.viewmodel.CalandarScreenTodayVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CalandarScreenTodayFragment :
    BaseFragment<FragmentCalandarScreenTodayBinding>(R.layout.fragment_calandar_screen_today) {
  private val viewModel: CalandarScreenTodayVM by viewModels<CalandarScreenTodayVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsefifteenRowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(requireActivity()) {
      listellipsefifteenAdapter.updateData(it)
    }
    binding.calandarScreenTodayVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: ListellipsefifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CALANDAR_SCREEN_TODAY_FRAGMENT"


    fun getInstance(bundle: Bundle?): CalandarScreenTodayFragment {
      val fragment = CalandarScreenTodayFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
