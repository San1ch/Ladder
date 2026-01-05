package com.example.ladder.core.essentials.exceptions.mapper

import javax.inject.Inject

interface ExceptionToMassageMapper {
    fun getLocalizedMassage(exception: Exception): String

    companion object : ExceptionToMassageMapper {
        private var instance: ExceptionToMassageMapper = EmptyExceptionToMassageMapper()

        override fun getLocalizedMassage(exception: Exception): String {
            return instance.getLocalizedMassage(exception)
        }

        fun set(mapper: ExceptionToMassageMapper){
            instance = mapper
        }

        fun reset(){
            instance = EmptyExceptionToMassageMapper()
        }
    }
}