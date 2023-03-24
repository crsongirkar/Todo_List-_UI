package com.chinmaysapplication.app.modules.profilechangeprofileimage.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileChangeProfileImageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangeaccount: String? =
      MyApp.getInstance().resources.getString(R.string.msg_change_account3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTackpicture: String? = MyApp.getInstance().resources.getString(R.string.lbl_tack_picture)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImportfromgal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_import_from_gal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtImportfromGoo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_import_from_goo)

)
