package com.example.ladder.core.common.android.logger

import android.content.Context
import com.example.ladder.core.common.android.R
import com.example.ladder.core.essentials.resources.CoreStringProvider
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class CoreStringProviderImpl @Inject constructor(
    @ApplicationContext private val context: Context
) : CoreStringProvider {
    override val connectionErrorMassage =
        context.getString(R.string.connection_error_massage)
    override val unknownErrorMassage = context.getString(R.string.unknown_error_massage)

    override fun backendErrorMassage(code: Int, backendMessage: String) =
        context.getString(R.string.backend_error_massage, code, backendMessage)
}