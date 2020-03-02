package com.werb.darkmode.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Created by wanbo on 2020/2/29.
 */
object EventStore {

    private val allEvents = mutableListOf<Event>(
        Event("Marketing", "123.4M"),
        Event("Conversion", "537", "+22% of target").apply { isShowBarChart = true },
        Event("Conversion", "432.1M", "+12.3% of target").apply { isShowLineChart = true },
        Event("Error", "N/A", "No data available").apply { isError = true },
        Event("Sales", "345.8M", "+11% of target"),
        Event("User", "45.5M"),
        Event("Avg.session", "4:53 H", "+56.6% of target").apply { isShowLineChart = true },
        Event("Sessions", "23,242").apply { isShowBarChart = true },
        Event("Bounce rate", "12%"),
        Event("PageViews", "36")
    )

    private val _events: MutableLiveData<List<Event>> = MutableLiveData()
    val events: LiveData<List<Event>>
        get() = _events

    init {
        _events.value = allEvents
    }

}