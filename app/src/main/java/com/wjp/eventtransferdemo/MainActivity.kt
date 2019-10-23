package com.wjp.eventtransferdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent

class MainActivity : AppCompatActivity() {

    val TAG = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


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
