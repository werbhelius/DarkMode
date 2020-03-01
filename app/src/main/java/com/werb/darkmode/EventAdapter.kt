package com.werb.darkmode

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.werb.darkmode.databinding.LayoutItemBinding
import com.werb.darkmode.model.Event
import com.werb.darkmode.model.EventDiffCallback

/**
 * Created by wanbo on 2020/2/29.
 */
class EventAdapter(private val list: List<Event>): RecyclerView.Adapter<EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(
            LayoutItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}