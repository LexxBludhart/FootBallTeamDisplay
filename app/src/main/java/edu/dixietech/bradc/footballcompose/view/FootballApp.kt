package edu.dixietech.bradc.footballcompose.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import edu.dixietech.bradc.footballcompose.R
import edu.dixietech.bradc.footballcompose.ui.theme.FootballComposeTheme
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@ExperimentalMaterial3Api
@Composable
fun FootballApp() {
    FootballComposeTheme {
        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val coroutineScope = rememberCoroutineScope()

        Scaffold(
            topBar = {
                TopBar(navController)
            },
            floatingActionButton =  {

            },
            bottomBar = {

            },
        )  { innerPadding ->
            DestinationsNavHost(navGraph = NavGraphs.root)
//            FootballNavHost(navController, viewModel = viewModel, modifier = modifier.padding(top = 24.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navController: NavHostController) {
    TopAppBar(
        title = {
            Text(
                text = "Football is love, Football is life.",
                color = Color.White
            )
        },
        navigationIcon = {
            if (navController.previousBackStackEntry != null) {
                IconButton(onClick = { navController.navigateUp() }) {
                    Icon(Icons.Rounded.ArrowBack, stringResource(R.string.back_button), tint = MaterialTheme.colorScheme.onPrimary)
                }
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primary)
    )
}


// No longer needed via raamcosta's destinations
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun TopBar(controller: NavHostController) {
//    TopAppBar(
//        title = {
//            Text(stringResource(id = R.string.app_name), color = MaterialTheme.colorScheme.onPrimary)
//        },
//        colors = TopAppBarDefaults.topAppBarColors(containerColor = MaterialTheme.colorScheme.primary),
//        navigationIcon = {
//            if (controller.previousBackStackEntry != null) {
//                IconButton(onClick = {
//                    controller.navigateUp()
//                }) {
//                    Icon(Icons.Rounded.ArrowBack, stringResource(id = R.string.content_description_back), tint = MaterialTheme.colorScheme.onPrimary)
//                }
//            }
//        },
////        actions = {
////            IconButton(onClick = { controller.navigate(Help.route) }) {
////                Icon(Icons.Outlined.Info, stringResource(R.string.content_description_help), tint = MaterialTheme.colorScheme.onPrimary)
////            }
////        }
//    )
//}

//@Composable
//fun DisplayList(items: List<Team>) {
//    LazyColumn(modifier = Modifier.fillMaxSize(1F)) {
//        items(items) { item ->
//            print("Team: ${item}")
//            ListItem(item = item)
//        }
//    }
//}
