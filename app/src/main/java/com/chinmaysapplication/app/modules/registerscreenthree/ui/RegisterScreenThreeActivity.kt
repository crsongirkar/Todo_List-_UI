package com.chinmaysapplication.app.modules.registerscreenthree.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.googleauth.GoogleHelper
import com.chinmaysapplication.app.databinding.ActivityRegisterScreenThreeBinding
import com.chinmaysapplication.app.modules.registerscreenthree.`data`.viewmodel.RegisterScreenThreeVM
import kotlin.String
import kotlin.Unit

class RegisterScreenThreeActivity :
    BaseActivity<ActivityRegisterScreenThreeBinding>(R.layout.activity_register_screen_three) {
  private val viewModel: RegisterScreenThreeVM by viewModels<RegisterScreenThreeVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerScreenThreeVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearGoogle.setOnClickListener {
        googleLogin.login()
      }
    }

    companion object {
      const val TAG: String = "REGISTER_SCREEN_THREE_ACTIVITY"

    }
  }
