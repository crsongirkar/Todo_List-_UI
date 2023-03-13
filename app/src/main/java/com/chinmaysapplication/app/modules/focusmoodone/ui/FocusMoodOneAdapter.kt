package com.chinmaysapplication.app.modules.focusmoodone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowFocusMoodOneBinding
import com.chinmaysapplication.app.modules.focusmoodone.`data`.model.FocusMoodOneRowModel
import kotlin.Int
import kotlin.collections.List

class FocusMoodOneAdapter(
  var list: List<FocusMoodOneRowModel>
) : RecyclerView.Adapter<FocusMoodOneAdapter.RowFocusMoodOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFocusMoodOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_focus_mood_one,parent,false)
    return RowFocusMoodOneVH(view)
  }

  override fun onBindViewHolder(holder: RowFocusMoodOneVH, position: Int) {
    val focusMoodOneRowModel = FocusMoodOneRowModel()
    // TODO uncomment following line after integration with data source
    // val focusMoodOneRowModel = list[position]
    holder.binding.focusMoodOneRowModel = focusMoodOneRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FocusMoodOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: FocusMoodOneRowModel
    ) {
    }
  }

  inner class RowFocusMoodOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFocusMoodOneBinding = RowFocusMoodOneBinding.bind(itemView)
  }
}
