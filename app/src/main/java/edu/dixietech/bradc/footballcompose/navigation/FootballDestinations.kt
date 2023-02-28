package edu.dixietech.bradc.footballcompose.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

interface ViewDestination {
    val route: String
}

object Home : ViewDestination {
    override val route = "home"
}

object Detail : ViewDestination {
    override val route = "team_details"
    const val teamDetailArg = "team_id"
    val routeWithArgs = "$route/{$teamDetailArg}"
    val arguments = listOf(navArgument(teamDetailArg) { type = NavType.IntType}
    )
}

val allScreens = listOf(Home, Detail)
