package com.example.chatbot.utils

import android.annotation.SuppressLint
import com.example.chatbot.utils.Constants.OPEN_GOOGLE
import com.example.chatbot.utils.Constants.OPEN_NEWS
import com.example.chatbot.utils.Constants.OPEN_SEARCH
import com.example.chatbot.utils.Constants.OPEN_YOUTUBE
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.*

object BotResponse {

    @SuppressLint("SimpleDateFormat")
    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message = _message.lowercase(Locale.getDefault())

        return when {

            //Flips a coin
            message.contains("flip") && message.contains("coin") -> {
                val r = (0..1).random()
                val result = if (r == 0) "heads" else "tails"

                "I flipped a coin and it landed on $result"
            }

            message.contains("hi") -> {
                when (random) {
                    0 -> "Hello there!"
                    1 -> "hi"
                    2 -> "hi,how are you?"
                    else -> "error" }
            }
            message.contains("hello") -> {
                when (random) {
                    0 -> "Hello there!"
                    1 -> "Hello"
                    2 -> "Hello,how are you?"
                    else -> "error" }
            }

            message.contains("what's up") -> {
                when (random) {
                    0 -> "Not much, you?"
                    else -> "error" }
            }
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm doing fine, thanks!"
                    1 -> "Happy and content, thank you"
                    2 -> "Pretty good! How about you?"
                    else -> "error"
                }
            }
                message.contains("i am fine") -> {
                    when (random) {
                        0 -> "That's great"
                        else -> "error"
                    }
                }
            message.contains("i am good") -> {
                when (random) {
                    0 -> "That's great"
                    else -> "error"
                }
            }


            message.contains("time") && message.contains("?")-> {
                val timeStamp = Timestamp(System.currentTimeMillis())
                val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm")
                val date = sdf.format(Date(timeStamp.time))

                date.toString()
            }


            message.contains("open") && message.contains("google")-> {
                OPEN_GOOGLE
            }
            message.contains("open") && message.contains("youtube")-> {
                OPEN_YOUTUBE
            }

            message.contains("search")-> {
                OPEN_SEARCH
            }
            message.contains("today's") && message.contains("news")-> {
                OPEN_NEWS
            }

            else -> {
                when (random) {
                    0 -> "Sorry, I don't understand..."
                    1 -> "Try asking me something different"
                    2 -> "Idk"
                    else -> "error"
                }
            }
        }
    }
}