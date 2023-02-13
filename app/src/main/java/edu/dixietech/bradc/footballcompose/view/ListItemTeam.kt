package edu.dixietech.bradc.footballcompose.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.dixietech.bradc.footballcompose.model.Team

@Composable
fun ListItem(item: Team) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .height(128.dp)
            // Single Color
//            .background(color = Color(item.colors.first()))
            // All Colors
            .background(
                brush = Brush.verticalGradient(
                    colors = item.colors.map { Color(it) }
                )
            )
    ) {
        Text(
            modifier = Modifier.padding(32.dp).align(Center),
            text = item.name,
            color = Color.White,
            fontSize = 24.sp
        )
    }
}