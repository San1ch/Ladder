package com.example.ladder.core.essentials.exceptions

import com.example.ladder.core.essentials.resources.CoreStringProvider
import com.example.ladder.core.essentials.resources.StringProvider
import com.example.ladder.core.essentials.resources.StringProviderStore

abstract class AppException(
    massage: String,
    cause: Throwable? = null
) : Exception(massage, cause) {
}

abstract class CoreAppException(
    massage: String,
    cause: Throwable? = null
) : AppException(massage, cause), WithLocalizedMassage{
    override fun getLocalizedErrorMassage(stringProviderStore: StringProviderStore): String {
        return getLocalizedErrorMassage(stringProviderStore<CoreStringProvider>())
    }

    abstract fun getLocalizedErrorMassage(stringProviderStore: CoreStringProvider): String
}

class UnknownException : AppException("Unknown error")

class ConnectionException(cause: Throwable? = null) : CoreAppException("Network error", cause) {
    override fun getLocalizedErrorMassage(stringProvider: CoreStringProvider): String {
        return stringProvider.connectionErrorMassage
    }
}

class BackendException(
    httpCode: Int = 400,
    backendMessage: String = "",
    cause: Throwable? = null
) : AppException("Server error", cause)