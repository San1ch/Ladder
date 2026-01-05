package com.example.ladder.screens.main.words

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ladder.util.NavItem
import com.example.ladder.util.WordsTopBar
/*

@Composable
fun WordsMainScreen(onBack: () -> Unit, selectedIndex: Int = 0) {

    var selectedIndex by remember { mutableIntStateOf(selectedIndex) }
    val navItems = listOf(
        NavItem(
            "Card list",
            Icons.AutoMirrored.Filled.List
        ) { modifier -> WordsMainTagsContent(modifier) },
        NavItem(
            "Tags",
            Icons.Default.Tag
        ) { modifier -> WordsMainCardsContent(modifier) }
    )


    //-------------------------------------------//
    // Scaffold
    //-------------------------------------------//
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            WordsTopBar(onBack = onBack)
        },
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface,
                tonalElevation = 0.dp,
            ) {
                navItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        icon = { Icon(item.icon, contentDescription = item.label) },
                        label = { Text(item.label) },
                        selected = index == selectedIndex,
                        onClick = { selectedIndex = index },
                    )
                }
            }
        }
    ) { paddingValues ->
        navItems[selectedIndex].content(Modifier.padding(paddingValues))
    }
}

@Composable
private fun WordsMainTagsContent(modifier: Modifier) {
    Column(modifier = modifier) {
        LazyColumn() {

        }
        LazyColumn() {

        }
    }
}

@Composable
private fun WordsMainCardsContent(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = "Unsorted cards")
    }
}

@Preview
@Composable
fun WordsMainScreenDecksPreview() {
    WordsMainScreen(onBack = { }, selectedIndex = 0)
}

@Preview
@Composable
fun WordsMainScreenCardsPreview() {
    WordsMainScreen(onBack = { }, selectedIndex = 1)
}
*/
