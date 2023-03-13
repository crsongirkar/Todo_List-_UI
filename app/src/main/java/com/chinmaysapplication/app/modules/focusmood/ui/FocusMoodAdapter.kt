package com.chinmaysapplication.app.modules.focusmood.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowFocusMoodBinding
import com.chinmaysapplication.app.modules.focusmood.`data`.model.FocusMoodRowModel
import kotlin.Int
import kotlin.collections.List

class FocusMoodAdapter(
  var list: List<FocusMoodRowModel>
) : RecyclerView.Adapter<FocusMoodAdapter.RowFocusMoodVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFocusMoodVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_focus_mood,parent,false)
    return RowFocusMoodVH(view)
  }

  override fun onBindViewHolder(holder: RowFocusMoodVH, position: Int) {
    val focusMoodRowModel = FocusMoodRowModel()
    // TODO uncomment following line after integration with data source
    // val focusMoodRowModel = list[position]
    holder.binding.focusMoodRowModel = focusMoodRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FocusMoodRowModel>) {
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
      item: FocusMoodRowModel
    ) {
    }
  }

  inner class RowFocusMoodVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFocusMoodBinding = RowFocusMoodBinding.bind(itemView)
  }
}
