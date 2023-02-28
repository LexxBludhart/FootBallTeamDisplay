package edu.dixietech.bradc.footballcompose.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

interface FootballDestination {
    val route: String
}

object Home : FootballDestination {
    override val route = "home"
}

object Team : FootballDestination {
    override val route = "team"
    const val divisionNameArg = "division_name"
    const val teamArg = "team_id"
    val routeWithArgs = "$route/{$divisionNameArg/$teamArg}"
    val arguments = listOf(
        navArgument(divisionNameArg) { type = NavType.StringType},
        navArgument(teamArg) { type = NavType.StringType}
    )
}

val allScreens = listOf(Home, Team)
