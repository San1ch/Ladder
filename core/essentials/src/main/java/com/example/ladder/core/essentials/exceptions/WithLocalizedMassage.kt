package com.example.ladder.core.essentials.exceptions

import com.example.ladder.core.essentials.resources.StringProviderStore

interface WithLocalizedMassage {
    fun getLocalizedErrorMassage(stringProviderStore: StringProviderStore): String
}