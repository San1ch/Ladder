package com.example.ladder.features.init.presentation

import android.content.Context
import com.example.ladder.features.init.domain.InitStringProvider
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class InitStringProviderImpl @Inject constructor(
    @ApplicationContext private val context: Context,
) : InitStringProvider {
    override val exceptionExample: String
        get() = context.getString(R.string.exception_example)


}