package com.example.ladder.util

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.ladder.R
import com.example.ladder.ui.theme.AppTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StandardTopAppBar(
    title: String,
    navigationIcon: @Composable () -> Unit = { } , actions: @Composable RowScope.() -> Unit = { }) {
    CenterAlignedTopAppBar(
        title = { Text(title) },
        navigationIcon = navigationIcon,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary,
            titleContentColor = MaterialTheme.colorScheme.onPrimary
        ),
        actions = {
            actions()
        }
    )
}

@Composable
fun MainTopBar() {
    StandardTopAppBar(
        title = stringResource(R.string.app_name),
    )
}

@Composable
fun WordsTopBar(onBack: () -> Unit) {
    StandardTopAppBar(
        title = stringResource(R.string.words_vocab_menu),
        navigationIcon = {
            IconButton(onClick = onBack) {
                Icon(
                    Icons.AutoMirrored.Filled.ArrowBack,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    contentDescription = stringResource(R.string.back)
                )
            }
        }
    )
}

@Preview
@Composable
fun MainTopBarPreview() {
    AppTheme {
        MainTopBar()
    }
}

@Preview
@Composable
fun WordsTopBarPreview() {
    AppTheme {
        WordsTopBar(onBack = { })
    }
}
