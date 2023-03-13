package com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowListsunBinding
import com.chinmaysapplication.app.modules.homescreenaddtasktaskalarm.`data`.model.ListsunRowModel
import kotlin.Int
import kotlin.collections.List

class ListsunAdapter(
  var list: List<ListsunRowModel>
) : RecyclerView.Adapter<ListsunAdapter.RowListsunVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsunVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsun,parent,false)
    return RowListsunVH(view)
  }

  override fun onBindViewHolder(holder: RowListsunVH, position: Int) {
    val listsunRowModel = ListsunRowModel()
    // TODO uncomment following line after integration with data source
    // val listsunRowModel = list[position]
    holder.binding.listsunRowModel = listsunRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsunRowModel>) {
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
      item: ListsunRowModel
    ) {
    }
  }

  inner class RowListsunVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsunBinding = RowListsunBinding.bind(itemView)
  }
}
