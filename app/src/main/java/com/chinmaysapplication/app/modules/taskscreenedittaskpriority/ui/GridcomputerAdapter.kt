package com.chinmaysapplication.app.modules.taskscreenedittaskpriority.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowGridcomputer1Binding
import com.chinmaysapplication.app.modules.taskscreenedittaskpriority.`data`.model.Gridcomputer1RowModel
import kotlin.Int
import kotlin.collections.List

class GridcomputerAdapter(
  var list: List<Gridcomputer1RowModel>
) : RecyclerView.Adapter<GridcomputerAdapter.RowGridcomputer1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridcomputer1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridcomputer1,parent,false)
    return RowGridcomputer1VH(view)
  }

  override fun onBindViewHolder(holder: RowGridcomputer1VH, position: Int) {
    val gridcomputer1RowModel = Gridcomputer1RowModel()
    // TODO uncomment following line after integration with data source
    // val gridcomputer1RowModel = list[position]
    holder.binding.gridcomputer1RowModel = gridcomputer1RowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridcomputer1RowModel>) {
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
      item: Gridcomputer1RowModel
    ) {
    }
  }

  inner class RowGridcomputer1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridcomputer1Binding = RowGridcomputer1Binding.bind(itemView)
  }
}
