package com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chinmaysapplication.app.R
import com.chinmaysapplication.app.databinding.RowListvector2Binding
import com.chinmaysapplication.app.modules.calandarscreenaddtaskchoosecategory.`data`.model.Listvector2RowModel
import kotlin.Int
import kotlin.collections.List

class ListvectorAdapter(
  var list: List<Listvector2RowModel>
) : RecyclerView.Adapter<ListvectorAdapter.RowListvector2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListvector2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listvector2,parent,false)
    return RowListvector2VH(view)
  }

  override fun onBindViewHolder(holder: RowListvector2VH, position: Int) {
    val listvector2RowModel = Listvector2RowModel()
    // TODO uncomment following line after integration with data source
    // val listvector2RowModel = list[position]
    holder.binding.listvector2RowModel = listvector2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listvector2RowModel>) {
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
      item: Listvector2RowModel
    ) {
    }
  }

  inner class RowListvector2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListvector2Binding = RowListvector2Binding.bind(itemView)
  }
}
