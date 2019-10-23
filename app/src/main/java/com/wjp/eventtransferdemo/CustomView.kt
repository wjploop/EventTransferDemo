package com.wjp.eventtransferdemo

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    val TAG = CustomView::class.java.simpleName

    override fun onTouchEvent(event: MotionEvent): Boolean {
        log(TAG, "onTouchEvent:${event.actionMasked.name() }")
        return super.onTouchEvent(event)

    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        log(TAG, "dispatchTouchEvent:${event.actionMasked.name() }")

        return super.dispatchTouchEvent(event)
    }
}