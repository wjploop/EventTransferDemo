package com.wjp.eventtransferdemo

import android.app.Activity
import android.os.Bundle
import android.view.MotionEvent

class ScrollViewInnerAct:Activity() {

    val TAG = ScrollViewInnerAct::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_scrollview_inner)
    }



    override fun dispatchTouchEvent(ev: MotionEvent): Boolean {
        log(TAG, "dispatchTouchEvent:${ev.actionMasked.name() }")
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        log(TAG, "onTouchEvent:${event.actionMasked.name() }")
        return super.onTouchEvent(event)
    }
}