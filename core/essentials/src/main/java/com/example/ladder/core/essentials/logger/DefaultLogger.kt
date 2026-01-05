package com.example.ladder.core.essentials.logger

object DefaultLogger : Logger {
    override fun d(message: String) {
        println("Debug: $message")
    }

    override fun e(exception: Exception, message: String) {
        println("ERROR: $message")
        exception.printStackTrace()
    }
}