package edu.dixietech.bradc.footballcompose.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.dixietech.bradc.footballcompose.model.Team
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

@Composable
fun DetailScreen(
    viewModel: FootballViewModel,
    teamId: Int?
) {
    val team = viewModel.nflTeams.first { it.id == teamId }

    Surface(
        modifier = Modifier.fillMaxSize(),
        ) {
        GradientView(colorValues = team.colors)
        Spacer(modifier = Modifier)
        Text(
            team.name,
            textAlign = TextAlign.Center,
            color = Color.White,
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier)

    }

//        .background(
//            brush = Brush.verticalGradient(
//                colors = item.colors.map { Color(it) }
//            )
//        )

}

@Composable
fun GradientView(modifier: Modifier = Modifier, colorValues: Array<Long>) {
    val colors = colorValues.map { Color(it) }

//    val parentSize = parentLayoutCoordinates?.size?.toSize()?: Size.Zero

    Box(modifier = modifier.diagonalGradientBorder(colors, 300.0F)) // TODO: Parent Width???
}

fun Modifier.diagonalGradientBorder(
    colors: List<Color>,
    width: Float,
    offset: Float = 0f
) = background(
    Brush.horizontalGradient(
        colors,
        startX = -offset,
        endX = width - offset,
        tileMode = TileMode.Mirror
    )
)

fun Modifier.diagonalGradientBorder(
    colors: List<Color>,
    borderSize: Dp = 2.dp,
    shape: Shape
) = border(
    width = borderSize,
    brush = Brush.linearGradient(colors),
    shape = shape
)

//fun Modifier.verticalGradientBackground(
//    colors: LongArray
//) = drawWithCache {
//    val gradient = VerticalGradient(startY = 0.0f, endY = size.width, colors = colors)
//    onDraw {
//        drawRect(brush = gradient)
//    }
//}