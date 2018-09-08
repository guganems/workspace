package com.example.android.firemessage.recyclerview.item

import android.content.Context
import com.example.android.firemessage.R
import com.example.android.firemessage.model.TextMessage
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder

class TextMessageItem(val message: TextMessage,
                      val context: Context)
    : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        //TODO: placeholder bind
    }

    override fun getLayout() = R.layout.item_text_message
}