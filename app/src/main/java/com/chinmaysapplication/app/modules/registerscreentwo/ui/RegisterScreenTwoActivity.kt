package com.chinmaysapplication.app.modules.registerscreentwo.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.googleauth.GoogleHelper
import com.chinmaysapplication.app.databinding.ActivityRegisterScreenTwoBinding
import com.chinmaysapplication.app.modules.registerscreentwo.`data`.viewmodel.RegisterScreenTwoVM
import kotlin.String
import kotlin.Unit

class RegisterScreenTwoActivity :
    BaseActivity<ActivityRegisterScreenTwoBinding>(R.layout.activity_register_screen_two) {
  private val viewModel: RegisterScreenTwoVM by viewModels<RegisterScreenTwoVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerScreenTwoVM = viewModel
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
      const val TAG: String = "REGISTER_SCREEN_TWO_ACTIVITY"

    }
  }
