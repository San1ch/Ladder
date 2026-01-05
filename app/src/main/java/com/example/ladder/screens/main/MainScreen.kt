package com.example.ladder.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.ladder.util.MainTopBar
import com.example.ladder.R

@Composable
fun MainScreen(
    onWordsClick: () -> Unit,
    onLearnClick: () -> Unit,
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            MainTopBar()
        }
    ) { paddingValues ->

        MainContent(
            modifier = Modifier.padding(paddingValues),
            onWordsClick = onWordsClick,
            onLearnClick = onLearnClick
        )
    }
}

//-------------------------------------------//
// TODO: Need to add choice of language to translate and program language
//-------------------------------------------//

@Composable
fun MainContent(
    onWordsClick: () -> Unit,
    onLearnClick: () -> Unit,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        Button(onClick = onWordsClick) {
            Text(text = stringResource(R.string.words))
        }
        Button(onClick = onLearnClick) {
            Text(text = stringResource(R.string.learn))
        }
    }
}
