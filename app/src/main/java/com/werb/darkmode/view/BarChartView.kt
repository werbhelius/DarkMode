package com.werb.darkmode.view

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import com.werb.darkmode.R

/**
 * Created by wanbo on 2020/3/1.
 */
class BarChartView: View {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    private val path = Path()

    private val linePaint = Paint().apply {
        color = resources.getColor(R.color.colorPrimaryDark)
        strokeWidth = 4.5f
        isAntiAlias = true
    }

    private val radii = floatArrayOf(
        6f, 6f,
        6f, 6f,
        0f, 0f,
        0f, 0f
    )

    private val barWidth: Float
        get() {
            return  width / 10f
        }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        path.reset()
        path.addRoundRect(RectF(0f, height * 0.9f, barWidth, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(barWidth + 5, height * 0.8f, 2 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(2 * barWidth + 10, height * 0.7f, 3 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(3 * barWidth + 10, height * 0.6f, 4 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(4 * barWidth + 10, height * 0.3f, 5 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(5 * barWidth + 10, height * 0.45f, 6 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(6 * barWidth + 10, height * 0.5f, 7 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(7 * barWidth + 10, height * 0.2f, 8 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

        path.reset()
        path.addRoundRect(RectF(8 * barWidth + 10, height * 0.3f, 9 * barWidth + 5, height.toFloat()), radii, Path.Direction.CW)
        canvas?.drawPath(path, linePaint)

    }
}