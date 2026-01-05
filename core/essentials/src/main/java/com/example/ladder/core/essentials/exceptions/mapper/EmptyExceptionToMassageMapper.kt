package com.example.ladder.core.essentials.exceptions.mapper

class EmptyExceptionToMassageMapper: ExceptionToMassageMapper {
    override fun getLocalizedMassage(exception: Exception): String {
        return exception.message ?: "Unknown error"
    }
}