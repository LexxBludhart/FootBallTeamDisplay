package edu.dixietech.bradc.footballcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import edu.dixietech.bradc.footballcompose.view.DetailScreen
import edu.dixietech.bradc.footballcompose.view.TeamListScreen
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel


// Using raamcosta's DestinationNavigation instead


//@Composable
//fun FootballNavHost(
//    navController: NavHostController,
//    viewModel: FootballViewModel,
//    modifier: Modifier = Modifier
//) {
//    NavHost(
//        navController = navController,
//        startDestination = Home.route,
//        modifier = modifier
//    ) {
//        composable(route = Home.route) {
//            TeamListScreen(viewModel, modifier,
//                onClickViewTeamDetails = { id ->
//                    navController.navigateToTeamDetails(id)
//                })
//        }
//
//        composable(
//            route = Detail.routeWithArgs,
//            arguments = Detail.arguments
//        ) { backStackEntry ->
//            val teamId = backStackEntry.arguments?.getInt(Detail.teamDetailArg)
//            DetailScreen(viewModel = viewModel, teamId = teamId, modifier = modifier)
////            route?.let { DetailScreen(viewModel, teamId, modifier) }
//        }
//    }
//}
//
//private fun NavHostController.navigateToTeamDetails(teamId: Int) {
//    this.navigate("${Detail.route}/$teamId")
//}