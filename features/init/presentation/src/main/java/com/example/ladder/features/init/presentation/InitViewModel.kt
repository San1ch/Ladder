package com.example.ladder.features.init.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.elveum.container.Container
import com.elveum.container.containerMap
import com.elveum.container.successContainer
import com.example.ladder.core.essentials.exceptions.mapper.ExceptionToMassageMapper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.SharingStarted

interface GetNamesUseCase {
    operator fun invoke(): Flow<Container<List<String>>>
}

@HiltViewModel
class InitViewModel @Inject constructor(
    private val exceptionToMassageMapper: ExceptionToMassageMapper,
    private val getNamesUseCase: GetNamesUseCase
) : ViewModel() {

    val stateFlow: StateFlow<Container<State>> = getNamesUseCase
        .invoke()
        .containerMap {
            State(it)
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(1000),
            successContainer(State(emptyList()))
        )

    data class State(
        val names: List<String>
        )
}
