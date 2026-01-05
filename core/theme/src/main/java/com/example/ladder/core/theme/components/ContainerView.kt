package com.example.ladder.core.theme.components

import androidx.compose.runtime.Composable
import com.elveum.container.Container


@Composable
fun <T> ContainerView(
    container: Container<T>,
    content: @Composable (T) -> Unit
) {

}