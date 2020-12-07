package com.jianastero.project_ui.ui

import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jianastero.project_ui.enumeration.orientation
import com.jianastero.project_ui.toView

internal fun <T> RecyclerView.apply(adapterList: AdapterList<T>) = this.ui(adapterList) { recyclerView ->

    val listAdapter: ListAdapter<T, RecyclerView.ViewHolder> = object : ListAdapter<T, RecyclerView.ViewHolder>(
        object : DiffUtil.ItemCallback<T>() {
            override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = oldItem == newItem

            override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = oldItem.hashCode() == newItem.hashCode()
        }
    ) {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
            object : RecyclerView.ViewHolder(
                RelativeLayout(context)
                    .also {
                        it.layoutParams = ViewGroup.LayoutParams(
                            ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT
                        )
                    }
            ) { }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val item: T = currentList[holder.adapterPosition]
            val ui: UI = adapterList._ui(item)
            val view: View = ui.toView(context)
            (holder.itemView as RelativeLayout).let {
                it.removeAllViews()
                it.addView(view)
                adapterList._onItemClick?.let { onItemClick ->
                    view.setOnClickListener {
                        onItemClick(item)
                    }
                }
            }
        }
    }

    val gridLayoutManager: GridLayoutManager = GridLayoutManager(context, 1).also {
        it.orientation = adapterList.direction.orientation
    }

    layoutManager = gridLayoutManager
    adapter = listAdapter

    listAdapter.submitList(adapterList.items)
}