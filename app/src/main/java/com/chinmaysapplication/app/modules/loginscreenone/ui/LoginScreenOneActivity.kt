package com.chinmaysapplication.app.modules.loginscreenone.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.googleauth.GoogleHelper
import com.chinmaysapplication.app.databinding.ActivityLoginScreenOneBinding
import com.chinmaysapplication.app.modules.loginscreenone.`data`.viewmodel.LoginScreenOneVM
import kotlin.String
import kotlin.Unit

class LoginScreenOneActivity :
    BaseActivity<ActivityLoginScreenOneBinding>(R.layout.activity_login_screen_one) {
  private val viewModel: LoginScreenOneVM by viewModels<LoginScreenOneVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginScreenOneVM = viewModel
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
      const val TAG: String = "LOGIN_SCREEN_ONE_ACTIVITY"

    }
  }
