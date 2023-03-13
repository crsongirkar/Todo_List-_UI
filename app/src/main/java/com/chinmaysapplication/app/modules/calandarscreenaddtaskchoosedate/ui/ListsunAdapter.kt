package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowListsun2Binding
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosedate.`data`.model.Listsun2RowModel
import kotlin.Int
import kotlin.collections.List

class ListsunAdapter(
  var list: List<Listsun2RowModel>
) : RecyclerView.Adapter<ListsunAdapter.RowListsun2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsun2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsun2,parent,false)
    return RowListsun2VH(view)
  }

  override fun onBindViewHolder(holder: RowListsun2VH, position: Int) {
    val listsun2RowModel = Listsun2RowModel()
    // TODO uncomment following line after integration with data source
    // val listsun2RowModel = list[position]
    holder.binding.listsun2RowModel = listsun2RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listsun2RowModel>) {
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
      item: Listsun2RowModel
    ) {
    }
  }

  inner class RowListsun2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsun2Binding = RowListsun2Binding.bind(itemView)
  }
}
