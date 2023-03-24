package com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowGridcomputer2Binding
import com.chinmaysapplication.app.modules.calandarscreenaddtasktaskpriority.`data`.model.Gridcomputer2RowModel
import kotlin.Int
import kotlin.collections.List

class GridcomputerAdapter(
  var list: List<Gridcomputer2RowModel>
) : RecyclerView.Adapter<GridcomputerAdapter.RowGridcomputer2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridcomputer2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridcomputer2,parent,false)
    return RowGridcomputer2VH(view)
  }

  override fun onBindViewHolder(holder: RowGridcomputer2VH, position: Int) {
    val gridcomputer2RowModel = Gridcomputer2RowModel()
    // TODO uncomment following line after integration with data source
    // val gridcomputer2RowModel = list[position]
    holder.binding.gridcomputer2RowModel = gridcomputer2RowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Gridcomputer2RowModel>) {
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
      item: Gridcomputer2RowModel
    ) {
    }
  }

  inner class RowGridcomputer2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridcomputer2Binding = RowGridcomputer2Binding.bind(itemView)
  }
}
