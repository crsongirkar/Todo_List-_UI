package com.chinmaysapplication.app.modules.loginscreen.ui

import androidx.activity.viewModels
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.base.BaseActivity
import com.chinmaysapplication.app.appcomponents.googleauth.GoogleHelper
import com.chinmaysapplication.app.databinding.ActivityLoginScreenBinding
import com.chinmaysapplication.app.modules.loginscreen.`data`.viewmodel.LoginScreenVM
import kotlin.String
import kotlin.Unit

class LoginScreenActivity : BaseActivity<ActivityLoginScreenBinding>(R.layout.activity_login_screen)
    {
  private val viewModel: LoginScreenVM by viewModels<LoginScreenVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginScreenVM = viewModel
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
      const val TAG: String = "LOGIN_SCREEN_ACTIVITY"

    }
  }
