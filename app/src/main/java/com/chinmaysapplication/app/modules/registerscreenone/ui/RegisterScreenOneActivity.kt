package com.chinmaysapplication.app.modules.registerscreenone.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.googleauth.GoogleHelper
import com.chinmaysapplication.app.databinding.ActivityRegisterScreenOneBinding
import com.chinmaysapplication.app.modules.registerscreenone.`data`.viewmodel.RegisterScreenOneVM
import kotlin.String
import kotlin.Unit

class RegisterScreenOneActivity :
    BaseActivity<ActivityRegisterScreenOneBinding>(R.layout.activity_register_screen_one) {
  private val viewModel: RegisterScreenOneVM by viewModels<RegisterScreenOneVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerScreenOneVM = viewModel
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
      const val TAG: String = "REGISTER_SCREEN_ONE_ACTIVITY"

    }
  }
