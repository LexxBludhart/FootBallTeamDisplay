package edu.dixietech.bradc.footballcompose.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.Modifier
import edu.dixietech.bradc.footballcompose.view_model.FootballViewModel

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<FootballViewModel>()

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FootballApp(
                viewModel = viewModel,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}
