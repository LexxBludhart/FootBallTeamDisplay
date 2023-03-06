package edu.dixietech.bradc.footballcompose.view

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
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import edu.dixietech.bradc.footballcompose.R
import edu.dixietech.bradc.footballcompose.navigation.FootballNavHost
import edu.dixietech.bradc.footballcompose.ui.theme.FootballComposeTheme
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@ExperimentalMaterial3Api
@Composable
fun FootballApp(viewModel: FootballViewModel, modifier: Modifier = Modifier) {
    FootballComposeTheme {
        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val coroutineScope = rememberCoroutineScope()

        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "Football is life!",
                            color = Color.White
                        )
                    },
                    navigationIcon = {
                        if (navController.previousBackStackEntry != null) {
                            IconButton(onClick = {
                                navController.navigateUp()
                            }) {
                                Icon(Icons.Rounded.ArrowBack, stringResource(R.string.content_description_back), tint = MaterialTheme.colorScheme.onPrimary)
                            }
                        }
                    },
                    colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary),
                )
            },
            ) { innerPadding ->
            FootballNavHost(navController, viewModel, Modifier.padding(innerPadding))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(controller: NavHostController) {
    TopAppBar(
        title = {
            Text(stringResource(id = R.string.app_name), color = MaterialTheme.colorScheme.onPrimary)
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = MaterialTheme.colorScheme.primary),
        navigationIcon = {
            if (controller.previousBackStackEntry != null) {
                IconButton(onClick = {
                    controller.navigateUp()
                }) {
                    Icon(Icons.Rounded.ArrowBack, stringResource(id = R.string.content_description_back), tint = MaterialTheme.colorScheme.onPrimary)
                }
            }
        },
//        actions = {
//            IconButton(onClick = { controller.navigate(Help.route) }) {
//                Icon(Icons.Outlined.Info, stringResource(R.string.content_description_help), tint = MaterialTheme.colorScheme.onPrimary)
//            }
//        }
    )
}

//@Composable
//fun DisplayList(items: List<Team>) {
//    LazyColumn(modifier = Modifier.fillMaxSize(1F)) {
//        items(items) { item ->
//            print("Team: ${item}")
//            ListItem(item = item)
//        }
//    }
//}
