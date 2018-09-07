package com.example.android.firemessage.recyclerview.item

import android.content.Context
import com.example.android.firemessage.R
import com.example.android.firemessage.glide.GlideApp
import com.example.android.firemessage.model.User
import com.example.android.firemessage.util.StorageUtil
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.item_person.*

class PersonItem (val person: User,
                  val userId: String,
                  private val context: Context)
    :Item(){
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.textView_name.text = person.name
        viewHolder.textView_bio.text = person.bio
        if (person.profilePicturePath != null){
            GlideApp.with(context)
                    .load(StorageUtil.pathToReference(person.profilePicturePath))
                    .placeholder(R.drawable.ic_account_circle_black_24dp)
                    .into(viewHolder.imageView_profile_picture)
        }
    }

    override fun getLayout() = R.layout.item_person
}