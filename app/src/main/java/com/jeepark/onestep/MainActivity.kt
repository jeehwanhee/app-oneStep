package com.jeepark.onestep

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jeepark.onestep.ui.screens.AuthScreen
import com.jeepark.onestep.ui.screens.InitScreen
import com.jeepark.onestep.ui.theme.OneStepTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            OneStepTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyNavGraph()
                }
            }
        }
    }
}

@Composable
fun MyNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "init") {

        composable(route = "init") {
            InitScreen(
                onNavigateToAuth = {
                    navController.navigate("auth") {
                        popUpTo("init") { inclusive = true }
                    }
                },
                onNavigateToMain = {
                    navController.navigate("main") {
                        popUpTo("init") { inclusive = true }
                    }
                }
            )
        }

        composable(route = "auth") {
            AuthScreen(
                onNavigateToMain = {
                    navController.navigate("main") {
                        popUpTo("auth") { inclusive = true }
                    }
                },
                onNavigateToInitQuestion = {
                    navController.navigate("InitQuestion") {
                        popUpTo("auth") { inclusive = true }
                    }
                }
            )
        }

        composable(route = "InitQuestion") {
        }



        composable(route = "main") {

        }
    }
}