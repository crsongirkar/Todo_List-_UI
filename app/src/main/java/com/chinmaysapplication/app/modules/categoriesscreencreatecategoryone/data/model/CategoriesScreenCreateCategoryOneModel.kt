package com.chinmaysapplication.app.modules.categoriesscreencreatecategoryone.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CategoriesScreenCreateCategoryOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreatenewcate: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_new_cate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryname: String? = MyApp.getInstance().resources.getString(R.string.lbl_category_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryicon: String? = MyApp.getInstance().resources.getString(R.string.lbl_category_icon)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategorycolor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_category_color)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchBarValue: String? = null
)
