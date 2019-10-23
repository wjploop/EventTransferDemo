package com.wjp.eventtransferdemo

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class WantToHandlerMoveEventView  @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    val TAG = WantToHandlerMoveEventView::class.java.simpleName



    override fun onTouchEvent(event: MotionEvent): Boolean {
        log(TAG, "onTouchEvent:${event.actionMasked.name() }")

        return true
    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        log(TAG, "dispatchTouchEvent:${event.actionMasked.name() }")

        return super.dispatchTouchEvent(event)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(1000,6000)
    }
}