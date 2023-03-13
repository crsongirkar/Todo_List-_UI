package com.chinmaysapplication.app.modules.loginscreentwo.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.googleauth.GoogleHelper
import com.chinmaysapplication.app.databinding.ActivityLoginScreenTwoBinding
import com.chinmaysapplication.app.modules.loginscreentwo.`data`.viewmodel.LoginScreenTwoVM
import kotlin.String
import kotlin.Unit

class LoginScreenTwoActivity :
    BaseActivity<ActivityLoginScreenTwoBinding>(R.layout.activity_login_screen_two) {
  private val viewModel: LoginScreenTwoVM by viewModels<LoginScreenTwoVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginScreenTwoVM = viewModel
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
      const val TAG: String = "LOGIN_SCREEN_TWO_ACTIVITY"

    }
  }
