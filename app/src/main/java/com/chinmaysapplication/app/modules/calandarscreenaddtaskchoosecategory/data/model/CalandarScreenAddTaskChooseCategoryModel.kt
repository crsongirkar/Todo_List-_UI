package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.`data`.model

import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CalandarScreenAddTaskChooseCategoryModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChooseCategory: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_choose_category)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateNew: String? = MyApp.getInstance().resources.getString(R.string.lbl_create_new)

)
