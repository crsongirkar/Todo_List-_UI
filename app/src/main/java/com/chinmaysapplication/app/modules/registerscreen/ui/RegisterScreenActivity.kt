package com.chinmaysapplication.app.modules.registerscreen.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.googleauth.GoogleHelper
import com.chinmaysapplication.app.databinding.ActivityRegisterScreenBinding
import com.chinmaysapplication.app.modules.registerscreen.`data`.viewmodel.RegisterScreenVM
import kotlin.String
import kotlin.Unit

class RegisterScreenActivity :
    BaseActivity<ActivityRegisterScreenBinding>(R.layout.activity_register_screen) {
  private val viewModel: RegisterScreenVM by viewModels<RegisterScreenVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerScreenVM = viewModel
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
      const val TAG: String = "REGISTER_SCREEN_ACTIVITY"

    }
  }
