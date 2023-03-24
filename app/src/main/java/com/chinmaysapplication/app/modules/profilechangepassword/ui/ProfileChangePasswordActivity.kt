package com.chinmaysapplication.app.modules.profilechangepassword.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.chinmaysapplication.app.databinding.ActivityProfileChangePasswordBinding
import com.chinmaysapplication.app.modules.profilechangepassword.`data`.viewmodel.ProfileChangePasswordVM
import kotlin.String
import kotlin.Unit

class ProfileChangePasswordActivity :
    BaseActivity<ActivityProfileChangePasswordBinding>(R.layout.activity_profile_change_password) {
  private val viewModel: ProfileChangePasswordVM by viewModels<ProfileChangePasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileChangePasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  companion object {
    const val TAG: String = "PROFILE_CHANGE_PASSWORD_ACTIVITY"

  }
}
