package com.chinmaysapplication.app.modules.categoriesscreenchoosecategory.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListvectorRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGrocery: String? = MyApp.getInstance().resources.getString(R.string.lbl_grocery)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWork: String? = MyApp.getInstance().resources.getString(R.string.lbl_work)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSport: String? = MyApp.getInstance().resources.getString(R.string.lbl_sport)

)
