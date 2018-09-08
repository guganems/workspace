package com.example.android.firemessage.model

data class ChatChannel(val userIds: MutableList<String>) {
    constructor() : this(mutableListOf())
}