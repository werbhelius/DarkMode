package com.werb.darkmode

import androidx.recyclerview.widget.RecyclerView
import com.werb.darkmode.databinding.LayoutItemBinding
import com.werb.darkmode.model.Event

/**
 * Created by wanbo on 2020/2/29.
 */
class EventViewHolder(private val binding: LayoutItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(event: Event) {
        binding.event = event
    }

}