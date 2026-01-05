package com.example.ladder.features.init.presentation.di

import com.example.ladder.core.essentials.resources.StringProvider
import com.example.ladder.features.init.domain.InitStringProvider
import com.example.ladder.features.init.presentation.InitStringProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
@InstallIn
interface InitStringResourceModule {
    @Binds
    @IntoMap
    @ClassKey(InitStringProvider::class)
    fun bindInitStringProvider(initStringProviderImpl: InitStringProviderImpl): StringProvider
}