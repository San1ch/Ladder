package com.example.ladder.core.common.android.logger.di

import com.example.ladder.core.common.android.logger.AndroidLogger
import com.example.ladder.core.common.android.logger.CoreStringProviderImpl
import com.example.ladder.core.essentials.exceptions.mapper.DefaultExceptionToMassageMapper
import com.example.ladder.core.essentials.exceptions.mapper.ExceptionToMassageMapper
import com.example.ladder.core.essentials.logger.Logger
import com.example.ladder.core.essentials.resources.CoreStringProvider
import com.example.ladder.core.essentials.resources.StringProvider
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
@InstallIn(SingletonComponent::class)
interface CommonAndroidModule {

    @Binds
    fun bindLogger(
        impl: AndroidLogger
    ): Logger

    @Binds
    @IntoMap
    @ClassKey(CoreStringProvider::class)
    fun bindCoreStringProvider(
        impl: CoreStringProviderImpl
    ): StringProvider

    @Binds
    fun bindExceptionToMassageMapper(
        impl: DefaultExceptionToMassageMapper
    ): ExceptionToMassageMapper


}