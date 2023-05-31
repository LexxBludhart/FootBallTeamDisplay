package edu.dixietech.bradc.footballcompose.view

import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import edu.dixietech.bradc.footballcompose.constants.Constants
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@RootNavGraph(start = true)
@Destination
@Composable
fun TeamListScreen(
    navigator: DestinationsNavigator,
    viewModel: FootballViewModel = hiltViewModel()
) {
    val modifier = Modifier.fillMaxSize()

    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            val divisions = viewModel.nflDivisions
            val teams = viewModel.nflTeams

            divisions.forEach { division ->
                DivisionCard(divisionName = division.name)

                teams.filter { filterTeam ->
                    filterTeam.divisionId == division.id
                }.forEach { team ->
                    key(team.id) {
                        TeamCard(navigator, team)
                    }
                }

                Spacer(Modifier.size(16.dp))
            }
        }
    }
}
