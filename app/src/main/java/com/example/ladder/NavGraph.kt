package com.example.ladder
/*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ladder.screens.main.MainScreen
import com.example.ladder.screens.main.words.WordsMainScreen
import kotlinx.coroutines.CoroutineScope

@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope(),
    appNavigationActions: AppNavigationActions = AppNavigationActions(navController),
    startDestination: String = AppDestinations.MAIN,
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(
            AppDestinations.MAIN
        ) { entry ->
            MainScreen(
                onWordsClick = { appNavigationActions.navigateToWordsMain() },
                onLearnClick = {  }
            )
        }

        composable(
            AppDestinations.WORDS_MAIN
        ) { entry ->
            WordsMainScreen(onBack = { appNavigationActions.navigateToMain() })
        }
    }
}

*/
