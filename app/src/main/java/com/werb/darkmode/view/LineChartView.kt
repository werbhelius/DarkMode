package com.werb.darkmode.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

/**
 * Created by wanbo on 2020/2/29.
 */
class LineChartView: View {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    private val bgPaint: Paint = Paint().also {
        it.color = Color.BLUE
        it.strokeWidth = 4f
        it.isAntiAlias = true
    }

    private val linePaint = Paint().also {
        it.color = Color.BLUE
        it.strokeWidth = 4f
        it.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawLine(0f, height * 0.3f, width * 0.1f, height * 3 / 4f, bgPaint)
    }

}