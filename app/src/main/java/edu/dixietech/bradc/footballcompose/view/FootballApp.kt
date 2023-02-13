package edu.dixietech.bradc.footballcompose.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.dixietech.bradc.footballcompose.ui.theme.FootballComposeTheme
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@Composable
fun FootballApp(viewModel: FootballViewModel, modifier: Modifier = Modifier) {
    FootballComposeTheme {
        Surface(modifier = modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                viewModel.league.keys.forEach { divisionName ->
                    val teamList = viewModel.league[divisionName]
                    Text(
                        divisionName,
                        modifier = Modifier.align(CenterHorizontally),
                        fontSize = 36.sp,
                        fontWeight = Bold
                    )

                    teamList?.forEach { team ->
                        ListItem(team)
                    }

                    Spacer(Modifier.size(16.dp))
                }
            }
        }
    }
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
