package com.chinmaysapplication.app.modules.profilechangename.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.chinmaysapplication.app.databinding.ActivityProfileChangeNameBinding
import com.chinmaysapplication.app.modules.profilechangename.`data`.viewmodel.ProfileChangeNameVM
import kotlin.String
import kotlin.Unit

class ProfileChangeNameActivity :
    BaseActivity<ActivityProfileChangeNameBinding>(R.layout.activity_profile_change_name) {
  private val viewModel: ProfileChangeNameVM by viewModels<ProfileChangeNameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileChangeNameVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  companion object {
    const val TAG: String = "PROFILE_CHANGE_NAME_ACTIVITY"

  }
}
