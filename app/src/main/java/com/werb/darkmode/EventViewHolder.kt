package com.werb.darkmode

import androidx.recyclerview.widget.RecyclerView
import com.werb.darkmode.databinding.LayoutItemBinding
import com.werb.darkmode.model.Event
import com.werb.darkmode.utils.getColorFromAttr

/**
 * Created by wanbo on 2020/2/29.
 */
class EventViewHolder(private val binding: LayoutItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(event: Event) {
        binding.event = event
        if (event.isError) {
            binding.cardView.setCardBackgroundColor(binding.root.context.getColorFromAttr(R.attr.colorError))
            binding.data.setTextColor(binding.root.context.getColorFromAttr(R.attr.colorOnError))
            binding.desc.setTextColor(binding.root.context.getColorFromAttr(R.attr.colorOnError))
            binding.title.setTextColor(binding.root.context.getColorFromAttr(R.attr.colorOnError))
        } else {
            binding.cardView.setCardBackgroundColor(binding.root.context.getColorFromAttr(R.attr.colorSurface))
            binding.data.setTextColor(binding.root.context.getColorFromAttr(R.attr.colorOnSurface))
            binding.desc.setTextColor(binding.root.context.getColorFromAttr(R.attr.colorOnSurface))
            binding.title.setTextColor(binding.root.context.getColorFromAttr(R.attr.colorOnSurface))
        }
    }

}