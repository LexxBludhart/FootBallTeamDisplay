package edu.dixietech.bradc.footballcompose.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@Composable
fun TeamListScreen(
    viewModel: FootballViewModel,
    modifier: Modifier,
    onClickViewTeamDetails: (Int) -> Unit = {}
) {
    Surface(modifier = modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            val divisions = viewModel.nflDivisions
            val teams = viewModel.nflTeams

            divisions.forEach { division ->
                Text(
                    division.name,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold
                )

                teams.filter { team ->
                    team.divisionId == division.id
                }.forEach { team ->
                    key(team.id) {
                        ListItem(item = team, onClickViewTeamDetails)
                     }
                }
            }

            Spacer(Modifier.size(16.dp))
        }
    }
}
