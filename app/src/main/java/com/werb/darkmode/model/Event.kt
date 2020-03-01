package com.werb.darkmode.model

import androidx.recyclerview.widget.DiffUtil

/**
 * Created by wanbo on 2020/2/29.
 */
data class Event(val title: String, val data: String, val desc: String = "") {

    var isShowLineChart: Boolean = false
    var isShowBarChart: Boolean = false
    var isError = false

}

object EventDiffCallback : DiffUtil.ItemCallback<Event>() {
    override fun areItemsTheSame(oldItem: Event, newItem: Event) = oldItem.title == newItem.title && oldItem.data == newItem.data
    override fun areContentsTheSame(oldItem: Event, newItem: Event) = oldItem == newItem
}