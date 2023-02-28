package edu.dixietech.bradc.footballcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.dixietech.bradc.footballcompose.view.HomeScreen
import edu.dixietech.bradc.footballcompose.view.TeamScreen
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@Composable
fun FootballNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    val viewModel = FootballViewModel()

    NavHost(
        navController = navController,
        startDestination = Home.route,
        modifier = modifier
    ) {
        composable(route = Home.route) {
            HomeScreen(
                viewModel,
                onClickTeam = { teamId ->
                    navController.navigateToTeam(teamId)
                },
                modifier = modifier
            )
        }

        composable(
            route = Team.routeWithArgs,
            arguments = Team.arguments
        ) { backStackEntry ->
            val divisionName = backStackEntry.arguments?.getString(Team.divisionNameArg)
            val teamId = backStackEntry.arguments?.getString(Team.teamArg)

            if (divisionName != null) {
                TeamScreen(viewModel = viewModel, division = divisionName, teamId = teamId)
            }

//            TeamScreen(viewModel = viewModel, teamId = teamId)
//            route?.let { TeamScreen(viewModel, it, modifier) }
        }
    }
}


fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) {
        // Pop up to the start destination of the graph to
        // avoid building up a large stack of destinations
        // on the back stack as users select items
        popUpTo(
            this@navigateSingleTopTo.graph.findStartDestination().id
        ) {
            saveState = true
        }
        // Avoid multiple copies of the same destination when re-selecting the same item
        launchSingleTop = true
        // Restore state when re-selecting a previously selected item
        restoreState = true
    }

private fun NavHostController.navigateToTeam(division: String, teamId: String) {
    this.navigate("${Team.route}/$division/$teamId")
}
