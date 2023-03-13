package com.chinmaysapplication.app.modules.settings.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeappcolo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_app_colo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeapptypo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_app_typo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeapplang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_app_lang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImport: String? = MyApp.getInstance().resources.getString(R.string.lbl_import)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImportfromGoo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_import_from_goo2)

)
