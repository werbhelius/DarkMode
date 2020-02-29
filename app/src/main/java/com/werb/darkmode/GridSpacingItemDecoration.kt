package com.werb.darkmode

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration


/**
 * Created by wanbo on 2020/2/29.
 */

class GridSpacingItemDecoration(
    private val spanCount: Int,
    private val spacing: Int
) :
    ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {

        val position = parent.getChildAdapterPosition(view)
        val column = position % spanCount

        outRect.left = spacing - column * spacing / spanCount
        outRect.right = (column + 1) * spacing / spanCount

        outRect.bottom = spacing

        if (position < spanCount) {
            outRect.top = spacing
        }
    }

}