package edu.dixietech.bradc.footballcompose.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<FootballViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FootballApp(viewModel = viewModel)
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    FootballComposeTheme {
//    }
//}