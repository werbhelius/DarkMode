package com.werb.darkmode.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import androidx.core.graphics.ColorUtils
import com.werb.darkmode.R

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
        it.color = ColorUtils.setAlphaComponent(resources.getColor(R.color.colorPrimary), 30)
        it.strokeWidth = 4.5f
        it.isAntiAlias = true
    }

    private val linePaint = Paint().also {
        it.color = resources.getColor(R.color.colorPrimary)
        it.strokeWidth = 4.5f
        it.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawLine(1f, height * 0.3f, width * 0.05f, height * 0.65f, bgPaint)

        canvas?.drawLine(width * 0.05f, height * 0.65f, width * 0.10f, height * 0.75f, bgPaint)

        canvas?.drawLine(width * 0.10f, height * 0.75f, width * 0.12f, height * 0.55f, bgPaint)

        canvas?.drawLine(width * 0.12f, height * 0.55f, width * 0.17f, height * 0.75f, bgPaint)

        canvas?.drawLine(width * 0.17f, height * 0.75f, width * 0.22f, height * 0.71f, bgPaint)

        canvas?.drawLine(width * 0.22f, height * 0.71f, width * 0.24f, height * 0.90f, bgPaint)

        canvas?.drawLine(width * 0.24f, height * 0.90f, width * 0.28f, height * 0.7f, bgPaint)

        canvas?.drawLine(width * 0.28f, height * 0.7f, width * 0.32f, height * 0.71f, bgPaint)

        canvas?.drawLine(width * 0.32f, height * 0.71f, width * 0.38f, height * 0.56f, bgPaint)

        canvas?.drawLine(width * 0.38f, height * 0.56f, width * 0.5f, height * 0.61f, bgPaint)

        canvas?.drawLine(width * 0.5f, height * 0.61f, width * 0.52f, height * 0.68f, bgPaint)

        canvas?.drawLine(width * 0.52f, height * 0.68f, width * 0.53f, height * 0.62f, bgPaint)

        canvas?.drawLine(width * 0.53f, height * 0.62f, width * 0.57f, height * 0.635f, bgPaint)

        canvas?.drawLine(width * 0.57f, height * 0.635f, width * 0.6f, height * 0.5f, bgPaint)

        canvas?.drawLine(width * 0.6f, height * 0.5f, width * 0.68f, height * 0.44f, bgPaint)

        canvas?.drawLine(width * 0.68f, height * 0.44f, width * 0.72f, height * 0.54f, bgPaint)

        canvas?.drawLine(width * 0.72f, height * 0.54f, width * 0.76f, height * 0.32f, bgPaint)

        canvas?.drawLine(width * 0.76f, height * 0.32f, width * 0.9f, height * 0.22f, bgPaint)

        canvas?.drawLine(width * 0.9f, height * 0.22f, width * 0.92f, height * 0.28f, bgPaint)



        canvas?.drawLine(1f, height * 0.3f, width * 0.05f, height * 0.65f, linePaint)

        canvas?.drawLine(width * 0.05f, height * 0.65f, width * 0.10f, height * 0.75f, linePaint)

        canvas?.drawLine(width * 0.10f, height * 0.75f, width * 0.12f, height * 0.55f, linePaint)

        canvas?.drawLine(width * 0.12f, height * 0.55f, width * 0.17f, height * 0.75f, linePaint)

        canvas?.drawLine(width * 0.17f, height * 0.75f, width * 0.22f, height * 0.71f, linePaint)

        canvas?.drawLine(width * 0.22f, height * 0.71f, width * 0.24f, height * 0.90f, linePaint)

        canvas?.drawLine(width * 0.24f, height * 0.90f, width * 0.28f, height * 0.7f, linePaint)

        canvas?.drawLine(width * 0.28f, height * 0.7f, width * 0.32f, height * 0.71f, linePaint)

        canvas?.drawLine(width * 0.32f, height * 0.71f, width * 0.38f, height * 0.56f, linePaint)

        canvas?.drawLine(width * 0.38f, height * 0.56f, width * 0.5f, height * 0.61f, linePaint)

        canvas?.drawLine(width * 0.5f, height * 0.61f, width * 0.52f, height * 0.68f, linePaint)

        canvas?.drawLine(width * 0.52f, height * 0.68f, width * 0.53f, height * 0.62f, linePaint)

        canvas?.drawLine(width * 0.53f, height * 0.62f, width * 0.57f, height * 0.635f, linePaint)

        canvas?.drawLine(width * 0.57f, height * 0.635f, width * 0.6f, height * 0.5f, linePaint)

        canvas?.drawLine(width * 0.6f, height * 0.5f, width * 0.68f, height * 0.44f, linePaint)

        canvas?.drawLine(width * 0.68f, height * 0.44f, width * 0.72f, height * 0.54f, linePaint)

        canvas?.drawLine(width * 0.72f, height * 0.54f, width * 0.76f, height * 0.32f, linePaint)

        canvas?.drawLine(width * 0.76f, height * 0.32f, width * 0.83f, height * 0.27f, linePaint)


    }

}