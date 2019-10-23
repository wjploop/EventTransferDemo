package com.wjp.eventtransferdemo

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import android.widget.SimpleAdapter

class EventTransferActivity : ListActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data = listOf<String>(
            "三层View（Activity->ViewGroup->View）",
            "ScrollView嵌套"
        ).map {
            mapOf("action" to it)
        }
        listAdapter = SimpleAdapter(
            this, data, android.R.layout.simple_list_item_1, arrayOf("action"),
            intArrayOf(android.R.id.text1)
        )

    }

    override fun onListItemClick(l: ListView?, v: View?, position: Int, id: Long) {
        when (position) {
            0 -> toAct(MainActivity::class.java)
            1 -> toAct(ScrollViewInnerAct::class.java)
        }
    }

    fun toAct(clazz: Class<*>) {
        startActivity(Intent(this, clazz))
    }

}
