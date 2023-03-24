package com.chinmaysapplication.app.modules.homescreen.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseFragment
import com.chinmaysapplication.app.databinding.FragmentHomeScreenBinding
import com.chinmaysapplication.app.modules.homescreen.`data`.model.HomeScreenRowModel
import com.chinmaysapplication.app.modules.homescreen.`data`.viewmodel.HomeScreenVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeScreenFragment : BaseFragment<FragmentHomeScreenBinding>(R.layout.fragment_home_screen) {
  private val viewModel: HomeScreenVM by viewModels<HomeScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val homeScreenAdapter = HomeScreenAdapter(viewModel.homeScreenList.value?:mutableListOf())
    binding.recyclerHomeScreen.adapter = homeScreenAdapter
    homeScreenAdapter.setOnItemClickListener(
    object : HomeScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomeScreenRowModel) {
        onClickRecyclerHomeScreen(view, position, item)
      }
    }
    )
    viewModel.homeScreenList.observe(requireActivity()) {
      homeScreenAdapter.updateData(it)
    }
    binding.homeScreenVM = viewModel
    setUpSearchViewSearchBarListener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHomeScreen(
    view: View,
    position: Int,
    item: HomeScreenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchBarListener(): Unit {
    binding.searchViewSearchBar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_SCREEN_FRAGMENT"


      fun getInstance(bundle: Bundle?): HomeScreenFragment {
        val fragment = HomeScreenFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
