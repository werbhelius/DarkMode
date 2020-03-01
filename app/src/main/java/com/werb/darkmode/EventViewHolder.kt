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
        if (event.isError) {
            binding.cardView.setCardBackgroundColor(binding.root.resources.getColor(R.color.colorError))
            binding.data.setTextColor(binding.root.resources.getColor(R.color.colorOnError))
            binding.desc.setTextColor(binding.root.resources.getColor(R.color.colorOnError))
            binding.title.setTextColor(binding.root.resources.getColor(R.color.colorOnError))
        } else {
            binding.cardView.setCardBackgroundColor(binding.root.resources.getColor(R.color.colorSurface))
            binding.data.setTextColor(binding.root.resources.getColor(R.color.colorOnSurface))
            binding.desc.setTextColor(binding.root.resources.getColor(R.color.colorOnSurface))
            binding.title.setTextColor(binding.root.resources.getColor(R.color.colorOnSurface))
        }
    }

}