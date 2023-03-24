package com.chinmaysapplication.app.modules.taskscreenedittaskone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowListlocation1Binding
import com.chinmaysapplication.app.modules.taskscreenedittaskone.`data`.model.Listlocation1RowModel
import kotlin.Int
import kotlin.collections.List

class ListlocationAdapter(
  var list: List<Listlocation1RowModel>
) : RecyclerView.Adapter<ListlocationAdapter.RowListlocation1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlocation1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlocation1,parent,false)
    return RowListlocation1VH(view)
  }

  override fun onBindViewHolder(holder: RowListlocation1VH, position: Int) {
    val listlocation1RowModel = Listlocation1RowModel()
    // TODO uncomment following line after integration with data source
    // val listlocation1RowModel = list[position]
    holder.binding.listlocation1RowModel = listlocation1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listlocation1RowModel>) {
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
      item: Listlocation1RowModel
    ) {
    }
  }

  inner class RowListlocation1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlocation1Binding = RowListlocation1Binding.bind(itemView)
  }
}
