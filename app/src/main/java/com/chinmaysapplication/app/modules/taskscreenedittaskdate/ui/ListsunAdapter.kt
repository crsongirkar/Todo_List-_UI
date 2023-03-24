package com.chinmaysapplication.app.modules.taskscreenedittaskdate.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowListsun1Binding
import com.chinmaysapplication.app.modules.taskscreenedittaskdate.`data`.model.Listsun1RowModel
import kotlin.Int
import kotlin.collections.List

class ListsunAdapter(
  var list: List<Listsun1RowModel>
) : RecyclerView.Adapter<ListsunAdapter.RowListsun1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsun1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsun1,parent,false)
    return RowListsun1VH(view)
  }

  override fun onBindViewHolder(holder: RowListsun1VH, position: Int) {
    val listsun1RowModel = Listsun1RowModel()
    // TODO uncomment following line after integration with data source
    // val listsun1RowModel = list[position]
    holder.binding.listsun1RowModel = listsun1RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsun1RowModel>) {
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
      item: Listsun1RowModel
    ) {
    }
  }

  inner class RowListsun1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsun1Binding = RowListsun1Binding.bind(itemView)
  }
}
