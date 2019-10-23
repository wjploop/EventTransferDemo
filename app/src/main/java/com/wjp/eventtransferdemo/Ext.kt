package com.wjp.eventtransferdemo

import android.util.Log

fun log(text: String) {


    Log.d("wolf", text)
}

fun log(tag: String, text: String) {


    Log.d(tag, text)
}

fun Int.name(): String {
    return when (this) {
        0 -> "down"
        1 -> "up"
        2 -> "move"
        3 -> "cancel"
        4 -> "outside"
        else -> "unknown"
    }
}

