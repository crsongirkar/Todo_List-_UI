package com.chinmaysapplication.app.modules.profilechangeprofileimage.ui

import androidx.fragment.app.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.chinmaysapplication.app.databinding.BottomsheetProfileChangeProfileImageBinding
import com.chinmaysapplication.app.modules.profilechangeprofileimage.`data`.viewmodel.ProfileChangeProfileImageVM
import kotlin.String
import kotlin.Unit

class ProfileChangeProfileImageBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetProfileChangeProfileImageBinding>(R.layout.bottomsheet_profile_change_profile_image)
    {
  private val viewModel: ProfileChangeProfileImageVM by viewModels<ProfileChangeProfileImageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileChangeProfileImageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_CHANGE_PROFILE_IMAGE_BOTTOMSHEET"

  }
}
