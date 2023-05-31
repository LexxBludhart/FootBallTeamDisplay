package edu.dixietech.bradc.footballcompose.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel


@Destination
@Composable
fun DetailScreen(
    viewModel: FootballViewModel = hiltViewModel(),
    teamId: Int?
) {
    val team = viewModel.nflTeams.first { it.id == teamId }
    val modifier = Modifier.fillMaxSize()

    Surface(modifier = modifier) {
        GradientView(colorValues = team.colors)

        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Image(
                painter = rememberAsyncImagePainter(team.logoUrl),
                contentDescription = "NFL team image",
                modifier = Modifier
                    .wrapContentSize()
                    .wrapContentHeight()
                    .wrapContentWidth()
            )

            Text(
                team.name,
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

//@Composable
//fun GradientView(colorValues: Array<Long>) {
//    val colors = colorValues.map { Color(it) }
//
//    val largeRadialGradient = object : ShaderBrush() {
//        override fun createShader(size: Size): Shader {
//            val biggerDimension = maxOf(size.height, size.width)
//            return RadialGradientShader(
//                colors = colors,
//                center = size.center,
//                radius = biggerDimension / 2f,
////                colorStops = listOf(0f, 0.95f)
//            )
//        }
//    }
//
////    val parentSize = parentLayoutCoordinates?.size?.toSize()?: Size.Zero
//
////    Box(modifier = modifier.diagonalGradientBorder(colors, 300.0F)) // TODO: Parent Width???
//    Box(modifier = Modifier.background(largeRadialGradient)
//    )
//}

//fun Modifier.diagonalGradientBorder(
//    colors: List<Color>,
//    width: Float,
//    offset: Float = 0f
//) = background(
//    Brush.horizontalGradient(
//        colors,
//        startX = -offset,
//        endX = width - offset,
//        tileMode = TileMode.Repeated
//    )
//)

//fun Modifier.diagonalGradientBorder(
//    colors: List<Color>,
//    borderSize: Dp = 2.dp,
//    shape: Shape
//) = border(
//    width = borderSize,
//    brush = Brush.linearGradient(colors),
//    shape = shape
//)

//fun Modifier.verticalGradientBackground(
//    colors: LongArray
//) = drawWithCache {
//    val gradient = VerticalGradient(startY = 0.0f, endY = size.width, colors = colors)
//    onDraw {
//        drawRect(brush = gradient)
//    }
//}