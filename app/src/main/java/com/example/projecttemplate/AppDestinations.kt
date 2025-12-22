package com.example.projecttemplate


import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

/**
 * Screens used in [AppDestinations]
 */
private object AppScreens {
}

/**
 * Arguments used in [AppDestinations] routes
 */
object AppDestinationsArgs {
}

/**
 * Destinations used in the [AppActivity]
 */
object AppDestinations {
}

/**
 * Models the navigation actions in the app.
 */
class AppNavigationActions(private val navController: NavHostController) {
    fun navigateTo() {
        /*navController.navigate(AppDestinations.) {
            // Pop up to a specific destination in the back stack
            // inclusive = true → removes the destination itself too
            // inclusive = false → removes everything up to it but keeps the destination
            popUpTo(navController.graph.findStartDestination().id) {
                inclusive = false  // change as needed
                saveState = true   // preserve state of popped screens
            }
            // Prevent creating multiple instances of the same screen at the top
            launchSingleTop = true

            // Restore state if screen was previously in back stack and saved
            restoreState = true

            // enterTransition / exitTransition
        }*/
    }

}
