package com.example.ladder.core.common.android.logger

import android.app.Application
import com.example.ladder.core.essentials.exceptions.mapper.ExceptionToMassageMapper
import com.example.ladder.core.essentials.logger.Logger
import timber.log.Timber
import javax.inject.Inject

abstract class AbstractApplication : Application() {

    @Inject
    lateinit var logger: Logger

    @Inject
    lateinit var exceptionToMassageMapper: ExceptionToMassageMapper

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
        Logger.set(logger)
        ExceptionToMassageMapper.set(exceptionToMassageMapper)
    }
}