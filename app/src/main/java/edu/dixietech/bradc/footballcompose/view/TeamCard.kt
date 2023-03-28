package edu.dixietech.bradc.footballcompose.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import edu.dixietech.bradc.footballcompose.model.Team
import edu.dixietech.bradc.footballcompose.view.destinations.DetailScreenDestination
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@Composable
fun TeamCard(
    navigator: DestinationsNavigator,
    viewModel: FootballViewModel,
    team: Team
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .height(128.dp)
//            .background(color = Color(team.color.first()))
            .background(brush = Brush.verticalGradient(
                colors = team.colors.map { Color(it) }
            ))
            .clickable {
                navigator.navigate(
                    DetailScreenDestination(team.id)
//                    DetailScreenDestination(navigator, viewModel, team.id, Modifier)
                )
//                onClickViewTeamDetails(team.id)
            }
    ) {
        Text(
            modifier = Modifier
                .padding(32.dp)
                .align(Alignment.Center),
            text = team.name,
            color = Color.White,
            fontSize = 24.sp
        )
    }
}
