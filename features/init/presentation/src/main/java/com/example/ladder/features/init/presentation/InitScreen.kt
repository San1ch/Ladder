package com.example.ladder.features.init.presentation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.elveum.container.Container
import com.example.ladder.features.init.presentation.InitViewModel.State
import androidx.compose.runtime.getValue
import com.example.ladder.core.theme.components.ContainerView


@Composable
fun InitScreen(
) {
    val viewModel: InitViewModel = hiltViewModel()
    val container: Container<State> by viewModel.stateFlow.collectAsState()
    ContainerView(
        container = container
    ) { state ->
        InitContent(state)
    }
}

@Composable
fun InitContent(
    state: State
) {
    if (state.names.isEmpty()) {
        Text(text = "No names")
    } else {
        Text(text = "Names count: ${state.names.size}")
    }

}