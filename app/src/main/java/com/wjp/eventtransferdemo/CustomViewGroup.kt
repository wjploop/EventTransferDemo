package com.wjp.eventtransferdemo

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.ViewGroup

class CustomViewGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ViewGroup(context, attrs, defStyleAttr) {

    val TAG = CustomViewGroup::class.java.simpleName
    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val child = getChildAt(0)
        child.layout(0,0,300,300)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        log(TAG, "onInterceptTouchEvent:${ev.actionMasked.name() }")

        return false
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        log(TAG, "onTouchEvent:${event.actionMasked.name() }")

        return true
    }

    override fun dispatchTouchEvent(event: MotionEvent): Boolean {
        log(TAG, "dispatchTouchEvent:${event.actionMasked.name() }")

        return super.dispatchTouchEvent(event)
    }


}