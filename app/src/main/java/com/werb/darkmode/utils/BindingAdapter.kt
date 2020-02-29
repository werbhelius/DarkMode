package com.werb.darkmode.utils

import android.view.View
import androidx.databinding.BindingAdapter

/**
 * Created by wanbo on 2020/2/29.
 */

@BindingAdapter("goneIf")
fun View.bindGoneIf(gone: Boolean) {
    visibility = if (gone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}