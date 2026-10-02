package com.example.c001apk.util

object EmojiUtil {

    fun getEmoji(emoji: String): Int {
        if (!PrefManager.showEmoji) {
            return -1
        }
        return EmojiUtils.emojiMap[emoji] ?: -1
    }

}
