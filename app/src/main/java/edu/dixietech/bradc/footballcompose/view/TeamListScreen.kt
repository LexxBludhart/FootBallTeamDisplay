package edu.dixietech.bradc.footballcompose.view

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
import edu.dixietech.bradc.footballcompose.constants.Constants
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@Composable
fun TeamListScreen(
    viewModel: FootballViewModel,
    modifier: Modifier,
    onClickViewTeamDetails: (Int) -> Unit = {}
) {
    Surface(modifier = modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) { // Color(0xFF006666)) {// MaterialTheme.colorScheme.background) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            val divisions = viewModel.nflDivisions
            val teams = viewModel.nflTeams

            divisions.forEach { division ->
                DivisionCard(divisionName = division.name)

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

