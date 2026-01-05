package com.example.ladder.core.essentials.resources

interface CoreStringProvider : StringProvider {
    val connectionErrorMassage: String
    val unknownErrorMassage: String
    fun backendErrorMassage(code: Int, backendMessage: String): String
}