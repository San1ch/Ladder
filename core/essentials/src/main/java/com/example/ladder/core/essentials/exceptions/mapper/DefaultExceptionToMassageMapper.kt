package com.example.ladder.core.essentials.exceptions.mapper

import com.example.ladder.core.essentials.exceptions.WithLocalizedMassage
import com.example.ladder.core.essentials.resources.CoreStringProvider
import com.example.ladder.core.essentials.resources.StringProvider
import com.example.ladder.core.essentials.resources.StringProviderStore
import javax.inject.Inject

class DefaultExceptionToMassageMapper @Inject constructor(
    private val stringProviderStore: StringProviderStore
) : ExceptionToMassageMapper {

    override fun getLocalizedMassage(exception: Exception): String {
        return if (exception is WithLocalizedMassage) {
            exception.getLocalizedErrorMassage(stringProviderStore)
        } else {
            stringProviderStore<CoreStringProvider>().unknownErrorMassage
        }
    }

}