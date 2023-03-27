package edu.dixietech.bradc.footballcompose.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush

@Composable
fun GradientView(colorValues: Array<Long>) {
    val colors = colorValues.map { Color(it) }

    val radialGradient = object : ShaderBrush() {
        override fun createShader(size: Size): Shader {
            val biggestSide = maxOf(size.height, size.width)

            return RadialGradientShader(
                colors = colors,
                center = size.center,
                radius = biggestSide / 2f
//                colorStops = listOf() // numItems must match color items
            )
        }
    }

    Box(modifier = Modifier.background(radialGradient))
}
