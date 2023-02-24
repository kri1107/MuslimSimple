/*
package com.androweed.muslimsimple

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.SurfaceHolder
import android.view.SurfaceView

class CompassView (context: Context?, attrs: AttributeSet?) : SurfaceView(context, attrs), SurfaceHolder.Callback {

    private val surfaceHolder = holder
    private lateinit var canvas: Canvas
    private val paint = Paint()

    // Override these methods to draw compass
    override fun surfaceCreated(holder: SurfaceHolder?) {
        // Initialize paint and canvas
        paint.isAntiAlias = true
        paint.color = Color.WHITE
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 2f
    }

    override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {
        // Not used
    }

    override fun surfaceDestroyed(holder: SurfaceHolder?) {
        // Not used
    }

    // Draw the compass on the canvas
    fun drawCompass(degrees: Float) {
        if (surfaceHolder.surface.isValid) {
            // Lock the canvas
            canvas = surfaceHolder.lockCanvas()
            canvas.drawColor(Color.BLACK)

            // Draw the compass arrow
            val centerX = canvas.width / 2f
            val centerY = canvas.height / 2f
            canvas.rotate(-degrees, centerX, centerY)
            canvas.drawLine(centerX, centerY - 100, centerX, centerY + 100, paint)

            // Unlock and post the canvas
            surfaceHolder.unlockCanvasAndPost(canvas)
        }
    }
}*/
