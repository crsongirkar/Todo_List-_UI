package com.chinmaysapplication.app.modules.taskscreeneditcategory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowListvector1Binding
import com.chinmaysapplication.app.modules.taskscreeneditcategory.`data`.model.Listvector1RowModel
import kotlin.Int
import kotlin.collections.List

class ListvectorAdapter(
  var list: List<Listvector1RowModel>
) : RecyclerView.Adapter<ListvectorAdapter.RowListvector1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvector1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvector1,parent,false)
    return RowListvector1VH(view)
  }

  override fun onBindViewHolder(holder: RowListvector1VH, position: Int) {
    val listvector1RowModel = Listvector1RowModel()
    // TODO uncomment following line after integration with data source
    // val listvector1RowModel = list[position]
    holder.binding.listvector1RowModel = listvector1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listvector1RowModel>) {
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
      item: Listvector1RowModel
    ) {
    }
  }

  inner class RowListvector1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvector1Binding = RowListvector1Binding.bind(itemView)
  }
}
